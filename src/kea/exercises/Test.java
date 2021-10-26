package kea.exercises;

import java.util.Random;
import java.util.Scanner;
import static kea.exercises.Suit.*;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;
        while (running) {
            System.out.print("\nGet new cards (Y/N)? ");
            if (!input.nextLine().toLowerCase().startsWith("y")) {
                running = false;
            } else {
                Card card1 = new Card(getRandomSuit(), rand.nextInt(13) + 1);
                Card card2 = new Card(getRandomSuit(), rand.nextInt(13) + 1);

                System.out.print(card1);
                if (card1.beats(card2)) {
                    System.out.print(" beats ");
                } else {
                    System.out.print(" doesn't beat ");
                }
                System.out.print(card2);
            }
        }
    }
}
