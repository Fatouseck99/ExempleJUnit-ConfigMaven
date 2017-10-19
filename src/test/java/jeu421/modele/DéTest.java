package jeu421.modele;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.Random ;


import static org.junit.Assert.*;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DéTest {
    @Mock Random random;
    Dé unDé;
    int [] valeurs = {1, 2, 3, 4, 5, 0};

    @Before
    public void setUp() throws Exception {
        unDé = new Dé();
        when(random.nextInt(anyInt())).thenReturn(1, 2, 3, 4, 5, 0);
    }

    @Test
    public void lancer() throws Exception {
        int résultatDuDé = unDé.lancer();
        assertTrue("le résultat est plus grand ou égal que 1", résultatDuDé >= 1);
        assertTrue("le résultat est plus petit ou égal que 6", résultatDuDé <= 6);
    }

    @Test
    public void lancerAvecMockito() throws Exception {
        unDé.affecterGénérateur(random);
        for(int i = 0; i < 6; i++) {
            int résultatDuDé = unDé.lancer();
            assertEquals("le résultat est plus grand ou égal que 1", valeurs[i]+1, résultatDuDé);
            assertTrue("le résultat est plus grand ou égal que 1", résultatDuDé >= 1);
            assertTrue("le résultat est plus petit ou égal que 6", résultatDuDé <= 6);
        }
    }



}