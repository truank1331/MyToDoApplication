package com.example.mytodoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast.makeText(this, getString(R.string.welcome_toast), Toast.LENGTH_SHORT).show();
    }
}
