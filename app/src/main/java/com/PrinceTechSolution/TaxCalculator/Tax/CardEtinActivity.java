package com.PrinceTechSolution.TaxCalculator.Tax;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.google.android.gms.ads.AdView;


public class CardEtinActivity extends AppCompatActivity {

    TextView ETinRegistrationButton;
    Controls controls;
    AdView adView;
    int Active_Code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_etin);

        controls = new Controls(this);

        ETinRegistrationButton = findViewById(R.id.etinRegistrationButton);
        adView = findViewById(R.id.adView);


        ETinRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardEtinActivity.this, EtinRegistrationProcessActivity.class));
            }
        });

        Active_Code = MainActivity.Active_Code;
        if (Active_Code == 100){
            controls.loadBannerAd(adView);
        }
    }
}