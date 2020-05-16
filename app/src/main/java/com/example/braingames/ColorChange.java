package com.example.braingames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ColorChange extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ColorChange.class);
        return intent;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_change_game);

        IntroDialogFragment dialog = new IntroDialogFragment(getString(R.string.color_shift_text));


    }
}

