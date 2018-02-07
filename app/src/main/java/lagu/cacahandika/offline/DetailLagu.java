package lagu.cacahandika.offline;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class DetailLagu extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    Intent intent;
    String lagunya;
    int lagu;
    private Context context;
    private TextView lirik,judul;

    private ImageView play,pause;

    private SeekBar seekBar;
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lagu);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        intent = getIntent();
        lagunya = intent.getStringExtra("lagu");

        lagu = Integer.parseInt(lagunya);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setLooping(true);

        mHandler = new Handler();

        context = DetailLagu.this;


        lirik = findViewById(R.id.lirik);
        judul = findViewById(R.id.judul);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        seekBar = findViewById(R.id.seekbar);


        if(lagu == 1){
            mediaPlayer = MediaPlayer.create(context,R.raw.angka_satu);
            lirik.setText(getString(R.string.angka_satu));
            judul.setText("Caca Handika - Angka Satu");
        }else if(lagu == 2){
            mediaPlayer = MediaPlayer.create(context,R.raw.cinta_sabun_mandi);
            lirik.setText(getString(R.string.cinta_sabun_mandi));
            judul.setText("Caca Handika - Cinta Sabun Mandi");

        }else if(lagu == 3){
            mediaPlayer = MediaPlayer.create(context,R.raw.gantungan_baju);
            lirik.setText(getString(R.string.gantungan_baju));
            judul.setText("Caca Handika - Gantungan Baju");

        }
        else if(lagu == 4){
            mediaPlayer = MediaPlayer.create(context,R.raw.malam_penuh_rindu);
            lirik.setText(getString(R.string.malam_penuh_rindu));
            judul.setText("Rhoma Irama - Malam Penuh Rindu");

        }
        else if(lagu == 5){
            mediaPlayer = MediaPlayer.create(context,R.raw.mandi_kembang);
            lirik.setText(getString(R.string.mandi_kembang));
            judul.setText("Caca Handika - Mandi Kembang");

        }
        else if(lagu == 6){
            mediaPlayer = MediaPlayer.create(context,R.raw.pelaminan_kelabu);
            lirik.setText(getString(R.string.pelaminan_kelabu));
            judul.setText("Caca Handika - Pelaminan Kelabu");

        }
        else if(lagu == 7){
            mediaPlayer = MediaPlayer.create(context,R.raw.cincin_putih);
            lirik.setText(getString(R.string.cincin_putih));
            judul.setText("Caca Handika - Cincin Putih");

        }
        else if(lagu == 8){
            mediaPlayer = MediaPlayer.create(context,R.raw.masih_adakah);
            lirik.setText(getString(R.string.masih_adakah));
            judul.setText("Caca Handika - Masih Adakah");

        }
        else if(lagu == 9){
            mediaPlayer = MediaPlayer.create(context,R.raw.pisah_ranjang);
            lirik.setText(getString(R.string.pisah_ranjang));
            judul.setText("Caca Handika - Pisah Ranjang");

        }
        else if(lagu == 10){
            mediaPlayer = MediaPlayer.create(context,R.raw.semua_tahu);
            lirik.setText(getString(R.string.semua_tahu));
            judul.setText("Caca Handika - Semua Tahu");

        }
        else if(lagu == 11){
            mediaPlayer = MediaPlayer.create(context,R.raw.undangan_palsu);
            lirik.setText(getString(R.string.undangan_palsu));
            judul.setText("Caca Handika - Undangan Palsu");

        }
        else if(lagu == 12){
            mediaPlayer = MediaPlayer.create(context,R.raw.air_mata_bawang);
            lirik.setText(getString(R.string.air_mata_bawang));
            judul.setText("Caca Handika - Air Mata Bawang");

        }
        else if(lagu == 13){
            mediaPlayer = MediaPlayer.create(context,R.raw.bawang_merah);
            lirik.setText(getString(R.string.bawang_merah));
            judul.setText("Caca Handika - Bawang Merah");

        }
        else if(lagu == 14){
            mediaPlayer = MediaPlayer.create(context,R.raw.bakar_kemenyan);
            lirik.setText(getString(R.string.bakar_kemenyan));
            judul.setText("Caca Handika - Bakar Kemenyan");

        }
        else if(lagu == 15){
            mediaPlayer = MediaPlayer.create(context,R.raw.karena_judi);
            lirik.setText(getString(R.string.karena_judi));
            judul.setText("Caca Handika - Karena Judi");

        }
        else if(lagu == 16){
            mediaPlayer = MediaPlayer.create(context,R.raw.keangkuhan);
            lirik.setText(getString(R.string.keangkuhan));
            judul.setText("Caca Handika - Keangkuhan");

        }
        else if(lagu == 17){
            mediaPlayer = MediaPlayer.create(context,R.raw.bukan_kata_orang);
            lirik.setText(getString(R.string.bukan_kata_orang));
            judul.setText("Caca Handika - Bukan Kata Orang");

        }
        else if(lagu == 18){
            mediaPlayer = MediaPlayer.create(context,R.raw.jangan_mengharap);
            lirik.setText(getString(R.string.jangan_mengharap));
            judul.setText("Caca Handika - Jangan Mengharap");

        }
        else if(lagu == 19){
            mediaPlayer = MediaPlayer.create(context,R.raw.kesunyian_jiwa);
            lirik.setText(getString(R.string.kesunyian_jiwa));
            judul.setText("Caca Handika - Kesunyian Jiwa");

        }
        else if(lagu == 20){
            mediaPlayer = MediaPlayer.create(context,R.raw.kabina_bina);
            lirik.setText(getString(R.string.kabina_bina));
            judul.setText("Caca Handika - Kabina bina");

        }


        mediaPlayer.start();


        DetailLagu.this.runOnUiThread(new Runnable() {

            @Override
            public void run() {
                if(mediaPlayer != null){
                    int mCurrentPosition = mediaPlayer.getCurrentPosition() / 1000;
                    seekBar.setProgress(mCurrentPosition);
                }
                mHandler.postDelayed(this, 1000);
            }
        });

       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(mediaPlayer != null && fromUser){
                    mediaPlayer.seekTo(progress * 1000);
                }
            }
        });

        if(mediaPlayer.isPlaying()){
            play.setVisibility(View.GONE);
            pause.setVisibility(View.VISIBLE);
        }


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                play.setVisibility(View.GONE);
                pause.setVisibility(View.VISIBLE);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
            }
        });


    }

    public void onBackPressed(){
        super.onBackPressed();
        mediaPlayer.pause();
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
