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

import com.example.expndedrecyclerview.databinding.MovieLayoutBinding;

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

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        MovieLayoutBinding binding = MovieLayoutBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.binding.setMovie(movieList.get(position));
        boolean expanded = movieList.get(position).isExpanded();
        holder.binding.contenLayout.setVisibility(expanded? View.VISIBLE: View.GONE);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MovieLayoutBinding binding;
        public ViewHolder(@NonNull MovieLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            binding.parentLayout.setOnClickListener(view -> {

                Movie movie = movieList.get(getAdapterPosition());
                movie.setExpanded(!movie.isExpanded());
                notifyItemChanged(getAdapterPosition());

            });


        }
    }
}
