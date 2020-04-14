package com.learntodroid.glidetutorial;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GamesViewHolder extends RecyclerView.ViewHolder {
    private TextView title, genre, releaseDate, platform;
    private ImageView boxArt;

    public GamesViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.item_game_title);
        genre = itemView.findViewById(R.id.item_game_genre);
        releaseDate = itemView.findViewById(R.id.item_game_releaseDate);
        platform = itemView.findViewById(R.id.item_game_platform);
        boxArt = itemView.findViewById(R.id.item_game_boxArt);
    }

    public void bind(Game game) {
        title.setText(game.getTitle());
        genre.setText(game.getGenre());
        releaseDate.setText(game.getReleaseDate());
        platform.setText(game.getPlatform());

        Glide.with(itemView)
                .load(game.getBoxArtImageUri())
                .into(boxArt);
    }
}
