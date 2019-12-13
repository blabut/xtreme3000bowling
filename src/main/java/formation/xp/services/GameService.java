package formation.xp.services;

import formation.xp.models.Game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameService {
        Game game;
        AsciiService asciiService;

        public GameService() throws IOException, InterruptedException {
            this.asciiService = new AsciiService();
            this.asciiService.getHeader();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez le nom du joueur 1:\n");
            String nom1 = scanner.nextLine();
            System.out.println("Entrez le nom du joueur 2:\n");
            String nom2 = scanner.nextLine();
            List<String> listNoms = new ArrayList();
            listNoms.add(nom1);
            listNoms.add(nom2);
            this.game = new Game(listNoms);
            asciiService.getAsciiFromString("Are you ready to play??", "speed");
            asciiService.getAsciiFromString(String.format("%s VS %s", nom1, nom2), "isometric3");
        }

    public static void main(String[] args) throws IOException, InterruptedException {
            GameService gs = new GameService();
    }

    }

