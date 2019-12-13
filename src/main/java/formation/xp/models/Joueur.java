package formation.xp.models;

public class Joueur {
    String pseudo;
    int level; // on a scale from 1 to 10
    int score;

    public Joueur(String pseudo, int level) {
        this.pseudo = pseudo;
        this.level = level;
        this.score = 0;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
