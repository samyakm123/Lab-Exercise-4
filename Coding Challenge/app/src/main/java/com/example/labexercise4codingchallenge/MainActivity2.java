package com.example.labexercise4codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String passage = intent.getStringExtra("button_id");
        TextView text_passage = findViewById(R.id.text_passage);

        switch (passage) {
            case "1":
                text_passage.setText(getResources().getString(R.string.TextOneMessage));

                break;
            case "2":
                text_passage.setText(getResources().getString(R.string.TextTwoMessage));
                break;
            case "3":
                text_passage.setText(getResources().getString(R.string.TextThreeMessage));
                break;
        }

    }
}