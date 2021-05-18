package com.tugcenurdaglar.uygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Button button;

    private Animation downtoup;
    private Animation uptodown;

    private Animation righttoleft;
    private Animation lefttoright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        downtoup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downtoup);
        uptodown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);

        righttoleft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.righttoleft);
        lefttoright = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.lefttoright);

        button.setAnimation(lefttoright);
        imageView.setAnimation(lefttoright);
        textView.setAnimation(righttoleft);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.startAnimation(downtoup);
                imageView.startAnimation(uptodown);
                textView.startAnimation(uptodown);
            }
        });


    }
}