package com.example.dialogshow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this).setMessage("Alert Dialog practice!!")
                                 .setTitle("Welcome")
                                 .setIcon(R.mipmap.ic_launcher)
                                 .show();
    }
}
