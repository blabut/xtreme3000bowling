package formation.xp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import formation.xp.models.Affichage;
import formation.xp.models.Joueur;
import formation.xp.models.Score;
import formation.xp.models.Tour;

public class TestAffichage {

	@Test
    public void test() {
        Joueur joueur= new Joueur("joueur", 5);
        List<Tour> turns = new ArrayList<Tour>();
        Affichage af;
      
        Tour turns1 = new Tour();
        Tour turns2 = new Tour();
        
        turns1.setLancer1(1);
        turns1.setLancer2(3);
        
        turns.add(turns1);
        
        turns2.setLancer1(5);
        turns2.setLancer2(5);
        turns.add(turns2);
        
        joueur.setTour(turns);
       
        af=new Affichage(joueur);
        
        af.affichageScore();
        af.affichageTour();
    }
}
