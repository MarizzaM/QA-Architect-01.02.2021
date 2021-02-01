package com.company;


import java.util.Date;

public class Movie {
    public final String title;
    public final Date dateRelease = new Date();
    public float rating;
    public String genre;
    public static int movieCounter;
    public static final int ratingForOscar = 9;

    public Movie(String title, float rating, String genre) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        movieCounter++;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", dateRelease=" + dateRelease +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    public void resetCounter(){
        movieCounter = 0;
    }

    public boolean isWonOscar(){
        if (this.rating >= ratingForOscar){
            return true;
        } else {
            return false;
        }
    }
}
