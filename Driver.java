package sait.mms.application;

import java.util.Scanner;
import sait.mms.manager.MovieManager;

public class Driver {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 4) {
            manager.displayMenu();
            System.out.print("\nEnter an option: ");
            option = input.nextInt();
            input.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    manager.addMovie();
                    break;
                case 2:
                    manager.generateMovieListInYear();
                    break;
                case 3:
                    manager.generateRandomMovieList();
                    break;
                case 4:
                    manager.saveMovieListToFile();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        input.close();
    }
}
