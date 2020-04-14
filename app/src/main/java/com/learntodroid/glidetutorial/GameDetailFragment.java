package com.learntodroid.glidetutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class GameDetailFragment extends Fragment {
    private TextView title, genre, platform, releaseDate, description;
    private ImageView boxArt;

    private Game game;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        game = new Game(
                "Halo: The Master Chief Collection",
                "First Person Shooter",
                "11 November, 2014",
                "Xbox One, Windows",
                "https://upload.wikimedia.org/wikipedia/en/a/a3/Halo_TMCC_KeyArt_Vert_2019.png"
        );

        game.setDescription(
                "Halo: The Master Chief Collection is a compilation of first-person shooter (FPS) video games in the Halo series, originally released in November 2014 for the Xbox One, and later on Windows through 2019 and 2020.\n\n" +
                        "The collection was developed by 343 Industries in partnership with other studios and was published by Xbox Game Studios.\n\n" +
                        "The collection consists of Halo: Combat Evolved Anniversary, Halo 2: Anniversary, Halo 3, Halo 3: ODST, Halo: Reach, and Halo 4, which were originally released on earlier Xbox platforms.\n\n" +
                        "Each game in the Master Chief Collection received a graphical upgrade, with Halo 2 receiving a complete high-definition redesign of its audio and cutscenes that are exclusive to the collection\n\n" +
                        "The game includes access to the live-action series Halo: Nightfall as well as the Halo 5: Guardians multiplayer beta that was available for a limited time.\n\n" +
                        "The collection's multiplayer features every map originally released with each game, including six Halo 2 maps remastered from the ground up.\n\n" +
                        "Critics generally praised The Master Chief Collection for its updated audio and visuals, as well as its quantity of content, but criticized its multiplayer aspects due to a significant number of bugs and poor matchmaking experiences.\n\n" +
                        "Many of these technical issues were later fixed in post-release patches."
        );
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detailgame, container, false);

        title = view.findViewById(R.id.fragment_detailgame_title);
        genre = view.findViewById(R.id.fragment_detailgame_genre);
        platform = view.findViewById(R.id.fragment_detailgame_platforms);
        releaseDate = view.findViewById(R.id.fragment_detailgame_releaseDate);
        description = view.findViewById(R.id.fragment_detailgame_description);
        boxArt = view.findViewById(R.id.fragment_detailgame_boxart);

        title.setText(game.getTitle());
        genre.setText(game.getGenre());
        platform.setText(game.getPlatform());
        releaseDate.setText(game.getReleaseDate());
        description.setText(game.getDescription());

        loadImageWithError();

        return view;
    }

    private void loadImage() {
        Glide.with(this)
                .load(game.getBoxArtImageUri())
                .into(boxArt);
    }

    private void loadImageWithPlaceholder() {
        Glide.with(this)
                .load(game.getBoxArtImageUri())
                .placeholder(R.drawable.ic_file_download_black_24dp)
                .into(boxArt);
    }

    private void loadImageWithError() {
        Glide.with(this)
                .load(game.getBoxArtImageUri())
                .placeholder(R.drawable.ic_file_download_black_24dp)
                .error(R.drawable.ic_error_black_24dp)
                .into(boxArt);
    }
}