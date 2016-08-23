package com.training.lfallon.androidfitflab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final String CARDIO = "CARDIO";
    public static final String WEIGHTLIFTING = "WEIGHTLIFTING";
    public static final String YOGA = "YOGA";
    public static final String EXTRA_SELECTED_EXERCISE = "WEIGHTLIFTING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.weightLifting).setOnClickListener(this);
        findViewById(R.id.yoga).setOnClickListener(this);
        findViewById(R.id.cardio).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.weightLifting){
            loadActivity(WEIGHTLIFTING);
        } else if(v.getId() == R.id.yoga){
            loadActivity(YOGA);
        } else if(v.getId() == R.id.cardio){
            loadActivity(CARDIO);
        }
    }

    private void loadActivity(String excercise){
        Intent intent = new Intent(this, ExerciseActivity.class);
        intent.putExtra(EXTRA_SELECTED_EXERCISE, excercise);
        startActivity(intent);
    }
}
