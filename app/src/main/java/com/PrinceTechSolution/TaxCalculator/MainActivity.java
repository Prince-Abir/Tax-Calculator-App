package com.PrinceTechSolution.TaxCalculator;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.Models.CustomModelOne;
import com.PrinceTechSolution.TaxCalculator.Tax.TaxMain;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    RecyclerView recyclerView;
    Controls controls;
    AdView adView;

    public static int Active_Code = 0;

    ArrayList<CustomModelOne> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = findViewById(R.id.adView);
        controls = new Controls(this);

        ShowAds();
        RecyclerPartOne();
        RecyclerPartTwo();
        SlideImage();
        RecyclerPartThree();
        RecyclerPartFour();
        bottomNavTask();


        controls.adInitialization();
        controls.initDeviceId();

        if (Active_Code == 100) {

            adView.setVisibility(View.VISIBLE);
            controls.loadBannerAd(adView);

        }


    }

    public void ShowAds() {

        String URL = "https://princetechsoft.000webhostapp.com/NBR%20Helpdesk/AdsController.php";

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if (response.contains("AdsON")) {

                    Active_Code = 100;
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Active_Code = 0;
            }
        });

        requestQueue.add(stringRequest);


    }

    public void RecyclerPartOne() {


        recyclerView = findViewById(R.id.MainFirstRecyclerView);

        list = new ArrayList<>();


        String[] array = getResources().getStringArray(R.array.MainPartString);
        int[] imageID = {R.drawable.tax_calculate, R.drawable.faq_one, R.drawable.information, R.drawable.faq_two, R.drawable.vat_e_service, R.drawable.vat_form, R.drawable.tariff, R.drawable.custom_e_service};


        for (int i = 0; i < 8; i++) {
            CustomModelOne customModelOne = new CustomModelOne(array[i], imageID[i]);
            list.add(customModelOne);

        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

    }

    public void RecyclerPartTwo() {


        recyclerView = findViewById(R.id.MainSecondRecyclerView);

        list = new ArrayList<>();


        String[] array = getResources().getStringArray(R.array.TaxString);
        int[] imageID = {R.drawable.tax, R.drawable.file, R.drawable.search, R.drawable.weblink};


        for (int i = 0; i < array.length; i++) {
            CustomModelOne customModelOne = new CustomModelOne(array[i], imageID[i]);
            list.add(customModelOne);

        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setHasFixedSize(true);


        Button button = findViewById(R.id.Tax_More);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TaxMain.class));
            }
        });
    }

    public void RecyclerPartThree() {


        recyclerView = findViewById(R.id.MainThirdRecyclerView);
        Button button = findViewById(R.id.Vat_More);

        list = new ArrayList<>();


        String[] array = getResources().getStringArray(R.array.VatString);
        int[] imageID = {R.drawable.tax_calculate, R.drawable.vat_form, R.drawable.vat_e_service, R.drawable.faq_two, R.drawable.info, R.drawable.information};


        for (int i = 0; i < array.length; i++) {
            CustomModelOne customModelOne = new CustomModelOne(array[i], imageID[i]);
            list.add(customModelOne);

        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setHasFixedSize(true);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewAdapter.CustomAlert();
            }
        });

    }

    public void bottomNavTask() {

        bottomNavigationView = findViewById(R.id.bottom_nav);


//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                String Item  = item.getTitle().toString();
//                item.getIcon().setTint(Color.RED);
//
//                if (Item.contains("Home")){
//
//
//                }
//                else if(Item.contains("Tax"))
//                {
//
//
//                }
//                else if (Item.contains("Vat"))
//                {
//
//
//                }
//                else{
//
//
//                }
//                return true;
//            }
//        });
    }

    public void SlideImage() {


        ImageSlider imageSlider = findViewById(R.id.imageSlider);

        List<SlideModel> list = new ArrayList<>();
        list.add(new SlideModel(R.drawable.nbr1, ScaleTypes.FIT));
        list.add(new SlideModel(R.drawable.nbr2, ScaleTypes.FIT));
        list.add(new SlideModel(R.drawable.nbr3, ScaleTypes.FIT));
        list.add(new SlideModel(R.drawable.nbr4, ScaleTypes.FIT));
        list.add(new SlideModel(R.drawable.nbr5, ScaleTypes.FIT));

        imageSlider.setImageList(list);

    }

    public void RecyclerPartFour() {


        recyclerView = findViewById(R.id.MainFourthRecyclerView);
        Button button = findViewById(R.id.Customs_More);

        list = new ArrayList<>();


        String[] array = getResources().getStringArray(R.array.CustomString);
        int[] imageID = {R.drawable.tariff, R.drawable.faq_two, R.drawable.evaluation, R.drawable.custom_e_service, R.drawable.info};


        for (int i = 0; i < array.length; i++) {
            CustomModelOne customModelOne = new CustomModelOne(array[i], imageID[i]);
            list.add(customModelOne);

        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setHasFixedSize(true);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewAdapter.CustomAlert();
            }
        });


    }

    public void showExitDialog() {

        TextView exit, cancel;
        TemplateView templateView;


        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View view = LayoutInflater.from(this).inflate(R.layout.custom_alertdialog_exit_app, null);
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog.show();


        exit = alertDialog.findViewById(R.id.exit);
        cancel = alertDialog.findViewById(R.id.cancel);
        templateView = alertDialog.findViewById(R.id.native_ad);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.super.onBackPressed();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        if (Active_Code == 100) {

            AdLoader adLoader = new AdLoader.Builder(this, getResources().getString(R.string.nativeId))
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {

                            NativeTemplateStyle styles = new NativeTemplateStyle.Builder().build();

                            templateView.setStyles(styles);
                            templateView.setNativeAd(nativeAd);
                        }
                    })
                    .build();

            adLoader.loadAd(new AdRequest.Builder().build());

        }


    }

    @Override
    public void onBackPressed() {

        showExitDialog();
    }


}

