package com.example.movietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoadingScreen extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT=5500;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading_screen);

        new Handler().postDelayed(new Runnable()
        {
            @Override
        public void run()
        {
            Intent homeIntent = new Intent (LoadingScreen.this, MainActivity.class);
            startActivity(homeIntent);
            finish();

        }
        },SPLASH_TIME_OUT);
    }
    /*private void startAnimation(){
        ProgressBar mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        ObjectAnimator progressAnimator = ObjectAnimator.ofInt(mProgressBar, "progress", 100, 0);
        progressAnimator.setDuration(30000);
        progressAnimator.setInterpolator(new LinearInterpolator());
        progressAnimator.start();
    }*/
    
}