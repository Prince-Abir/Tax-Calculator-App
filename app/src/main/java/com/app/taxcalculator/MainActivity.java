package com.app.taxcalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.app.taxcalculator.Calculator.Card_Calculator_Activity;
import com.app.taxcalculator.CardETin.CardEtinActivity;
import com.app.taxcalculator.CardIncomeTaxReturn.CardIncomeTaxReturn;
import com.app.taxcalculator.DeveloperInfo.DeveloperInfoActivity;
import com.app.taxcalculator.FrequentlyAskedQuestion.CardFrequentlyAskedQuestion;
import com.app.taxcalculator.IncomeTaxInfo.IncomeTaxInfo;
import com.app.taxcalculator.TaxZones.TaxZoneActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardCalculateId;
    CardView cardETin;
    CardView cardIncomeTaxReturn;
    CardView cardFAQ;
    CardView cardTaxZones;
    CardView cardIncomeTaxInfo;

    ImageView developerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardCalculateId = findViewById(R.id.CardCalculateId);
        cardETin = findViewById(R.id.CardEtin);
        cardIncomeTaxReturn = findViewById(R.id.CardIncomeReturn);
        cardFAQ = findViewById(R.id.CardFAQ);
        cardTaxZones = findViewById(R.id.CardTaxZones);
        cardIncomeTaxInfo = findViewById(R.id.CardIncomeTaxInfo);


        developerInfo = findViewById(R.id.developerIcon);


        cardCalculateId.setOnClickListener(this);
        cardETin.setOnClickListener(this);
        cardIncomeTaxReturn.setOnClickListener(this);
        cardFAQ.setOnClickListener(this);
        cardTaxZones.setOnClickListener(this);
        cardIncomeTaxInfo.setOnClickListener(this);

        developerInfo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == cardCalculateId.getId()) {

            startActivity(new Intent(MainActivity.this, Card_Calculator_Activity.class));

        } else if (v.getId() == cardETin.getId()) {

            startActivity(new Intent(MainActivity.this, CardEtinActivity.class));
        } else if (v.getId() == cardIncomeTaxReturn.getId()) {

            startActivity(new Intent(MainActivity.this, CardIncomeTaxReturn.class));
        } else if (v.getId() == cardFAQ.getId()) {

            startActivity(new Intent(MainActivity.this, CardFrequentlyAskedQuestion.class));
        }
        else if (v.getId() == cardTaxZones.getId()) {

            startActivity(new Intent(MainActivity.this, TaxZoneActivity.class));
        }

      else if (v.getId() == cardIncomeTaxInfo.getId()) {

                startActivity(new Intent(MainActivity.this, IncomeTaxInfo.class));
            }


        else if (v.getId() == developerInfo.getId()) {

            startActivity(new Intent(MainActivity.this, DeveloperInfoActivity.class));
        }


    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setIcon(R.drawable.exit);
        alertDialog.setCancelable(true);
        alertDialog.setTitle("Exit");
        alertDialog.setMessage("Do you want to close Tax Flow?");
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finishAndRemoveTask();
            }
        });

        alertDialog.show();
    }
}