package com.example.braingames;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class IntroDialogFragment extends DialogFragment {

    String phrase;

    public IntroDialogFragment(String string) {
        phrase = string;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(phrase)
                .setPositiveButton(R.string.positive_message, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton(R.string.negative_message, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        startActivity(MainActivity.newIntent(getContext()));
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}