package com.app.taxcalculator.DeveloperInfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.app.taxcalculator.R;

public class DeveloperInfoActivity extends AppCompatActivity {

    TextView moreApp,rateApp,email,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);

        moreApp = findViewById(R.id.MoreApp);
        rateApp = findViewById(R.id.RateApp);
        email = findViewById(R.id.Email);
        share = findViewById(R.id.ShareApp);
    }
}