package jeu421.joueur;

import jeu421.modele.Lancé;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CoupsTest {
    Lancé lancé;
    Coups coups;

    @Before
    public void setUp() throws Exception {
        coups = new Coups();
        lancé = new Lancé();
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void valeurTesté421() throws Exception {
        lancé.ajouterJet(4);
        lancé.ajouterJet(1);
        lancé.ajouterJet(2);

        int nbJeton = coups.valeurLancé(lancé);

        Assert.assertEquals("valeur attentdue : 10 jetons", 10,nbJeton);
    }


    @Test
    public void valeurTesté111() throws Exception {
        lancé.ajouterJet(1);
        lancé.ajouterJet(1);
        lancé.ajouterJet(1);

        int nbJeton = coups.valeurLancé(lancé);

        Assert.assertEquals("valeur attentdue : 7 jetons", 7,nbJeton);
    }

}