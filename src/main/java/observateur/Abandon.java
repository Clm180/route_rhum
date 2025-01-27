package observateur;

import td7.Classe;

public class Abandon {
    public String nomVoilier;
    public Classe classeVoilier;
    public String skipper;



    public Abandon(String nomVoilier, Classe classeVoilier, String skipper) {
        this.nomVoilier = nomVoilier;
        this.classeVoilier = classeVoilier;
        this.skipper = skipper;
    }

    public String toString() {
        return "Le nom du voilier est : " + nomVoilier +" ,la classe du voilier est : " + classeVoilier+" ,le skipper du voilier est : " + skipper;
    }

    public Classe getClasseVoilier() {
        return classeVoilier;
    }
}
