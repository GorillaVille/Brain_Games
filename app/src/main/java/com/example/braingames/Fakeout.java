package com.example.braingames;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.braingames.databinding.FakeoutGameBinding;

public class Fakeout extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, Fakeout.class);
        return intent;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FakeoutGameBinding mainBinding = FakeoutGameBinding.inflate(getLayoutInflater());
        //setContentView(FakeoutGameBinding.getRoot());

        IntroDialogFragment dialog = new IntroDialogFragment(getString(R.string.fakeout_text));


    }
}
