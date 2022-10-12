
package com.PrinceTechSolution.TaxCalculator.Tax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdView;

public class IncomeTaxInfo extends AppCompatActivity {

    PDFView pdfView;
    Controls controls;
    AdView adView;
    int Active_Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax_info);

         pdfView = findViewById(R.id.PdfIncomeParipatra);

        pdfView.fromAsset("income_tax_paripatra.pdf").load();


        controls = new Controls(this);
        adView = findViewById(R.id.adView);


        Active_Code = MainActivity.Active_Code;
        if (Active_Code == 100){
            controls.loadBannerAd(adView);
        }



    }
}