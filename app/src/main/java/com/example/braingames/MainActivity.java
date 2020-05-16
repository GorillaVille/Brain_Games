package com.example.braingames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braingames.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mainBinding.getRoot());

        Button colorButton = findViewById(R.id.color_game_button);
        Button fakeoutButton = findViewById(R.id.fakeout_game_button);
        Button circleButton = findViewById(R.id.circle_game_button);


        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Color Reaction Test Game
                Intent intent = ColorChange.newIntent(getApplicationContext());
                startActivity(intent);

            }
        });

        fakeoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Fakeout Reaction Test Game
                Intent intent = Fakeout.newIntent(getApplicationContext());
                startActivity(intent);

            }
        });

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Takes you to Circle Blast Reaction Test Game
                Intent intent = CircleBlast.newIntent(getApplicationContext());
                startActivity(intent);

            }
        });

    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }
}
