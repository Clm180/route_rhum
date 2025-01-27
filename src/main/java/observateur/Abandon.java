package observateur;

import td7.Classe;

/**
 * Class Abandon
 * Represents an abandoned sailboat with information about the name, class, and skipper.
 */
public class Abandon {
    /**
     * The name of the sailboat.
     */
    public String nomVoilier;

    /**
     * The class of the sailboat.
     */
    public Classe classeVoilier;

    /**
     * The skipper of the sailboat.
     */
    public String skipper;

    /**
     * Constructor for the Abandon class.
     *
     * @param nomVoilier   The name of the sailboat.
     * @param classeVoilier The class of the sailboat.
     * @param skipper      The skipper of the sailboat.
     */
    public Abandon(String nomVoilier, Classe classeVoilier, String skipper) {
        this.nomVoilier = nomVoilier;
        this.classeVoilier = classeVoilier;
        this.skipper = skipper;
    }

    /**
     * Returns a string representation of the Abandon object.
     *
     * @return A string describing the Abandon object.
     */
    public String toString() {
        return "The name of the sailboat is: " + nomVoilier + " ,the class of the sailboat is: " + classeVoilier + " ,the skipper of the sailboat is: " + skipper;
    }

    /**
     * Returns the class of the sailboat.
     *
     * @return The class of the sailboat.
     */
    public Classe getClasseVoilier() {
        return classeVoilier;
    }
}
