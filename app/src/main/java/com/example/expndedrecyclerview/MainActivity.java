package com.example.expndedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private ArrayList<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        initMovieList();
        initRecyclerView();

    }

    private void initRecyclerView() {

        adapter = new MovieAdapter(this, movieList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

    }

    private void initMovieList() {
        movieList = new ArrayList<>();

        movieList.add(new Movie("Captain America: The First Avenger","2011",
                "6.9","Steve Rogers, a rejected military soldier, transforms into " +
                "Captain America after taking a dose of a \"Super-Soldier serum\". But being " +
                "Captain America comes at a price as he attempts to take down a war monger and " +
                "a terrorist organization."));
        movieList.add(new Movie("Captain Marvel","2019","6.9",
                "Carol Danvers becomes one of the universe's most powerful heroes when Earth is" +
                        " caught in the middle of a galactic war between two alien races."));
        movieList.add(new Movie("Iron Man","2008","7.9",
                "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates" +
                        " a unique weaponized suit of armor to fight evil."));
        movieList.add(new Movie("Iron Man 2","2010","7.0",
                "With the world now aware of his identity as Iron Man, Tony Stark must contend with " +
                        "both his declining health and a vengeful mad man with ties to his father's legacy."));
        movieList.add(new Movie("The Incredible Hulk","2008","6.7",
                "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for " +
                        "the monster he turns into whenever he loses his temper."));
        movieList.add(new Movie("Thor","2011","7.0",
                "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in " +
                        "Midgard (Earth), where he soon becomes one of their finest defenders."));
        movieList.add(new Movie("The Avengers","2012","8.0",
                "Earth's mightiest heroes must come together and learn to fight as a team if they are " +
                        "going to stop the mischievous Loki and his alien army from enslaving humanity."));
        movieList.add(new Movie("Thor: The Dark World","2013","6.9",
                "When the Dark Elves attempt to plunge the universe into darkness, Thor must embark on " +
                        "a perilous and personal journey that will reunite him with doctor Jane Foster."));
        movieList.add(new Movie("Guardians of the Galaxy","2014","8.0",
                "A group of intergalactic criminals must pull together to stop a fanatical warrior with " +
                        "plans to purge the universe."));
    }
}