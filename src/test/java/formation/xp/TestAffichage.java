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
        
        turns1.setLancer1(10);
        turns1.setLancer2(0);
        
        turns.add(turns1);
        
        turns2.setLancer1(2);
        turns2.setLancer2(4);
        turns.add(turns2);
        
        joueur.setTour(turns);
       
        af=new Affichage(joueur);
        
        af.affichageScore();
        af.affichageTour();
        //assertTrue(score.calculScore()==22);
    }
}
