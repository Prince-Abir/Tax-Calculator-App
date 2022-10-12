package com.PrinceTechSolution.TaxCalculator.Tax;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.R;
import com.github.barteksc.pdfviewer.PDFView;


public class EtinRegistrationProcessActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etin_registration_process);


        pdfView = findViewById(R.id.PdfEtinRegistrationView);

        pdfView.fromAsset("etin_registration_process.pdf").load();


    }
}