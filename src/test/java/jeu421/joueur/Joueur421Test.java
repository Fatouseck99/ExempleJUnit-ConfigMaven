package jeu421.joueur;

import jeu421.modele.Dé;
import jeu421.modele.Lancé;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Joueur421Test {
    @Mock Dé monDé ;


    @Test
    public void jouer() throws Exception {
        when(monDé.lancer()).thenReturn(4,2,1);

        Joueur421 joueur = new Joueur421();
        joueur.setDé(monDé);

        Lancé lancé = joueur.jouer(3);

        for(int i=0; i<3; i++) Assert.assertTrue(lancé.estConservé(i));
    }


    @Ignore
    @Test
    public void jouer111() throws Exception {
        when(monDé.lancer()).thenReturn(1,1,1);

        Joueur421 joueur = new Joueur421();
        joueur.setDé(monDé);

        Lancé lancé = joueur.jouer(3);

        for(int i=0; i<3; i++) Assert.assertTrue("le dé est conservé", lancé.estConservé(i));
    }

}