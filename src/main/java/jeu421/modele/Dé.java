package jeu421.modele;

import jeu421.joueur.Coups;

import java.util.Random ;

public class Dé {
    private Random générateur = new Random();

    public int lancer() {
        return générateur.nextInt(6)+1;
    }


    public int lancer(int nbFaces) throws Exception {
        Coups c = new Coups();
        return générateur.nextInt(nbFaces)+1;
    }
}
