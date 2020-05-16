package com.example.braingames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;

import com.example.braingames.databinding.CircleBlastGameBinding;

public class CircleBlast extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, CircleBlast.class);
        return intent;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CircleBlastGameBinding mainBinding = CircleBlastGameBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        IntroDialogFragment dialog = new IntroDialogFragment(getString(R.string.circle_blast_text));

        RecyclerView recyclerView = mainBinding.recyclerview;

        CircleAdapter circleAdapter = new CircleAdapter(this);

        recyclerView.setAdapter(circleAdapter);







    }

}
