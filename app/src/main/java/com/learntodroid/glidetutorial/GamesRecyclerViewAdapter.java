package com.learntodroid.glidetutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GamesRecyclerViewAdapter extends RecyclerView.Adapter<GamesViewHolder> {
    private List<Game> games;

    public GamesRecyclerViewAdapter(List<Game> games) {
        this.games = games;
    }

    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false);
        return new GamesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesViewHolder holder, int position) {
        Game game = games.get(position);
        holder.bind(game);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public void setGames(List<Game> games) {
        this.games = games;
        notifyDataSetChanged();
    }
}
