package com.PrinceTechSolution.TaxCalculator.Tax;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.google.android.gms.ads.AdView;


public class TaxMain extends AppCompatActivity implements View.OnClickListener {

    CardView cardCalculateId;
    CardView cardETin;
    CardView cardIncomeTaxReturn;
    CardView cardFAQ;
    CardView cardTaxZones;
    CardView cardIncomeTaxInfo;
    CardView cardTaxForms;
    CardView cardReturnVerify;
    boolean randomNumber;

    AdView adView;
    Controls controls;

    int Active_Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_main);


        controls = new Controls(this);

        cardCalculateId = findViewById(R.id.CardCalculateId);
        cardETin = findViewById(R.id.CardEtin);
        cardIncomeTaxReturn = findViewById(R.id.CardIncomeReturn);
        cardFAQ = findViewById(R.id.CardFAQ);
        cardTaxZones = findViewById(R.id.CardTaxZones);
        cardIncomeTaxInfo = findViewById(R.id.CardIncomeTaxInfo);
        cardTaxForms = findViewById(R.id.CardForms);
        cardReturnVerify = findViewById(R.id.CardReturnVerify);


        adView = findViewById(R.id.adView);


        cardCalculateId.setOnClickListener(this);
        cardETin.setOnClickListener(this);
        cardIncomeTaxReturn.setOnClickListener(this);
        cardFAQ.setOnClickListener(this);
        cardTaxZones.setOnClickListener(this);
        cardIncomeTaxInfo.setOnClickListener(this);
        cardTaxForms.setOnClickListener(this);
        cardReturnVerify.setOnClickListener(this);



        Active_Code = MainActivity.Active_Code;

        if (Active_Code == 100){
            controls.adInitialization();
            controls.loadBannerAd(adView);
        }

    }

    @Override
    public void onClick(View v) {

        randomNumber = controls.RandomMatched();

        if (controls.isConnected()) {

            if (v.getId() == cardCalculateId.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, Card_Calculator_Activity.class));

            } else if (v.getId() == cardETin.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, CardEtinActivity.class));

            } else if (v.getId() == cardIncomeTaxReturn.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, CardIncomeTaxReturn.class));

            } else if (v.getId() == cardFAQ.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, CardFrequentlyAskedQuestion.class));
            } else if (v.getId() == cardTaxZones.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, TaxZoneActivity.class));

            } else if (v.getId() == cardIncomeTaxInfo.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }

                }
                startActivity(new Intent(TaxMain.this, IncomeTaxInfo.class));
            } else if (v.getId() == cardTaxForms.getId()) {

                if (Active_Code == 100) {
                    if (randomNumber) {
                        controls.loadInterstitialAd(getResources().getString(R.string.interstitialId));
                    }
                }
                startActivity(new Intent(TaxMain.this, TaxForms.class));
            }

        } else {
            controls.CustomDialog();
        }


    }


}