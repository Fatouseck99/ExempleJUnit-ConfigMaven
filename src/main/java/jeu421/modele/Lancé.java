package jeu421.modele;

import java.util.ArrayList;

public class Lancé {

    class Couple {
        int valeur = 0;
        boolean retenu = false;

        public Couple() {
            this(0, false);
        }

        public Couple(int valeur) {
                this(valeur, false);
        }

        public Couple(int valeur, boolean retenu) {
            this.valeur = valeur;
            this.retenu = retenu;
        }
    }

    ArrayList<Couple> listeDeLancés = new ArrayList<Couple>();


    public void ajouterJet(int valeur) {
        Couple c = new Couple(valeur);
        int j = 0;
        for(j = 0; j < listeDeLancés.size(); j++) {
            if (c.valeur < listeDeLancés.get(j).valeur) {
                listeDeLancés.add(j, c);
                break; // j sera alors plus petit que la taille de liste
            }
        }

        if (j >= listeDeLancés.size()) {
            listeDeLancés.add(c);
        }

    }

    /**
     *
     * @param i
     * @return
     */
    public boolean estConservé(int i) {
        return listeDeLancés.get(i).retenu;
    }

    public int valeurJet(int i) {
        return listeDeLancés.get(i).valeur;
    }

    public void retenirJet(int i) {
        listeDeLancés.get(i).retenu = true;
    }


}
