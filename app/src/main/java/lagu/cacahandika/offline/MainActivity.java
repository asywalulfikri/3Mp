package lagu.cacahandika.offline;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    private MediaPlayer mediaPlayer;

    private InterstitialAd mInterstitialAd1;
    private InterstitialAd mInterstitialAd2;
    private boolean interstitialCanceled = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        interestitialId1();

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","1");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","2");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","3");
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","4");
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","5");
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","6");
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","7");
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","8");
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","9");
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","10");
                startActivity(intent);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","11");
                startActivity(intent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","12");
                startActivity(intent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","13");
                startActivity(intent);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","14");
                startActivity(intent);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","15");
                startActivity(intent);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","16");
                startActivity(intent);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","17");
                startActivity(intent);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","18");
                startActivity(intent);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","19");
                startActivity(intent);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this,DetailLagu.class);
                intent.putExtra("lagu","20");
                startActivity(intent);
            }
        });



    }

    private void interestitialId1(){

        if (getResources().getBoolean(R.bool.enableAds)) {

            mInterstitialAd1 = new InterstitialAd(this);
            mInterstitialAd1.setAdUnitId(getString(R.string.interstitial_ad_sample));
            mInterstitialAd1.loadAd(new AdRequest.Builder().build());

            mInterstitialAd1.setAdListener(new AdListener() {

                @Override
                public void onAdClosed() {
                    mInterstitialAd1.loadAd(new AdRequest.Builder().build());
                    interstitialCanceled = true;
                    super.onAdClosed();
                }

                @Override
                public void onAdFailedToLoad(int i) {
                    mInterstitialAd1.loadAd(new AdRequest.Builder().build());
                    super.onAdFailedToLoad(i);
                }
            });
        }
    }




}
