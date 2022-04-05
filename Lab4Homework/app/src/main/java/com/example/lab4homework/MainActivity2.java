package com.example.lab4homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int mCount = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        TextView mCountTextView = findViewById(R.id.text_hello);
        mCountTextView.setText("Hello!" + "\n" + mCount);
    }
}