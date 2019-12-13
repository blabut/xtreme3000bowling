package formation.xp.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Joueur joueur;
    List<Tour> tours = new ArrayList<Tour>();
    int score;

    public Game(Joueur joueur) {
        this.joueur = joueur;
        this.score = 0;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
