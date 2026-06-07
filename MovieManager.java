package sait.mms.manager;

import java.io.*;
import java.util.*;
import sait.mms.problemdomain.Movie;

public class MovieManager {

    private ArrayList<Movie> movies = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public MovieManager() {
        loadMovieList();
    }

    public void displayMenu() {
        int option = 0;

        while (option != 4) {
            System.out.println("Movie Management system");
            System.out.println("1 Add New Movie and Save");
            System.out.println("2 Generate List of Movies Released in a Year");
            System.out.println("3 Generate List of Random Movies");
            System.out.println("4 Exit");
            System.out.println();
            System.out.println("Enter an option: ");

            option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                addMovie();
            } else if (option == 2) {
                generateMoviesListInYear();
            }else if (option == 3) {
                generateRandomMovieList();
            }else if (option == 4) {
                saveMovieListToFile();
            }else {
                System.out.println("Invalid option!");
                System.out.println();
            }
            
        }
        
    }