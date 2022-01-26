package com.app.taxcalculator.Calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.app.taxcalculator.R;


public class Result extends AppCompatActivity {

    TextView resultTextView1, resultTextView2, resultTextView3;

    String text1, text2,text3;

    double totalTaxableIncome = 0;
    double totalPayableTax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView1 = findViewById(R.id.resultTextView1);
        resultTextView2 = findViewById(R.id.resultTextView2);
        resultTextView3 = findViewById(R.id.resultTextView3);


        Intent intent = getIntent();
        totalTaxableIncome = intent.getExtras().getDouble("totalTaxableIncome");
        text2 = intent.getStringExtra("ResultTextView2");
        totalPayableTax = intent.getExtras().getDouble("totalPayableTax");

        text1 = "Your Total Taxable Income " + totalTaxableIncome;
        text3 = totalPayableTax + " /= BDT ";


        resultTextView1.setText(text1);
        resultTextView2.setText(text2);
        resultTextView3.setText(text3);

    }
}