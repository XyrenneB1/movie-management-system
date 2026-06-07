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
        System.out.println("Movie Management system");
        System.out.println("1 Add New Movie and Save");
        System.out.println("2 Generate List of Movies Released in a Year");
        System.out.println("3 Generate List of Random Movies");
        System.out.println("4 Exit");
    }