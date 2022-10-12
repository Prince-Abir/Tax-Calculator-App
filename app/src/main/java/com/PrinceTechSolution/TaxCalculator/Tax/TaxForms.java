package com.PrinceTechSolution.TaxCalculator.Tax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.TextView;
import android.widget.Toast;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.google.android.gms.ads.AdView;

public class TaxForms extends AppCompatActivity {

    Controls controls;
    AdView adview;

    int Active_Code;

    CardView form1,form2,form3,form4,form5,form6,form7,form8,form9,form10,form11,form12,form13,form14,form15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_forms);


        TextView textView = findViewById(R.id.toolBarArea);
        getSupportActionBar().hide();



        form1 = findViewById(R.id.taxform1);
        form2 = findViewById(R.id.taxform2);
        form3 = findViewById(R.id.taxform3);
        form4 = findViewById(R.id.taxform4);
        form5 = findViewById(R.id.taxform5);
        form6 = findViewById(R.id.taxform6);
        form7 = findViewById(R.id.taxform7);
        form8 = findViewById(R.id.taxform8);
        form9 = findViewById(R.id.taxform9);
        form10 = findViewById(R.id.taxform10);
        form11 = findViewById(R.id.taxform11);
        form12 = findViewById(R.id.taxform12);
        form13 = findViewById(R.id.taxform13);
        form14 = findViewById(R.id.taxform14);
        form15 = findViewById(R.id.taxform15);

        adview = findViewById(R.id.adView);

        controls = new Controls(this);



        Active_Code = MainActivity.Active_Code;

        if (Active_Code == 100){
            controls.adInitialization();
            controls.loadBannerAd(adview);
        }






        String[] link = getResources().getStringArray(R.array.tax_form_links);


        form1.setOnClickListener( v-> DownloadFile(link[0]));

        form2.setOnClickListener( v-> DownloadFile(link[1]));

        form3.setOnClickListener( v-> DownloadFile(link[2]));

        form4.setOnClickListener( v-> DownloadFile(link[3]));

        form5.setOnClickListener( v-> DownloadFile(link[4]));

        form6.setOnClickListener( v-> DownloadFile(link[5]));

        form7.setOnClickListener( v-> DownloadFile(link[6]));

        form8.setOnClickListener( v-> DownloadFile(link[7]));

        form9.setOnClickListener( v-> DownloadFile(link[8]));

        form10.setOnClickListener( v-> DownloadFile(link[9]));

        form11.setOnClickListener( v-> DownloadFile(link[10]));

        form12.setOnClickListener( v-> DownloadFile(link[11]));

        form13.setOnClickListener( v-> DownloadFile(link[12]));

        form14.setOnClickListener( v-> DownloadFile(link[13]));

        form15.setOnClickListener( v-> DownloadFile(link[14]));


    }



    public void DownloadFile(String Url){

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(Url));
        String fileName = URLUtil.guessFileName(Url,"PDF File",null);
        request.setTitle(fileName);
        request.setDescription("Downloading please wait...");
        String cookie = CookieManager.getInstance().getCookie(Url);
        request.addRequestHeader("Cookie",cookie);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,fileName);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);



        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

        downloadManager.enqueue(request);

        Toast.makeText(this, "Download has started", Toast.LENGTH_SHORT).show();


        request.setVisibleInDownloadsUi(true);
    }
}