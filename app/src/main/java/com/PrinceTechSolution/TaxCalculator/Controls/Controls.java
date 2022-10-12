package com.PrinceTechSolution.TaxCalculator.Controls;


import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.RemoteViews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.PrinceTechSolution.TaxCalculator.BuildConfig;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Controls {


    private Activity activity;
    private Context context;
    int range = 10;
    int randomNumber = 0;
    int mInterstitialAdLoadCount = 1;
    private InterstitialAd mInterstitialAd;
    private int banner_Ad_Click_Count = 0;


    public Controls(Activity activity) {
        this.activity = activity;
    }
    public Controls(Context context){
        this.context = context;
    }


    //Checking the Internet Connection
    public boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }


    // Custom Alert Dialog for Checking Internet Connection
    public void CustomDialog() {

        new AlertDialog.Builder(activity)
                .setTitle("Network Error!")
                .setMessage("Please Check Your Network Connection!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create()
                .show();
    }


    // Admob Ad Initialization
    public void adInitialization() {

        //Initializing the Mobile Ads
        MobileAds.initialize(activity, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
        Log.d("TAG", "Initialized");

    }


    //Loading The Banner Ad
    public void loadBannerAd(AdView bannerAdView) {

        //Banner Ad Code Start......

        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdView.loadAd(adRequest);
        Log.d("TAG", "Ad Request Successful");

        bannerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAdView.loadAd(adRequest);
                Log.d("TAG", "Ad Loaded Successfully");

            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
                banner_Ad_Click_Count++;
                if (banner_Ad_Click_Count >= 2) {
                    if (bannerAdView != null) bannerAdView.setVisibility(View.GONE);
                }
            }
        });
        //Banner Ad Code Finish........

    }


    //Loading the Interstitial Ad
    public void loadInterstitialAd(String interstitialAdId) {

        AdRequest adRequest = new AdRequest.Builder().build();


        InterstitialAd.load(activity.getApplicationContext(), interstitialAdId, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Random random = new Random();
                        randomNumber = random.nextInt(range);
                        //Toast.makeText(activity, "Random Number : "+randomNumber, Toast.LENGTH_SHORT).show();
                        if (mInterstitialAdLoadCount <= 5) {
                            if (randomNumber == 1 || randomNumber == 3 || randomNumber == 6 || randomNumber == 8 || randomNumber == 9) {
                                mInterstitialAd.show(activity);
                                mInterstitialAdLoadCount++;
                            }
                        } else {
                            mInterstitialAd = null;
                        }
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;
                        InterstitialAd.load(activity.getApplicationContext(), interstitialAdId, adRequest,
                                new InterstitialAdLoadCallback() {
                                    @Override
                                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                        // The mInterstitialAd reference will be null until
                                        // an ad is loaded.
                                        mInterstitialAd = interstitialAd;
                                        Random random = new Random();
                                        randomNumber = random.nextInt(range);
                                        //Toast.makeText(activity, "Random Number : "+randomNumber, Toast.LENGTH_SHORT).show();
                                        if (mInterstitialAdLoadCount <= 5) {
                                            if (randomNumber == 1 || randomNumber == 3 || randomNumber == 6 || randomNumber == 8 || randomNumber == 9) {
                                                mInterstitialAd.show(activity);
                                                mInterstitialAdLoadCount++;
                                            }
                                        } else {
                                            mInterstitialAd = null;
                                        }
                                    }

                                    @Override
                                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                        // Handle the error
                                        Log.i("TAG", loadAdError.getMessage());
                                        mInterstitialAd = null;
                                    }
                                });
                    }

                });

    }


    //    Initializing The Test Device ID
    public void initDeviceId() {

        List<String> testDeviceIds = Arrays.asList("c804a743-0f43-4817-bd2d-10ca1ad1abe1");
        RequestConfiguration requestConfiguration = new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
        MobileAds.setRequestConfiguration(requestConfiguration);
    }


    // Implementation of Rate Us On Google Button
    public void rateUsOnGoogle() {


        String packageName = activity.getPackageName();

        try {
            Uri uri = Uri.parse("market:details?id=" + packageName);
            activity.startActivity(new Intent(Intent.ACTION_VIEW, uri));
        } catch (ActivityNotFoundException | RemoteViews.ActionException e) {

            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + packageName);
            activity.startActivity(new Intent(Intent.ACTION_VIEW, uri));

        }

    }


    //Showing More App on PlayStore
    public void MoreApp() {

        Uri uri = Uri.parse("https://play.google.com/store/search?q=pub%3A%20Prince%20Tech%20Solution&c=apps");
        activity.startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }


    //Send Email Us
    public void EmailUs() {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mahmudabir886@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry from User");
        intent.putExtra(Intent.EXTRA_TEXT, "");
        activity.startActivity(Intent.createChooser(intent, "Email"));
    }


    //Share this App
    public void ShareApp() {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Tax Flow");
        intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
        activity.startActivity(Intent.createChooser(intent, "Share via"));
    }


    public boolean RandomMatched(){

        Random random = new Random();
        randomNumber = random.nextInt(10);

        return randomNumber == 3 || randomNumber == 4 || randomNumber == 6 || randomNumber == 9;
    }

}

