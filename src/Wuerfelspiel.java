import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {
        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen,
        // ansonsten der Computer
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("===Menu===");
            System.out.println("1. Play");
            System.out.println("2. End");
            int auswahl = (scanner.nextInt());

            switch (auswahl) {
                case 1:
                    System.out.println("Game Started");

                    int playerSum = 0;
                    int botSum = 0;

                    for (int i = 1; i <= 7; i++) {
                        int randomNumber1 = random.nextInt(1, 7);
                        int randomNumber2 = random.nextInt(1, 7);

                        System.out.println("You: " + randomNumber1);
                        System.out.println("Bot: " + randomNumber2);

                        playerSum += randomNumber1;
                        botSum += randomNumber2;
                    }
                    System.out.println("Your sum: " + playerSum);
                    System.out.println("Bot's sum: " + botSum);

                    if (playerSum < botSum) {
                        System.out.println("You lose...");
                    } else if (playerSum > botSum) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("Draw...");
                    }
                    break;
                case 2:
                    System.out.println("Game Ended ._.");
                    running = false;
                    break;

            }
        }
    }
}
