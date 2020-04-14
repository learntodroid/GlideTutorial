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

public class DisplayAnimationFragment extends Fragment {
    private TextView description;
    private ImageView image;
    public static final boolean USE_GIF = true;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animation, container, false);

        description = view.findViewById(R.id.fragment_animation_description);
        image = view.findViewById(R.id.fragment_animation_image);

        if (USE_GIF) {
            showGIF("https://www.reactiongifs.com/r/hsk.gif", "Homer Skipping");
        } else {
            showWEBP("https://i.giphy.com/media/UmGYBusanpEwU/giphy.webp", "Homer Thinking");
        }

        return view;
    }

    public void showGIF(String imageUri, String imageDescription) {
        description.setText(imageDescription);

        Glide.with(this)
                .asGif()
                .load(imageUri)
                .error(R.drawable.ic_error_black_24dp)
                .into(image);

    }

    public void showWEBP(String imageUri, String imageDescription) {
        description.setText(imageDescription);

        Glide.with(this)
                .load(imageUri)
                .error(R.drawable.ic_error_black_24dp)
                .into(image);

    }
}