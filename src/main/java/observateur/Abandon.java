package observateur;

import td7.Classe;

/**
 * Classe Abandon
 * Représente un voilier abandonné avec des informations sur le nom, la classe et le skipper.
 */
public class Abandon {
    /**
     * Le nom du voilier.
     */
    public String nomVoilier;

    /**
     * La classe du voilier.
     */
    public Classe classeVoilier;

    /**
     * Le skipper du voilier.
     */
    public String skipper;

    /**
     * Constructeur de la classe Abandon.
     *
     * @param nomVoilier   Le nom du voilier.
     * @param classeVoilier La classe du voilier.
     * @param skipper      Le skipper du voilier.
     */
    public Abandon(String nomVoilier, Classe classeVoilier, String skipper) {
        this.nomVoilier = nomVoilier;
        this.classeVoilier = classeVoilier;
        this.skipper = skipper;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Abandon.
     *
     * @return Une chaîne de caractères décrivant l'objet Abandon.
     */
    public String toString() {
        return "Le nom du voilier est : " + nomVoilier + " ,la classe du voilier est : " + classeVoilier + " ,le skipper du voilier est : " + skipper;
    }

    /**
     * Retourne la classe du voilier.
     *
     * @return La classe du voilier.
     */
    public Classe getClasseVoilier() {
        return classeVoilier;
    }
}
