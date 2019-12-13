package formation.xp.models;

public class Affichage {
	
	private Joueur joueur;
	private Score score;
	
	public Affichage(Joueur J)
	{
		joueur=J;
		score= new Score(J);
	}
	
	public void affichageTour()
	{
		
		if(joueur.turns.size()<9)
		{
			if(joueur.turns.get(joueur.turns.size()-1).lancer2==-1)
				System.out.printf("Le joueur %s est au tour %d. \n", joueur.getPseudo(), joueur.turns.size());
			else
				System.out.printf("Le joueur %s est au tour %d. \n", joueur.getPseudo(), joueur.turns.size()+1);
		}else
		{
			System.out.printf("Le joueur %s est au dernier tour. \n", joueur.getPseudo());
		}
			
	}
	
	public void affichageScore()
	{
		System.out.printf("Le joueur %s a un score de %d. \n", joueur.getPseudo(), score.calculScore());
	}
	
}
