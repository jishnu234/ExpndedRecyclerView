package com.example.expndedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    Context context;
    ArrayList<Movie> movieList;
    public MovieAdapter(Context context, ArrayList<Movie> movieList) {
        this.context =context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.movie_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.titleText.setText(movieList.get(position).getMovieName());
        holder.yearText.setText(movieList.get(position).getYear());
        holder.plotText.setText(movieList.get(position).getPlot());

        float rating = Float.parseFloat(movieList.get(position).getRating());
        float actualRating = 5*(rating/10);
        holder.ratingText.setRating(actualRating);

        boolean expanded = movieList.get(position).isExpanded();
        holder.contentLayout.setVisibility(expanded? View.VISIBLE: View.GONE);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleText, yearText, plotText;
        RatingBar ratingText;
        ConstraintLayout contentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.titleText);
            yearText = itemView.findViewById(R.id.yearValue);
            ratingText = itemView.findViewById(R.id.ratingValue);
            plotText = itemView.findViewById(R.id.textPlot);
            contentLayout = itemView.findViewById(R.id.contenLayout);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Movie movie = movieList.get(getAdapterPosition());
                    movie.setExpanded(!movie.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}
