package com.example.dialogshow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this).setMessage("Do you like Android phone?")
                                 .setTitle("Android Questionnaire")
                                 .setIcon(android.R.drawable.ic_menu_edit)
                                 .setCancelable(false)
                                 .setPositiveButton("Yes", null)
                                 .setNegativeButton("No", null)
                                 .setNeutralButton(" so-so", null)
                                 .show();
    }
}
