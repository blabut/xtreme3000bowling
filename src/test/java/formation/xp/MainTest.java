package formation.xp;


import formation.xp.models.Joueur;
import formation.xp.models.Score;
import formation.xp.models.Tour;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
	@Test
    public void test() {
        Joueur joueur= new Joueur("joueur", 5);
        List<Tour> turns = new ArrayList<Tour>();
        Score score;
      
        Tour turns1 = new Tour();
        
        turns1.setLancer1(2);
        turns1.setLancer2(1);
        
        turns.add(turns1);
        
        joueur.setTour(turns);
       
        score=new Score(joueur);
        
        assertTrue(score.calculScore()==3);
    }
}
