package jeu421.modele;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LancéTest {
    private Lancé lancé ;


    @Before
    public void setUp() {
       lancé = new Lancé();
    }


    @Test
    public void ajouterJet() throws Exception {

        lancé.ajouterJet(1);
        Assert.assertEquals("la liste doit être de taille 1", 1, lancé.listeDeLancés.size());
        Assert.assertEquals("la valeur doit être  1", 1, lancé.valeurJet(0));

        lancé.ajouterJet(2);
        Assert.assertEquals("la liste doit être de taille 2", 2, lancé.listeDeLancés.size());
        Assert.assertEquals("la valeur doit être  2", 2, lancé.valeurJet(1));

    }


    @Test
    public void ajouterJetsOrdonnésCroissants() throws Exception {

        for (int i = 1; i < 6; i++) {
            lancé.ajouterJet(i);
            Assert.assertEquals("la liste doit être de taille " + i, i, lancé.listeDeLancés.size());
            Assert.assertEquals("la valeur doit être  "+i, i, lancé.valeurJet(i-1));

        }

    }

    @Test
    public void ajouterJetsOrdonnésDéCroissants() throws Exception {

        for (int i = 1; i < 6; i++) {
            lancé.ajouterJet(7-i);
            Assert.assertEquals("la liste doit être de taille " + i, i, lancé.listeDeLancés.size());
            Assert.assertEquals("la valeur doit être  "+(7-i), 7-i, lancé.valeurJet(0)); // toujours ajouté en premier
        }

    }


    @Test
    public void ajouterJet3MêmesValeurs() throws Exception {

        for (int i = 1; i <= 3; i++) {
            lancé.ajouterJet(2);
            Assert.assertEquals("la liste doit être de taille " + i, i, lancé.listeDeLancés.size());
            Assert.assertEquals("la valeur doit être  "+i, 2, lancé.valeurJet(i-1));

        }
    }

    @Test
    public void enDernierQuiSePlaceEnAvantDernier()     throws Exception {
        for (int i = 1; i <= 3; i++) {
            lancé.ajouterJet(2);
            Assert.assertEquals("la liste doit être de taille " + i, i, lancé.listeDeLancés.size());
            Assert.assertEquals("la valeur doit être  "+i, 2, lancé.valeurJet(i-1));

        }

        lancé.ajouterJet(6);
        Assert.assertEquals("la liste doit être de taille " + 4, 4, lancé.listeDeLancés.size());
        Assert.assertEquals("la valeur doit être  "+6, 6, lancé.valeurJet(4-1));


        lancé.ajouterJet(5);
        Assert.assertEquals("la liste doit être de taille " + 5, 5, lancé.listeDeLancés.size());
        Assert.assertEquals("la valeur doit être  "+5, 5, lancé.valeurJet(4-1));
        Assert.assertEquals("la valeur doit être  "+6, 6, lancé.valeurJet(5-1)); // nouvelle dernière valeur


    }

}