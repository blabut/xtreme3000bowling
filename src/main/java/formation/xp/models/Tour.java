package formation.xp.models;

public class Tour {

    int nbQuillesTombees;
    boolean isSpare;
    boolean isStrike;

    public Tour() {
        this.nbQuillesTombees = 0;
        this.isSpare = false;
        this.isStrike = false;
    }

    public int getNbQuillesTombees() {
        return nbQuillesTombees;
    }

    public void setNbQuillesTombees(int nbQuillesTombees) {
        this.nbQuillesTombees = nbQuillesTombees;
    }

    public boolean isSpare() {
        return isSpare;
    }

    public void setSpare(boolean spare) {
        isSpare = spare;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public void setStrike(boolean strike) {
        isStrike = strike;
    }
}
