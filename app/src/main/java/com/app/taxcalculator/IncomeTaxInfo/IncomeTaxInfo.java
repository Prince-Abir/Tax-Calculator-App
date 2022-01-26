
package com.app.taxcalculator.IncomeTaxInfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.taxcalculator.R;
import com.github.barteksc.pdfviewer.PDFView;

public class IncomeTaxInfo extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax_info);

         pdfView = findViewById(R.id.PdfIncomeParipatra);

        pdfView.fromAsset("income_tax_paripatra.pdf").load();



    }
}