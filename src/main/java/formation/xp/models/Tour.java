package formation.xp.models;

import java.util.Random;

public class Tour {

    public int lancer1;
    public int lancer2;
    public int lancer3;

    public Tour() {
        this.lancer1 = -1;
        this.lancer2 = -1;


    }

    public int doLancer1(Joueur joueur) {
        Random rand = new Random();
        int nombreQuillesTombees = rand.nextInt(11);
        this.lancer1 = nombreQuillesTombees;
        return nombreQuillesTombees;

    }

    public int doLancer2(Joueur joueur) {
        Random rand = new Random();
        int nombreQuillesTombees = rand.nextInt(11 - this.lancer1);
        this.lancer2 = nombreQuillesTombees;
        return nombreQuillesTombees;
    }

    public int getLancer1() {
        return lancer1;
    }

    public void setLancer1(int lancer1) {
        this.lancer1 = lancer1;
    }

    public int getLancer2() {
        return lancer2;
    }

    public void setLancer2(int lancer2) {
        this.lancer2 = lancer2;
    }
}
