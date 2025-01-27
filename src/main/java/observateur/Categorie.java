package observateur;

import td7.Classe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Categorie implements Observateur {
    public Classe classe;
    public List<Abandon> listeAbandons;

    public Categorie(Classe classe) {
        this.classe = classe;
        listeAbandons = new LinkedList<>();
    }


    public void actualise(Observable observable) {
        DirectionCourse directionCourse = (DirectionCourse) observable;
        Abandon abandon = directionCourse.getDerniereAbandon();
        if(abandon.getClasseVoilier().equals(this.classe)) {
            listeAbandons.add(abandon);
        }

    }

    @Override
    public String toString() {
        return classe.toString() + " " +listeAbandons.size();
    }
}
