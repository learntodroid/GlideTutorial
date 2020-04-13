package com.learntodroid.glidetutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GamesListFragment extends Fragment {
    private GamesRecyclerViewAdapter gamesRecyclerViewAdapter;
    private RecyclerView gamesRecyclerView;
    private List<Game> games;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        games = new ArrayList<>();

        games.add(new Game("Doom Eternal", "First Person Shooter", "20 March, 2020", "WIN, PS4, XBO", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9d/Cover_Art_of_Doom_Eternal.png/220px-Cover_Art_of_Doom_Eternal.png"));
        games.add(new Game("Cyberpunk 2077", "Role Playing Game", "17 September, 2020", "WIN, PS4, XBO", "https://upload.wikimedia.org/wikipedia/en/9/9f/Cyberpunk_2077_box_art.jpg"));
        games.add(new Game("Final Fantasy VII Remake", "Action Role Playing Game", "10 April, 2020", "PS4", "https://upload.wikimedia.org/wikipedia/en/c/ce/FFVIIRemake.png"));
        games.add(new Game("Animal Crossing: New Horizons", "Life Simulation", "20 March, 2020", "NS", "https://upload.wikimedia.org/wikipedia/en/1/1f/Animal_Crossing_New_Horizons.jpg"));
        games.add(new Game("Resident Evil 3", "Survival Horror", "3 April, 2020", "WIN, PS4, XBO", "https://upload.wikimedia.org/wikipedia/en/d/dc/Resident_Evil_3.jpg"));

        gamesRecyclerViewAdapter = new GamesRecyclerViewAdapter(games);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listgames, container, false);

        gamesRecyclerView = view.findViewById(R.id.fragment_listgames_recyclerview);
        gamesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        gamesRecyclerView.setAdapter(gamesRecyclerViewAdapter);

        return view;
    }
}
