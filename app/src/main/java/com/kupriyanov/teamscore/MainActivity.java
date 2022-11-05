package com.kupriyanov.teamscore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score1 = 0;
    private int score2 = 0;
    TextView textViewScore1;
    TextView textViewScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "launchOnCreate");

        if (savedInstanceState != null){
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
        }

        textViewScore1 = findViewById(R.id.textViewScore1);
        textViewScore2 = findViewById(R.id.textViewScore2);
        updateScore1();
        updateScore2();
        textViewScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score1++;
                updateScore1();
            }
        });
        textViewScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2++;
                updateScore2();
            }
        });
    }

    private void updateScore1(){
        textViewScore1.setText(String.valueOf(score1));
    }

    private void updateScore2(){
        textViewScore2.setText(String.valueOf(score2));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", score1);
        outState.putInt("score2", score2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "launchOnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "launchOnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "launchOnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "launchOnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "launchOnStop");
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "launchOnDestroy");
        super.onDestroy();
    }
}