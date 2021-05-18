package com.tugcenurdaglar.uygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        downtoup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downtoup);
        uptodown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);

        button.setAnimation(downtoup);
        imageView.setAnimation(uptodown);
        textView.setAnimation(uptodown);


    }
}