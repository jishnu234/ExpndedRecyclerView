package com.example.expndedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.expndedrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private ArrayList<Movie> movieList;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        initMovieList();
        initRecyclerView();

        mainBinding.nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SecondActivty.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }

    private void initRecyclerView() {

        adapter = new MovieAdapter(this, movieList);
        mainBinding.recyclerView.setHasFixedSize(true);
        mainBinding.recyclerView.setAdapter(adapter);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mainBinding.recyclerView.addItemDecoration(itemDecoration);

    }

    private void initMovieList() {
        movieList = new ArrayList<>();

        movieList.add(new Movie("Captain America: The First Avenger","2011",
                6.9f,"Steve Rogers, a rejected military soldier, transforms into " +
                "Captain America after taking a dose of a \"Super-Soldier serum\". But being " +
                "Captain America comes at a price as he attempts to take down a war monger and " +
                "a terrorist organization."));
        movieList.add(new Movie("Captain Marvel","2019",6.9f,
                "Carol Danvers becomes one of the universe's most powerful heroes when Earth is" +
                        " caught in the middle of a galactic war between two alien races."));
        movieList.add(new Movie("Iron Man","2008",7.9f,
                "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates" +
                        " a unique weaponized suit of armor to fight evil."));
        movieList.add(new Movie("Iron Man 2","2010",7.0f,
                "With the world now aware of his identity as Iron Man, Tony Stark must contend with " +
                        "both his declining health and a vengeful mad man with ties to his father's legacy."));
        movieList.add(new Movie("The Incredible Hulk","2008",6.7f,
                "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for " +
                        "the monster he turns into whenever he loses his temper."));
        movieList.add(new Movie("Thor","2011",7.0f,
                "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in " +
                        "Midgard (Earth), where he soon becomes one of their finest defenders."));
        movieList.add(new Movie("The Avengers","2012",8.0f,
                "Earth's mightiest heroes must come together and learn to fight as a team if they are " +
                        "going to stop the mischievous Loki and his alien army from enslaving humanity."));
        movieList.add(new Movie("Thor: The Dark World","2013",6.9f,
                "When the Dark Elves attempt to plunge the universe into darkness, Thor must embark on " +
                        "a perilous and personal journey that will reunite him with doctor Jane Foster."));
        movieList.add(new Movie("Guardians of the Galaxy","2014",8.0f,
                "A group of intergalactic criminals must pull together to stop a fanatical warrior with " +
                        "plans to purge the universe."));
    }
}