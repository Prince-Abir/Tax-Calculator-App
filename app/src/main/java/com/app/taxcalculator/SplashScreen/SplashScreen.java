package com.app.taxcalculator.SplashScreen;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.taxcalculator.MainActivity;
import com.app.taxcalculator.R;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {


    TextView appName,developerInfo;
    ImageView appIcon;
    LottieAnimationView animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        appName = findViewById(R.id.SplashAppName);
        appIcon = findViewById(R.id.SplashIcon);
        developerInfo = findViewById(R.id.developerInfo);
        animation = findViewById(R.id.lottieAnimation);


        appIcon.animate().translationX(-700).rotation(360).setDuration(3000).setStartDelay(0).start();
        appName.animate().translationY(-450).setDuration(2500).setStartDelay(0).start();
        developerInfo.animate().translationY(-300).setDuration(3500).setStartDelay(500).start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 6000);
    }
}