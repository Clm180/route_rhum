package td7;

import td5.*;
import td6.Barre;
import td6.Velo;

public class Main {
    public static void main(String[] args) {
        SuivreRoute route1 = new SuivreAlize();

        InscriptionMulti inscriptionMulti = new InscriptionMulti();

        Voilier voilier2 = inscriptionMulti.factoryMethod("groupama", Classe.CLASS40);
        voilier2.setSuivreRoute(route1);
        voilier2.appliqueSuivreRoute();
        System.out.println(voilier2);

        SuivreRoute route2 = new SuivreOrthodromie();
        InscriptionMono inscriptionMono = new InscriptionMono();
        Voilier voilier3 = inscriptionMono.factoryMethod("bnp",Classe.CLASS40);
        voilier3.setSuivreRoute(route2);
        voilier3.appliqueSuivreRoute();
        System.out.println(voilier3);


    }
}