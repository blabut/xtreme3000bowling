package formation.xp.models;

public class Score {
	
	public Joueur joueur;
	
	public Score(Joueur J)
	{
		joueur=J;
	}
	
	public int calculScore()
	{
		int i;
		int score=0;
		boolean strike=true;
		
		
		for(i=joueur.turns.size()-1; i>=0; i--)
		{
			
			if(joueur.turns.size()<10)
			{
				
				if((joueur.turns.get(i).lancer1)!=10)
				{
					strike=false;
				}
				
				if(!strike)
				{
					if(joueur.turns.get(i).lancer1!=10)
					{
						if((joueur.turns.get(i).lancer1+joueur.turns.get(i).lancer2)!=10)
						{
							score+=joueur.turns.get(i).lancer1;
							score+=joueur.turns.get(i).lancer2;
						}
						else
						{
							score+=10;
							if(i!=9)
							{
								score+=joueur.turns.get(i+1).lancer1;
							}else
							{
								score+=joueur.turns.get(i).lancer3;
							}
						}
					}else
					{
						score+=10;
						
						if(joueur.turns.get(i+1).lancer1==10)
						{
							score+=10;	
							score+=joueur.turns.get(i+2).lancer1;
						}
						else
						{
							score+=joueur.turns.get(i+1).lancer1+joueur.turns.get(i+1).lancer2;
						}
					}
				}
			}else
			{
				if(joueur.turns.get(i).lancer1!=10)
				{

					if((joueur.turns.get(i).lancer1+joueur.turns.get(i).lancer2)!=10)
					{
						score+=joueur.turns.get(i).lancer1;
						score+=joueur.turns.get(i).lancer2;
					}
					else
					{
						score+=10;
						if(i!=9)
						{
							score+=joueur.turns.get(i+1).lancer1;
						}else
						{
							score+=joueur.turns.get(i).lancer3;
						}
					}
				}else
				{
					score+=10;
					
					if(i==9)
					{
						score+=joueur.turns.get(i).lancer2+joueur.turns.get(i).lancer3;	
					}else if(i==8)
					{
						score+=joueur.turns.get(i+1).lancer1+joueur.turns.get(i+1).lancer2;	
					}else
						{
							if(joueur.turns.get(i+1).lancer1==10)
							{
								score+=10;		
								score+=joueur.turns.get(i+2).lancer1;
							}
							else
							{
								score+=joueur.turns.get(i+1).lancer1+joueur.turns.get(i+1).lancer2;
							}
						}
				}
			}	
		}
		
		return score;
	}
	
	
	
}
