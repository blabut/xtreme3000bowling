package formation.xp.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Joueur> joueurs = new ArrayList<Joueur>();
    int currentPlayerIndex;

    public Game(List<String> nomsJoueurs) {
        this.currentPlayerIndex = 0;
        for (int i = 0; i < nomsJoueurs.size(); i++) {
            String nom = nomsJoueurs.get(i);
            joueurs.add(new Joueur(nom, 10));
        }
    }

    public Joueur getCurrentPlayer() {
        return this.joueurs.get(this.currentPlayerIndex);
    }

    public Joueur getPlayer(int i) {
        return this.joueurs.get(i);
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }
}
