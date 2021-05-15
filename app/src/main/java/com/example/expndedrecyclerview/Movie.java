package com.example.expndedrecyclerview;

public class Movie {

   private String movieName;
   private String year;
   private String rating;
   private String plot;
   private boolean expanded;

    public Movie(String movieName, String year, String rating, String plot) {
        this.movieName = movieName;
        this.year = year;
        this.rating = rating;
        this.plot = plot;
        this.expanded = false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
