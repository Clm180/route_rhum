package observateur;

import java.io.Serializable;
import java.util.*;

public class DirectionCourse implements Observable{
    List<Observateur> listeObservateurs;
    List<Abandon> listeAbandons;

    public DirectionCourse(){
        listeObservateurs = new LinkedList<>();
        listeAbandons = new LinkedList<>();
    }

    public void enregistreObservateur(Observateur observateur){
        listeObservateurs.add(observateur);
    };

    public void desenregistreObservateur(Observateur observateur){
        listeObservateurs.remove(observateur);
    };

    public void informeObservateurs(){
        for(Observateur observateur : listeObservateurs){
            observateur.actualise(this);
        }
    };

    public Abandon getDerniereAbandon(){
        return listeAbandons.getLast();
    }

    public void simuleationCourse(HashSet<Abandon>lesAbandons){
        for(Iterator<Abandon> i = lesAbandons.iterator(); i.hasNext();){
            listeAbandons.add(i.next());
            informeObservateurs();
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
