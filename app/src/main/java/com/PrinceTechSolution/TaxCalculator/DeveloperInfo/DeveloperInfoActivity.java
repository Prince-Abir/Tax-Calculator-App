package com.PrinceTechSolution.TaxCalculator.DeveloperInfo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.R;

public class DeveloperInfoActivity extends AppCompatActivity {

    TextView moreApp, rateApp, email, share;
    Controls controls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);

        moreApp = findViewById(R.id.MoreApp);
        rateApp = findViewById(R.id.RateApp);
        email = findViewById(R.id.Email);
        share = findViewById(R.id.ShareApp);

        controls = new Controls(this);

        moreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controls.MoreApp();

            }
        });

        rateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controls.rateUsOnGoogle();
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controls.EmailUs();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controls.ShareApp();
            }
        });
    }
}