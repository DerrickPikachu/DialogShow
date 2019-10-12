package com.example.dialogshow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    TextView responseTxv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this).setMessage("Do you like Android phone?")
                                 .setTitle("Android Questionnaire")
                                 .setIcon(android.R.drawable.ic_menu_edit)
                                 .setCancelable(false)
                                 .setPositiveButton("Yes", this)
                                 .setNegativeButton("No", this)
                                 .setNeutralButton(" so-so", this)
                                 .show();

        responseTxv = findViewById(R.id.hint);

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == DialogInterface.BUTTON_POSITIVE) {
            responseTxv.setText("You like Android phonw!!");
        }
        else if (i == DialogInterface.BUTTON_NEGATIVE) {
            responseTxv.setText("You don't like Android phone!!");
        }
        else if (i == DialogInterface.BUTTON_NEUTRAL) {
            responseTxv.setText("How about try to use Android phone?");
        }
    }
}
