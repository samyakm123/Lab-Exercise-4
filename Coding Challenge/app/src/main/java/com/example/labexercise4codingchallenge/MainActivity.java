package com.example.labexercise4codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void lauchSecondActivity(View view) {
        Intent intent =  new Intent(this, MainActivity2.class);
        String passage = null;
        if (view.getId() == R.id.button_one){
            passage = "1";
        }
        else if (view.getId() == R.id.button_two){
            passage = "2";
        }
        else if (view.getId() == R.id.button_three){
            passage = "3";
        }
        intent.putExtra("button_id", passage);
        startActivity(intent);
    }
}