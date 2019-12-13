package formation.xp.models;

public class Score {
	
	public int score_total;
	public int tot_q;
	public int status_affiche;
	public int score_affiche;
	public int set;
	public int lancer;
	
	public Score()
	{
		score_total=0;
		score_affiche=0;
		set=1;
		lancer=1;
		tot_q=0;
		status_affiche= 0;
	}
	
	public void mis_a_jour_set()
	{
		set++;
		lancer=1;
	}
	
	public void mis_a_jour_lancer()
	{
		lancer=2;
	}
	
	public void quilles_tombe(int quilles)
	{
		if(lancer==1)
		{
			tot_q=quilles;
			if(tot_q==10)
			{
				score_total+=10;
				score_affiche=score_total;
				status_affiche=2;
			}
			else
			{
				mis_a_jour_lancer();
			}
		}
		else
		{
			tot_q+=quilles;
			if(tot_q==10)
			{
				score_total+=10;
				score_affiche=score_total;
				status_affiche=1;
			}
			else
			{
				score_total+=tot_q;
				score_affiche=score_total;
				status_affiche=0;
				mis_a_jour_set();
			}
			
		}
	}
	
	public void afficher()
	{
		if(status_affiche==0)
		{
			System.out.printf("Score: %d \n", score_affiche);
		}
	}
	
}
