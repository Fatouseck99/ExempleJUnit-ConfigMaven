package jeu421.modele;

import jeu421.joueur.Coups;

import java.util.Random ;

public class Dé {
    private Random générateur = new Random();

    protected void affecterGénérateur(Random générateur) {
        this.générateur = générateur;
    }

    /**
     * méthode qui permet de lancer un dé à 6 faces
     * @return
     */
    public int lancer() {
        return générateur.nextInt(6)+1;
    }


    /**
    public int lancer(int nbFaces) throws Exception {
        Coups c = new Coups();
        return générateur.nextInt(nbFaces)+1;
    }
     */
}
