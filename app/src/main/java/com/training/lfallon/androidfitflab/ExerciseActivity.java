package com.training.lfallon.androidfitflab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExerciseActivity extends Activity {

    private TextView mExerciseText;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        layout = (RelativeLayout)findViewById(R.id.exerciseActivity);

        String exerciseText = getIntent().getStringExtra(MainActivity.EXTRA_SELECTED_EXERCISE);
        mExerciseText = (TextView)findViewById(R.id.selectedExcercise);
        mExerciseText.setText(exerciseText);

        setupView(exerciseText);
    }

    private void setupView(String exerciseText){
        if(exerciseText.equalsIgnoreCase(MainActivity.WEIGHTLIFTING)){
            layout.setBackgroundColor(getResources().getColor(R.color.colorLightBlue, getApplicationContext().getTheme()));
        } else if(exerciseText.equalsIgnoreCase(MainActivity.YOGA)){
            layout.setBackgroundColor(getResources().getColor(R.color.colorLightGreen, getApplicationContext().getTheme()));
        } else if(exerciseText.equalsIgnoreCase(MainActivity.CARDIO)){
            layout.setBackgroundColor(getResources().getColor(R.color.colorLightRed, getApplicationContext().getTheme()));
        }
    }
}
