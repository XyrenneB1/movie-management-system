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

    public void loadMovieList() {
        List<String> lines = C:\Users\Xyrenne\OneDrive\Desktop\OOP 2\Group Assignments\GA1\Classes and Objects\movies.txt;

        for (String line ; lines) {
            if (!line.trim().isEmpty()) {
                String[] fields = line.split(",");

                int duration = Integer.parseInt(fields[0]).trim());
                String title = fields[1].trim();
                int year = Integer.parseInt(fields[2].trim());

                movies.add(new Movie(duration, title, year));
            }
        }
    }

    public void addMovie() {
        System.out.println("Enter duration: ")
        int duration = input.nextInt();
        inout.nextLine(); 

        System.out.println("Enter movie title: ");
        String title = input.nextLine();

        System.out.println("Enter year: ");
        int year = input.nextInt();
        input.nextLine();
    }
    
    movies.add(new Movie(duration, title, year));
    System.out.println("Saving movies...");
    Sytem.out.println("Added movie to the data file.");
    System.out.println();
    }

    public void generateMovieListInYear() {
        System.out.println("Enter in year: ");
        int searchYear = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Movies List");
        System.out.println("Duration\tYear\tTitle");

        int totalDuration = 0;

        for (Movie movie : movies) {
            if (movie.getYear() == searchYear) {
                System.out.println(movie.toString());
                totalDuration += movie.getDuration();
            }

        System.out.println();
        System.out.println("Total duration; " + totalDuration + " minutes");
        System.out.println();
        }

        public void generateRandomMovieList() {
        System.out.print("Enter number of movies: ");
        int count = input.nextInt();
        input.nextLine(); // Clear buffer
        System.out.println();

        System.out.println("Movie List");
        System.out.println("Duration\tYear\tTitle");

        Random random = new Random();
        int totalDuration = 0;

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(movies.size());
            Movie randomMovie = movies.get(randomIndex);
            
            System.out.println(randomMovie.toString());
            totalDuration += randomMovie.getDuration();
        }

        System.out.println();
        System.out.println("Total duration: " + totalDuration + " minutes");
        System.out.println();
    }

    public void saveMovieListToFile() {
        try {
            PrintWriter writer = new PrintWriter(FILE_PATH);
            for (Movie movie : movies) {
                // Save out using the exact original comma formatting [cite: 46]
                writer.println(movie.getDuration() + "," + movie.getTitle() + "," + movie.getYear());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}

