package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              finish();
          }
      },5000);
    }
}
