package com.PrinceTechSolution.TaxCalculator.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {


    TextView appName, developerInfo;
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


        appIcon.animate().translationXBy(-700).rotation(360).setDuration(2500).setStartDelay(0).start();
        appName.animate().translationYBy(-400).setDuration(3000).setStartDelay(0).start();
        developerInfo.animate().translationY(-300).setDuration(3500).setStartDelay(0).start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animation.cancelAnimation();
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        }, 4000);
    }
}