package formation.xp.models;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TourTest {
    public Joueur joueur;
    public Tour tour;
    
    @Test
    public void test_lancer1_entre_0_et_10(){
        this.joueur = new Joueur("test", 0);
        this.tour = new Tour();
        tour.doLancer1(this.joueur);
        assertTrue(0 <= tour.getLancer1() && tour.getLancer1() <= 10 );
    }

    @Test
    public void test_lancer_2_ne_depasse_pas_le_nombre_de_quille_restantes(){
        this.joueur = new Joueur("test", 0);
        this.tour = new Tour();
        tour.doLancer1(this.joueur);
        tour.doLancer2(this.joueur, tour.getLancer1());
        assertTrue(0 <= tour.getLancer2() && tour.getLancer2() <= tour.getLancer1() );
    }

}