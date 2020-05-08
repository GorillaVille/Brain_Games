package com.example.braingames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button colorButton = findViewById(R.id.color_game_button);
        Button fakeoutButton = findViewById(R.id.fakeout_game_button);
        Button circleButton = findViewById(R.id.circle_game_button);


        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Color Reaction Test Game

            }
        });

        fakeoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Fakeout Reaction Test Game

            }
        });

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Circle Blast Reaction Test Game

            }
        });

    }
}
