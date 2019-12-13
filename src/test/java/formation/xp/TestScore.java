package formation.xp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import formation.xp.models.Joueur;
import formation.xp.models.Score;
import formation.xp.models.Tour;

public class TestScore {
	
	 @Test
	    public void test() {
	        Joueur joueur= new Joueur("joueur", 5);
	        List<Tour> turns = new ArrayList<Tour>();
	        Score score;
	      
	        Tour turns1 = new Tour();
	        Tour turns2 = new Tour();
	        
	        turns1.setLancer1(10);
	        turns1.setLancer2(0);
	        
	        turns.add(turns1);
	        
	        turns2.setLancer1(2);
	        turns2.setLancer2(4);
	        turns.add(turns2);
	        
	        joueur.setTour(turns);
	       
	        score=new Score(joueur);
	        
	        System.out.printf("Score: %d \n", score.calculScore());
	        assertTrue(score.calculScore()==22);
	    }
	 
}
