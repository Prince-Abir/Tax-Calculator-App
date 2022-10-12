package com.PrinceTechSolution.TaxCalculator.Tax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.google.android.gms.ads.AdView;


public class Result extends AppCompatActivity {

    TextView resultTextView1, resultTextView2, resultTextView3;

    String text1, text2, text3;

    double totalTaxableIncome = 0;
    double totalPayableTax = 0;

    Controls controls;
    AdView adView;
    int Active_Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        controls = new Controls(this);


        resultTextView1 = findViewById(R.id.resultTextView1);
        resultTextView2 = findViewById(R.id.resultTextView2);
        resultTextView3 = findViewById(R.id.resultTextView3);
        adView = findViewById(R.id.adView);


        Intent intent = getIntent();
        totalTaxableIncome = intent.getExtras().getDouble("totalTaxableIncome");
        text2 = intent.getStringExtra("ResultTextView2");
        totalPayableTax = intent.getExtras().getDouble("totalPayableTax");



        text1 = "আপনার কর হিসেব করা হচ্ছে  \n" + totalTaxableIncome+" টাকা ওপর";
        int tax = (int) totalPayableTax;
        text3 = tax + "/=  টাকা";



        resultTextView1.setText(text1);
        resultTextView2.setText(text2);
        resultTextView3.setText(text3);

        Active_Code = MainActivity.Active_Code;
        if (Active_Code == 100){
            controls.loadBannerAd(adView);
        }


    }
}