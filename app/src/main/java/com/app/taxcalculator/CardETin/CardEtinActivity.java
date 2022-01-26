package com.app.taxcalculator.CardETin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.taxcalculator.R;


public class CardEtinActivity extends AppCompatActivity {

    TextView ETinRegistrationButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_etin);

        ETinRegistrationButton = findViewById(R.id.etinRegistrationButton);


        ETinRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardEtinActivity.this,EtinRegistrationProcessActivity.class));
            }
        });


    }
}