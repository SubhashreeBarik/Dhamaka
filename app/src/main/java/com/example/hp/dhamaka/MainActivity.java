package com.example.hp.dhamaka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   // ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bounce(View view){
        ImageView imageView=(ImageView)findViewById(R.id.iv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        imageView.startAnimation(animation);
    }
}
