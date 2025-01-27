package observateur;

import td7.Classe;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        HashSet<Abandon> lesAbandons = new HashSet<>();

        lesAbandons.add(new Abandon("Nexans - Art et Fenetres", Classe.IMOCA, "Fabrice AMEDEO"));
        lesAbandons.add(new Abandon("LEYTON", Classe.IMOCA, "SAM GOODCHILD"));
        lesAbandons.add(new Abandon("Bella Donna - Race For Pure Ocean", Classe.RHUMMONO, "Fabrice AMEDEO"));

        DirectionCourse directionCourse = new DirectionCourse();
        Categorie categorie = new Categorie(Classe.IMOCA);
        Categorie categorie1 = new Categorie(Classe.RHUMMONO);


        directionCourse.enregistreObservateur(categorie);
        directionCourse.enregistreObservateur(categorie1);


        directionCourse.simuleationCourse(lesAbandons);

        System.out.println(categorie1);

    }
}
