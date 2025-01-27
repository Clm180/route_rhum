package td7;

import td5.Voilier;

import java.util.ArrayList;

public abstract class InscriptionVoilier {
    ArrayList inscriptions = new ArrayList();

    public abstract Voilier factoryMethod(String nomVoilier, Classe categorie);

    public void enregistrement(Voilier vo) {
        inscriptions.add(vo);
    }
}
