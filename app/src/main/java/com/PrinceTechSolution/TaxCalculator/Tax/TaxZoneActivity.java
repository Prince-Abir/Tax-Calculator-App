package com.PrinceTechSolution.TaxCalculator.Tax;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.PrinceTechSolution.TaxCalculator.Controls.Controls;
import com.PrinceTechSolution.TaxCalculator.MainActivity;
import com.PrinceTechSolution.TaxCalculator.R;
import com.google.android.gms.ads.AdView;


public class TaxZoneActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView TaxZone1DhakaWebLink, TaxZone1DhakaFacebookLink, TaxZone1DhakaPhone;
    ImageView TaxZone2DhakaWebLink, TaxZone2DhakaFacebookLink, TaxZone2DhakaPhone;
    ImageView TaxZone3DhakaWebLink, TaxZone3DhakaFacebookLink, TaxZone3DhakaPhone;
    ImageView TaxZone4DhakaWebLink, TaxZone4DhakaFacebookLink, TaxZone4DhakaPhone;
    ImageView TaxZone5DhakaWebLink, TaxZone5DhakaFacebookLink, TaxZone5DhakaPhone;
    ImageView TaxZone6DhakaWebLink, TaxZone6DhakaFacebookLink, TaxZone6DhakaPhone;
    ImageView TaxZone7DhakaWebLink, TaxZone7DhakaFacebookLink, TaxZone7DhakaPhone;
    ImageView TaxZone8DhakaWebLink, TaxZone8DhakaFacebookLink, TaxZone8DhakaPhone;
    ImageView TaxZone9DhakaWebLink, TaxZone9DhakaFacebookLink, TaxZone9DhakaPhone;
    ImageView TaxZone11DhakaWebLink, TaxZone11DhakaFacebookLink, TaxZone11DhakaPhone;
    ImageView TaxZone12DhakaWebLink, TaxZone12DhakaFacebookLink, TaxZone12DhakaPhone;
    ImageView TaxZone13DhakaWebLink, TaxZone13DhakaFacebookLink, TaxZone13DhakaPhone;
    ImageView TaxZone14DhakaWebLink, TaxZone14DhakaFacebookLink, TaxZone14DhakaPhone;
    ImageView TaxZone15DhakaWebLink, TaxZone15DhakaFacebookLink, TaxZone15DhakaPhone;

    ImageView TaxZoneMymensinghWebLink, TaxZoneMymensinghFacebookLink, TaxZoneMymensinghPhone;

    ImageView TaxZoneSylhetWebLink, TaxZoneSylhetFacebookLink, TaxZoneSylhetPhone;

    ImageView TaxZone1ChittagongWebLink, TaxZone1ChittagongFacebookLink, TaxZone1ChittagongPhone;
    ImageView TaxZone2ChittagongWebLink, TaxZone2ChittagongFacebookLink, TaxZone2ChittagongPhone;
    ImageView TaxZone3ChittagongWebLink, TaxZone3ChittagongFacebookLink, TaxZone3ChittagongPhone;
    ImageView TaxZone4ChittagongWebLink, TaxZone4ChittagongFacebookLink, TaxZone4ChittagongPhone;

    ImageView TaxZoneGazipurWebLink, TaxZoneGazipurFacebookLink, TaxZoneGazipurPhone;

    ImageView TaxZoneKhulnaWebLink, TaxZoneKhulnaFacebookLink, TaxZoneKhulnaPhone;

    ImageView TaxZoneCumillaWebLink, TaxZoneCumillaFacebookLink, TaxZoneCumillaPhone;

    ImageView TaxZoneRajshahiWebLink, TaxZoneRajshahiFacebooKLink, TaxZoneRajshahiPhone;

    ImageView TaxZoneBarisalWebLink, TaxZoneBarisalFacebookLink, TaxZoneBarisalPhone;

    ImageView TaxZoneBograWebLink, TaxZoneBograFacebookLink, TaxZoneBograPhone;

    ImageView TaxZoneRangpurWebLink, TaxZoneRangpurFacebookLink, TaxZoneRangpurPhone;

    Controls controls;
    AdView adView;

    int Active_Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_zone);

        TaxZone1DhakaWebLink = findViewById(R.id.TaxZone1DhakaWebLink);
        TaxZone1DhakaFacebookLink = findViewById(R.id.TaxZone1DhakaFacebookLink);
        TaxZone1DhakaPhone = findViewById(R.id.TaxZone1DhakaPhone);
        TaxZone1DhakaWebLink.setOnClickListener(this);
        TaxZone1DhakaFacebookLink.setOnClickListener(this);
        TaxZone1DhakaPhone.setOnClickListener(this);


        TaxZone2DhakaWebLink = findViewById(R.id.TaxZone2DhakaWebLink);
        TaxZone2DhakaFacebookLink = findViewById(R.id.TaxZone2DhakaFacebookLink);
        TaxZone2DhakaPhone = findViewById(R.id.TaxZone2DhakaPhone);
        TaxZone2DhakaWebLink.setOnClickListener(this);
        TaxZone2DhakaFacebookLink.setOnClickListener(this);
        TaxZone2DhakaPhone.setOnClickListener(this);

        TaxZone3DhakaWebLink = findViewById(R.id.TaxZone3DhakaWebLink);
        TaxZone3DhakaFacebookLink = findViewById(R.id.TaxZone3DhakaFacebookLink);
        TaxZone3DhakaPhone = findViewById(R.id.TaxZone3DhakaPhone);
        TaxZone3DhakaWebLink.setOnClickListener(this);
        TaxZone3DhakaFacebookLink.setOnClickListener(this);
        TaxZone3DhakaPhone.setOnClickListener(this);


        TaxZone4DhakaWebLink = findViewById(R.id.TaxZone4DhakaWebLink);
        TaxZone4DhakaFacebookLink = findViewById(R.id.TaxZone4DhakaFacebookLink);
        TaxZone4DhakaPhone = findViewById(R.id.TaxZone4DhakaPhone);
        TaxZone4DhakaWebLink.setOnClickListener(this);
        TaxZone4DhakaFacebookLink.setOnClickListener(this);
        TaxZone4DhakaPhone.setOnClickListener(this);


        TaxZone5DhakaWebLink = findViewById(R.id.TaxZone5DhakaWebLink);
        TaxZone5DhakaFacebookLink = findViewById(R.id.TaxZone5DhakaFacebookLink);
        TaxZone5DhakaPhone = findViewById(R.id.TaxZone5DhakaPhone);
        TaxZone5DhakaWebLink.setOnClickListener(this);
        TaxZone5DhakaFacebookLink.setOnClickListener(this);
        TaxZone5DhakaPhone.setOnClickListener(this);

        TaxZone6DhakaWebLink = findViewById(R.id.TaxZone6DhakaWebLink);
        TaxZone6DhakaFacebookLink = findViewById(R.id.TaxZone6DhakaFacebookLink);
        TaxZone6DhakaPhone = findViewById(R.id.TaxZone6DhakaPhone);
        TaxZone6DhakaWebLink.setOnClickListener(this);
        TaxZone6DhakaFacebookLink.setOnClickListener(this);
        TaxZone6DhakaPhone.setOnClickListener(this);


        TaxZone7DhakaWebLink = findViewById(R.id.TaxZone7DhakaWebLink);
        TaxZone7DhakaFacebookLink = findViewById(R.id.TaxZone7DhakaFacebookLink);
        TaxZone7DhakaPhone = findViewById(R.id.TaxZone7DhakaPhone);
        TaxZone7DhakaWebLink.setOnClickListener(this);
        TaxZone7DhakaFacebookLink.setOnClickListener(this);
        TaxZone7DhakaPhone.setOnClickListener(this);


        TaxZone8DhakaWebLink = findViewById(R.id.TaxZone8DhakaWebLink);
        TaxZone8DhakaFacebookLink = findViewById(R.id.TaxZone8DhakaFacebookLink);
        TaxZone8DhakaPhone = findViewById(R.id.TaxZone8DhakaPhone);
        TaxZone8DhakaWebLink.setOnClickListener(this);
        TaxZone8DhakaFacebookLink.setOnClickListener(this);
        TaxZone8DhakaPhone.setOnClickListener(this);


        TaxZone9DhakaWebLink = findViewById(R.id.TaxZone9DhakaWebLink);
        TaxZone9DhakaFacebookLink = findViewById(R.id.TaxZone9DhakaFacebookLink);
        TaxZone9DhakaPhone = findViewById(R.id.TaxZone9DhakaPhone);
        TaxZone9DhakaWebLink.setOnClickListener(this);
        TaxZone9DhakaFacebookLink.setOnClickListener(this);
        TaxZone9DhakaPhone.setOnClickListener(this);

        TaxZone11DhakaWebLink = findViewById(R.id.TaxZone11DhakaWebLink);
        TaxZone11DhakaFacebookLink = findViewById(R.id.TaxZone11DhakaFacebookLink);
        TaxZone11DhakaPhone = findViewById(R.id.TaxZone11DhakaPhone);
        TaxZone11DhakaWebLink.setOnClickListener(this);
        TaxZone11DhakaFacebookLink.setOnClickListener(this);
        TaxZone11DhakaPhone.setOnClickListener(this);

        TaxZone12DhakaWebLink = findViewById(R.id.TaxZone12DhakaWebLink);
        TaxZone12DhakaFacebookLink = findViewById(R.id.TaxZone12DhakaFacebookLink);
        TaxZone12DhakaPhone = findViewById(R.id.TaxZone12DhakaPhone);
        TaxZone12DhakaWebLink.setOnClickListener(this);
        TaxZone12DhakaFacebookLink.setOnClickListener(this);
        TaxZone12DhakaPhone.setOnClickListener(this);


        TaxZone13DhakaWebLink = findViewById(R.id.TaxZone13DhakaWebLink);
        TaxZone13DhakaFacebookLink = findViewById(R.id.TaxZone13DhakaFacebookLink);
        TaxZone13DhakaPhone = findViewById(R.id.TaxZone13DhakaPhone);
        TaxZone13DhakaWebLink.setOnClickListener(this);
        TaxZone13DhakaFacebookLink.setOnClickListener(this);
        TaxZone13DhakaPhone.setOnClickListener(this);


        TaxZone14DhakaWebLink = findViewById(R.id.TaxZone14DhakaWebLink);
        TaxZone14DhakaFacebookLink = findViewById(R.id.TaxZone14DhakaFacebookLink);
        TaxZone14DhakaPhone = findViewById(R.id.TaxZone14DhakaPhone);
        TaxZone14DhakaWebLink.setOnClickListener(this);
        TaxZone14DhakaFacebookLink.setOnClickListener(this);
        TaxZone14DhakaPhone.setOnClickListener(this);


        TaxZone15DhakaWebLink = findViewById(R.id.TaxZone15DhakaWebLink);
        TaxZone15DhakaFacebookLink = findViewById(R.id.TaxZone15DhakaFacebookLink);
        TaxZone15DhakaPhone = findViewById(R.id.TaxZone15DhakaPhone);
        TaxZone15DhakaWebLink.setOnClickListener(this);
        TaxZone15DhakaFacebookLink.setOnClickListener(this);
        TaxZone15DhakaPhone.setOnClickListener(this);

        TaxZoneMymensinghWebLink = findViewById(R.id.TaxZoneMymensinghWebLink);
        TaxZoneMymensinghFacebookLink = findViewById(R.id.TaxZoneMymensinghFacebookLink);
        TaxZoneMymensinghPhone = findViewById(R.id.TaxZoneMymensinghPhone);
        TaxZoneMymensinghWebLink.setOnClickListener(this);
        TaxZoneMymensinghFacebookLink.setOnClickListener(this);
        TaxZoneMymensinghPhone.setOnClickListener(this);

        TaxZoneSylhetWebLink = findViewById(R.id.TaxZoneSylhetWebLink);
        TaxZoneSylhetFacebookLink = findViewById(R.id.TaxZoneSylhetFacebookLink);
        TaxZoneSylhetPhone = findViewById(R.id.TaxZoneSylhetPhone);
        TaxZoneSylhetWebLink.setOnClickListener(this);
        TaxZoneSylhetFacebookLink.setOnClickListener(this);
        TaxZoneSylhetPhone.setOnClickListener(this);


        TaxZone1ChittagongWebLink = findViewById(R.id.TaxZone1ChittagongWebLink);
        TaxZone1ChittagongFacebookLink = findViewById(R.id.TaxZone1ChittagongFacebookLink);
        TaxZone1ChittagongPhone = findViewById(R.id.TaxZone1ChittagongPhone);
        TaxZone1ChittagongWebLink.setOnClickListener(this);
        TaxZone1ChittagongFacebookLink.setOnClickListener(this);
        TaxZone1ChittagongPhone.setOnClickListener(this);

        TaxZone2ChittagongWebLink = findViewById(R.id.TaxZone2ChittagongWebLink);
        TaxZone2ChittagongFacebookLink = findViewById(R.id.TaxZone2ChittagongFacebookLink);
        TaxZone2ChittagongPhone = findViewById(R.id.TaxZone2ChittagongPhone);
        TaxZone2ChittagongWebLink.setOnClickListener(this);
        TaxZone2ChittagongFacebookLink.setOnClickListener(this);
        TaxZone2ChittagongPhone.setOnClickListener(this);

        TaxZone3ChittagongWebLink = findViewById(R.id.TaxZone3ChittagongWebLink);
        TaxZone3ChittagongFacebookLink = findViewById(R.id.TaxZone3ChittagongFacebookLink);
        TaxZone3ChittagongPhone = findViewById(R.id.TaxZone3ChittagongPhone);
        TaxZone3ChittagongWebLink.setOnClickListener(this);
        TaxZone3ChittagongFacebookLink.setOnClickListener(this);
        TaxZone3ChittagongPhone.setOnClickListener(this);

        TaxZone4ChittagongWebLink = findViewById(R.id.TaxZone4ChittagongWebLink);
        TaxZone4ChittagongFacebookLink = findViewById(R.id.TaxZone4ChittagongFacebookLink);
        TaxZone4ChittagongPhone = findViewById(R.id.TaxZone4ChittagongPhone);
        TaxZone4ChittagongWebLink.setOnClickListener(this);
        TaxZone4ChittagongFacebookLink.setOnClickListener(this);
        TaxZone4ChittagongPhone.setOnClickListener(this);

        TaxZoneGazipurWebLink = findViewById(R.id.TaxZoneGazipurWebLink);
        TaxZoneGazipurFacebookLink = findViewById(R.id.TaxZoneGazipurFacebookLink);
        TaxZoneGazipurPhone = findViewById(R.id.TaxZoneGazipurPhone);
        TaxZoneGazipurWebLink.setOnClickListener(this);
        TaxZoneGazipurFacebookLink.setOnClickListener(this);
        TaxZoneGazipurPhone.setOnClickListener(this);


        TaxZoneKhulnaWebLink = findViewById(R.id.TaxZoneKhulnaWebLink);
        TaxZoneKhulnaFacebookLink = findViewById(R.id.TaxZoneKhulnaFacebookLink);
        TaxZoneKhulnaPhone = findViewById(R.id.TaxZoneKhulnaPhone);
        TaxZoneKhulnaWebLink.setOnClickListener(this);
        TaxZoneKhulnaFacebookLink.setOnClickListener(this);
        TaxZoneKhulnaPhone.setOnClickListener(this);


        TaxZoneCumillaWebLink = findViewById(R.id.TaxZoneCumillaWebLink);
        TaxZoneCumillaFacebookLink = findViewById(R.id.TaxZoneCumillaFacebookLink);
        TaxZoneCumillaPhone = findViewById(R.id.TaxZoneCumillaPhone);
        TaxZoneCumillaWebLink.setOnClickListener(this);
        TaxZoneCumillaFacebookLink.setOnClickListener(this);
        TaxZoneCumillaPhone.setOnClickListener(this);


        TaxZoneRajshahiWebLink = findViewById(R.id.TaxZoneRajshahiWebLink);
        TaxZoneRajshahiFacebooKLink = findViewById(R.id.TaxZoneRajshahiFacebookLink);
        TaxZoneRajshahiPhone = findViewById(R.id.TaxZoneRajshahiPhone);
        TaxZoneRajshahiWebLink.setOnClickListener(this);
        TaxZoneRajshahiFacebooKLink.setOnClickListener(this);
        TaxZoneRajshahiPhone.setOnClickListener(this);


        TaxZoneBarisalWebLink = findViewById(R.id.TaxZoneBarisalWebLink);
        TaxZoneBarisalFacebookLink = findViewById(R.id.TaxZoneBarisalFacebookLink);
        TaxZoneBarisalPhone = findViewById(R.id.TaxZoneBarisalPhone);
        TaxZoneBarisalWebLink.setOnClickListener(this);
        TaxZoneBarisalFacebookLink.setOnClickListener(this);
        TaxZoneBarisalPhone.setOnClickListener(this);


        TaxZoneBograWebLink = findViewById(R.id.TaxZoneBograWebLink);
        TaxZoneBograFacebookLink = findViewById(R.id.TaxZoneBograFacebookLink);
        TaxZoneBograPhone = findViewById(R.id.TaxZoneBograPhone);
        TaxZoneBograWebLink.setOnClickListener(this);
        TaxZoneBograFacebookLink.setOnClickListener(this);
        TaxZoneBograPhone.setOnClickListener(this);


        TaxZoneRangpurWebLink = findViewById(R.id.TaxZoneRangpurWebLink);
        TaxZoneRangpurFacebookLink = findViewById(R.id.TaxZoneRangpurFacebookLink);
        TaxZoneRangpurPhone = findViewById(R.id.TaxZoneRangpurPhone);
        TaxZoneRangpurWebLink.setOnClickListener(this);
        TaxZoneRangpurFacebookLink.setOnClickListener(this);
        TaxZoneRangpurPhone.setOnClickListener(this);

        controls = new Controls(this);
        adView = findViewById(R.id.adView);


        Active_Code = MainActivity.Active_Code;

        if (Active_Code == 100) {
            controls.loadBannerAd(adView);
        }


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == TaxZone1DhakaWebLink.getId()) {
            getWebAddress("http://www.taxeszone1.dhaka.gov.bd/");
        } else if (v.getId() == TaxZone1DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxes-Zone-1-Dhaka-266657080515168/");
        } else if (v.getId() == TaxZone1DhakaPhone.getId()) {
            getPhoneCall("02-8362944");
        }
        if (v.getId() == TaxZone2DhakaWebLink.getId()) {
            getWebAddress("http://taxeszone2.gov.bd/web/");
        } else if (v.getId() == TaxZone2DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszone2dhaka");
        } else if (v.getId() == TaxZone2DhakaPhone.getId()) {
            getPhoneCall("02-58311195");
        }

        if (v.getId() == TaxZone3DhakaWebLink.getId()) {
            getWebAddress("http://taxeszone3dhaka.gov.bd/");
        } else if (v.getId() == TaxZone3DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszone3dhaka/");
        } else if (v.getId() == TaxZone3DhakaPhone.getId()) {
            getPhoneCall("02-58313962");
        }

        if (v.getId() == TaxZone4DhakaWebLink.getId()) {
            getWebAddress("https://taxeszone4dhaka.gov.bd/");
        } else if (v.getId() == TaxZone4DhakaFacebookLink.getId()) {
            Toast.makeText(TaxZoneActivity.this, "Tax Zone 4 (Dhaka) has no Facebook Page", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == TaxZone4DhakaPhone.getId()) {
            getPhoneCall("02-9336788");
        }

        if (v.getId() == TaxZone5DhakaWebLink.getId()) {
            getWebAddress("https://www.taxeszone5dhaka.gov.bd/");
        } else if (v.getId() == TaxZone5DhakaFacebookLink.getId()) {
            Toast.makeText(TaxZoneActivity.this, "Tax Zone 5 (Dhaka) has no Facebook Page", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == TaxZone5DhakaPhone.getId()) {
            getPhoneCall("02-58313374");
        }

        if (v.getId() == TaxZone6DhakaWebLink.getId()) {
            getWebAddress("https://www.taxeszone6.gov.bd/");
        } else if (v.getId() == TaxZone6DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszone6dhaka");
        } else if (v.getId() == TaxZone6DhakaPhone.getId()) {
            getPhoneCall("02-55112403");
        }


        if (v.getId() == TaxZone7DhakaWebLink.getId()) {
            getWebAddress("http://www.taxeszone7.gov.bd/");
        } else if (v.getId() == TaxZone7DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxeszone7Dhaka");
        } else if (v.getId() == TaxZone7DhakaPhone.getId()) {
            getPhoneCall("02-58310603");
        }


        if (v.getId() == TaxZone8DhakaWebLink.getId()) {
            getWebAddress("https://taxeszone8dhaka.gov.bd/");
        } else if (v.getId() == TaxZone8DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/TaxesZoneEightDhaka/");
        } else if (v.getId() == TaxZone8DhakaPhone.getId()) {
            getPhoneCall("02-9571616");
        }


        if (v.getId() == TaxZone9DhakaWebLink.getId()) {
            getWebAddress("http://www.taxeszone9dhaka.gov.bd/");
        } else if (v.getId() == TaxZone9DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/profile.php?id=100009818649856");
        } else if (v.getId() == TaxZone9DhakaPhone.getId()) {
            getPhoneCall("02-48963770");
        }


        if (v.getId() == TaxZone11DhakaWebLink.getId()) {
            getWebAddress("http://www.taxeszone11dhaka.gov.bd/");
        } else if (v.getId() == TaxZone11DhakaFacebookLink.getId()) {
            Toast.makeText(TaxZoneActivity.this, "Tax Zone 11 (Dhaka) has no Facebook Page", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == TaxZone11DhakaPhone.getId()) {
            getPhoneCall("02-9568086");
        }


        if (v.getId() == TaxZone12DhakaWebLink.getId()) {
            getWebAddress("https://www.taxeszone12dhaka.gov.bd/");
        } else if (v.getId() == TaxZone12DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszone12dhaka/");
        } else if (v.getId() == TaxZone12DhakaPhone.getId()) {
            getPhoneCall("02-9566467");
        }


        if (v.getId() == TaxZone13DhakaWebLink.getId()) {
            getWebAddress("https://taxeszone13dhaka.gov.bd/public/");
        } else if (v.getId() == TaxZone13DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxes-Zone-13-Dhaka-105871751419420");
        } else if (v.getId() == TaxZone13DhakaPhone.getId()) {
            getPhoneCall("02-9588621");
        }


        if (v.getId() == TaxZone14DhakaWebLink.getId()) {
            getWebAddress("http://taxeszone14.dhaka.gov.bd/");
        } else if (v.getId() == TaxZone14DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxes-Zone-14-Dhaka-100322791904166");
        } else if (v.getId() == TaxZone14DhakaPhone.getId()) {
            getPhoneCall("02-9566683");
        }


        if (v.getId() == TaxZone15DhakaWebLink.getId()) {
            getWebAddress("http://taxeszone15.dhaka.gov.bd/");
        } else if (v.getId() == TaxZone15DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/zone15.dhaka");
        } else if (v.getId() == TaxZone15DhakaPhone.getId()) {
            getPhoneCall("02-58314571");
        }


        if (v.getId() == TaxZone15DhakaWebLink.getId()) {
            getWebAddress("http://taxeszone15.dhaka.gov.bd/");
        } else if (v.getId() == TaxZone15DhakaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/zone15.dhaka");
        } else if (v.getId() == TaxZone15DhakaPhone.getId()) {
            getPhoneCall("02-58314571");
        }


        if (v.getId() == TaxZoneMymensinghWebLink.getId()) {
            getWebAddress("http://www.taxzonemymensingh.gov.bd/");
        } else if (v.getId() == TaxZoneMymensinghFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxeszone-Mymensingh-1195832280438589");
        } else if (v.getId() == TaxZoneMymensinghPhone.getId()) {
            getPhoneCall("091-66120");
        }


        if (v.getId() == TaxZoneSylhetWebLink.getId()) {
            getWebAddress("http://www.taxeszonesylhet.gov.bd/");
        } else if (v.getId() == TaxZoneSylhetFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/tzsylhet/");
        } else if (v.getId() == TaxZoneSylhetPhone.getId()) {
            getPhoneCall("0821-718604");
        }


        if (v.getId() == TaxZone1ChittagongWebLink.getId()) {
            getWebAddress("http://taxctg.com/");
        } else if (v.getId() == TaxZone1ChittagongFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxctg1");
        } else if (v.getId() == TaxZone1ChittagongPhone.getId()) {
            getPhoneCall("031-2525553");
        }


        if (v.getId() == TaxZone2ChittagongWebLink.getId()) {
            getWebAddress("http://www.ctgtaxeszone2.gov.bd/");
        } else if (v.getId() == TaxZone2ChittagongFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/TaxesZone2Chittagong");
        } else if (v.getId() == TaxZone2ChittagongPhone.getId()) {
            getPhoneCall("02333310840");
        }


        if (v.getId() == TaxZone3ChittagongWebLink.getId()) {
            getWebAddress("https://www.taxeszone3ctg.gov.bd/");
        } else if (v.getId() == TaxZone3ChittagongFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszone3ctg");
        } else if (v.getId() == TaxZone3ChittagongPhone.getId()) {
            getPhoneCall("031-2521579");
        }


        if (v.getId() == TaxZone4ChittagongWebLink.getId()) {
            getWebAddress("http://taxeszone4ctg.gov.bd/");
        } else if (v.getId() == TaxZone4ChittagongFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/tax4ctg/");
        } else if (v.getId() == TaxZone4ChittagongPhone.getId()) {
            getPhoneCall("031-710199");
        }


        if (v.getId() == TaxZoneGazipurWebLink.getId()) {
            getWebAddress("https://taxeszonegazipur.gov.bd/");
        } else if (v.getId() == TaxZoneGazipurFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/ctgazipur");
        } else if (v.getId() == TaxZoneGazipurPhone.getId()) {
            getPhoneCall("02-49273200");
        }


        if (v.getId() == TaxZoneKhulnaWebLink.getId()) {
            getWebAddress("http://taxeszone-khulna.com/");
        } else if (v.getId() == TaxZoneKhulnaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxkhulna/");
        } else if (v.getId() == TaxZoneKhulnaPhone.getId()) {
            getPhoneCall("041-762781");
        }


        if (v.getId() == TaxZoneCumillaWebLink.getId()) {
            getWebAddress("http://www.taxeszonecomilla.gov.bd/");
        } else if (v.getId() == TaxZoneCumillaFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/Taxes-Zone-Cumilla-404453699763131");
        } else if (v.getId() == TaxZoneCumillaPhone.getId()) {
            getPhoneCall("081-72400");
        }


        if (v.getId() == TaxZoneRajshahiWebLink.getId()) {
            getWebAddress("http://tax.rajshahi.gov.bd/");
        } else if (v.getId() == TaxZoneRajshahiFacebooKLink.getId()) {
            Toast.makeText(TaxZoneActivity.this, "Tax Zone (Rajshahi) has no Facebook Page", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == TaxZoneRajshahiPhone.getId()) {
            getPhoneCall("0247-812314");
        }


        if (v.getId() == TaxZoneBarisalWebLink.getId()) {
            getWebAddress("http://tax.barisal.gov.bd/");
        } else if (v.getId() == TaxZoneBarisalFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/taxeszonebarishal/");
        } else if (v.getId() == TaxZoneBarisalPhone.getId()) {
            getPhoneCall("0431-2177788");
        }


        if (v.getId() == TaxZoneBograWebLink.getId()) {
            getWebAddress("http://tax.bogra.gov.bd/");
        } else if (v.getId() == TaxZoneBograFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/people/%E0%A6%95%E0%A6%B0-%E0%A6%85%E0%A6%9E%E0%A7%8D%E0%A6%9A%E0%A6%B2-%E0%A6%AC%E0%A6%97%E0%A7%81%E0%A6%A1%E0%A6%BC%E0%A6%BE/100058028033871/");
        } else if (v.getId() == TaxZoneBograPhone.getId()) {
            getPhoneCall("051-61758");
        }


        if (v.getId() == TaxZoneRangpurWebLink.getId()) {
            getWebAddress("http://tax.rangpur.gov.bd/");
        } else if (v.getId() == TaxZoneRangpurFacebookLink.getId()) {
            getWebAddress("https://www.facebook.com/TaxesRangpurZone");
        } else if (v.getId() == TaxZoneRangpurPhone.getId()) {
            getPhoneCall("0521-61772");
        }


    }

    public void getWebAddress(String webUrl) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl)));

    }

    public void getPhoneCall(String phone) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phone)));

    }
}