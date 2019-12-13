package formation.xp.models;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    String pseudo;
    int level; // on a scale from 1 to 10
    List<Tour> turns = new ArrayList<Tour>();
    int score;

    public Joueur(String pseudo, int level) {
        this.pseudo = pseudo;
        this.level = level;
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
    
    public void setTour(List<Tour> turns) {
        this.turns = turns;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
