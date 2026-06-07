/**
 * Assignment 1: Classess and Objects
 * Authors: Xyrenne Bastian, Mary Ann Coloma
 * Date: June 7, 2026
 */

public class Movie {
    int duration;
    String title;
    int year;

    public Movie(int duration, String title, int year) {
        this.duration = duration;
        this.title = title;
        this.year = year;  
    }

    public int getDuration() {
        return this.duration;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return duration + "," + title + "," + year;
    }


}