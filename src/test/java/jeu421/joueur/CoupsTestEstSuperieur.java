package jeu421.joueur;

import jeu421.modele.Lancé;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoupsTestEstSuperieur {
    Lancé grosLancé;
    Lancé petitLancé;
    Lancé petitPlusGros;
    Coups testé;

    @Before
    public void setUp() throws Exception {
        grosLancé = new Lancé();
        grosLancé.ajouterJet(4);
        grosLancé.ajouterJet(2);
        grosLancé.ajouterJet(1);

        petitLancé = new Lancé();
        petitLancé.ajouterJet(3);
        petitLancé.ajouterJet(2);
        petitLancé.ajouterJet(1);

        petitPlusGros = new Lancé();
        petitPlusGros.ajouterJet(6);
        petitPlusGros.ajouterJet(5);
        petitPlusGros.ajouterJet(4);

        testé = new Coups();
    }

    @After
    public void tearDown() throws Exception {
    }


    /**
     * ce test compare 421 à 123
     * puis  654 à 321
     */
    @Test
    public void estSupérieur() {
        boolean supérieur = testé.estSupérieur(grosLancé, petitLancé);
        assertTrue("grosLancé est censé est plus fort", supérieur);

        supérieur = testé.estSupérieur(petitPlusGros, petitLancé);
        assertTrue("petitPlusGros est censé est plus fort", supérieur);
    }

}