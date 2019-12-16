package formation.xp.services;

import formation.xp.models.Game;
import formation.xp.models.Joueur;
import formation.xp.models.Score;
import formation.xp.models.Tour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameService {
        Game game;
        AsciiService asciiService;
        Scanner scanner;
        List<Score> scores = new ArrayList<Score>();

        public GameService() throws IOException, InterruptedException {
            this.asciiService = new AsciiService();
            this.asciiService.getHeader();
            this.scanner = new Scanner(System.in);
            System.out.println("Entrez le nom du joueur 1:\n");
            String nom1 = this.scanner.nextLine();
            System.out.println("Entrez le nom du joueur 2:\n");
            String nom2 = this.scanner.nextLine();
            List<String> listNoms = new ArrayList();
            listNoms.add(nom1);
            listNoms.add(nom2);
            this.game = new Game(listNoms);
            for (int i = 0; i < game.getJoueurs().size(); i++) {
                this.scores.add(new Score(game.getPlayer(i)));
            }
            this.asciiService.getAsciiFromString("Are you ready to play??", "speed");
            this.asciiService.getAsciiFromString(String.format("%s VS %s", nom1, nom2), "isometric3");




        }

        public void play() throws IOException, InterruptedException {
            int num_tour = 0;
            List<Joueur> joueurs = this.game.getJoueurs();
            while (num_tour < 10) {
                for (int i = 0; i < joueurs.size(); i++) {
                    Joueur joueur = joueurs.get(i);
                    this.asciiService.getAsciiFromString(String.format("Tour:+%s", num_tour), "standard");
                    this.asciiService.getAsciiFromString(String.format("Joueur:+%s", joueur.getPseudo()), "standard");
                    Tour tour = new Tour();
                    joueur.getTurns().add(tour);
                    asciiService.getKeels(10);
                    System.out.println("Lancer 1 - Press enter to play");
                    this.scanner.nextLine();
                    int scoreTour1 = tour.doLancer1(joueur);
                    asciiService.getKeels(10-scoreTour1);
                    if (!(scoreTour1 == 10)) {
                        System.out.println("Lancer 2 - Press enter to play");
                        this.scanner.nextLine();
                        int scoreTour2 = 10 - scoreTour1 - tour.doLancer2(joueur);
                        asciiService.getKeels(scoreTour2);
                        if (scoreTour2==0) {
                            this.asciiService.getAsciiFromString("Spaaaaaaaaare", "speed");
                            System.out.println(("\n"));
                        }
                    }
                    else{
                        this.asciiService.getAsciiFromString("Striiiiiiike", "speed");
                        System.out.println(("\n"));
                    }
                    num_tour++;
                    for (int j = 0; j < this.scores.size(); j++) {
                        asciiService.getAsciiFromString(String.format("%s+:+%s", game.getPlayer(j).getPseudo(), String.valueOf(scores.get(j).calculScore())), "standard");
                        System.out.println("\n");
                    }
                }

            }

            String winner = this.getWinner(this.scores);
            this.asciiService.getAsciiFromString(String.format("Le gagnant est : %s !!!!!", winner), "standard");
        }

        public String getWinner(List<Score> scores) {
            String winner = "Personne";
            int max = 0;
            for (int j = 0; j < this.scores.size(); j++) {
                if (scores.get(j).calculScore() > max){
                    winner = this.game.getPlayer(j).getPseudo();
                    max = scores.get(j).calculScore();
                }
            }

            return winner;
        }

    public static void main(String[] args) throws IOException, InterruptedException {
            GameService gs = new GameService();
            gs.play();
    }

    }

