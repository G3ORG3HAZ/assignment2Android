package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);

                // Apply slide-in animation
                Animation slideInAnimation = AnimationUtils.loadAnimation(MainActivity2.this, R.anim.slide_in);
                findViewById(android.R.id.content).startAnimation(slideInAnimation);

                startActivity(i);
                finish();
            }
        },2000);
    }
}