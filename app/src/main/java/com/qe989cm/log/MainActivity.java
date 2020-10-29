package com.qe989cm.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        Toast.makeText(this, "Testing", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
    }
}