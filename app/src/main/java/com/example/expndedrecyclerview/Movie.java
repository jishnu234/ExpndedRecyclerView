package com.example.expndedrecyclerview;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;

public class Movie {

   private String movieName;
   private String year;
   private float rating;
   private String plot;
   private boolean expanded;

    public Movie(String movieName, String year, float rating, String plot) {
        this.movieName = movieName;
        this.year = year;
        this.rating = 5*(rating/10);
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

}
