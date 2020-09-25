package com.example.flickster_app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.flickster_app.R;
import com.example.flickster_app.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{
	static Context context;
	List<Movie> movies;

	public MovieAdapter(Context context, List<Movie> movies){
		this.context=context;
		this.movies=movies;
	}
	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View movieView=LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);
		return new ViewHolder(movieView);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//		Get the movie
		Movie movie=movies.get(position);
//		bind the data
		holder.bind(movie);
	}

	@Override
	public int getItemCount() {
		return movies.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		// each data item is just a string in this case
		TextView tvTitle;
		TextView tvOverview;
		ImageView ivPoster;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			tvTitle=itemView.findViewById(R.id.tvTitle);
			tvOverview=itemView.findViewById(R.id.tvOverview);
			ivPoster=itemView.findViewById(R.id.ivPoster);
		}

		public void bind(Movie movie) {
			tvTitle.setText(movie.getTitle());
			tvOverview.setText(movie.getOverview());
			Glide.with(context).load(movie.getPosterPath()).into(ivPoster);
		}
	}
}
