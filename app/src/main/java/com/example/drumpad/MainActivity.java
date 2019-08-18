package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1, m2, m3, m4, m5, m6, m7, m8,m9,m10,m11,m12;

    ImageButton i1, i2, i3, i4, i5, i6, i7, i8,i9,i10,i11,i12;

    @Override
    public void onBackPressed() {

        finish();

        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this,R.raw.one);
        m2 = MediaPlayer.create(this,R.raw.two);
        m3 = MediaPlayer.create(this,R.raw.three);
        m4 = MediaPlayer.create(this,R.raw.four);
        m5 = MediaPlayer.create(this,R.raw.fv);
        m6 = MediaPlayer.create(this,R.raw.sixth);
        m7 = MediaPlayer.create(this,R.raw.seventh);
        m8 = MediaPlayer.create(this,R.raw.one);
        m9 = MediaPlayer.create(this,R.raw.sixth);
        m10 = MediaPlayer.create(this,R.raw.four);
        m11 = MediaPlayer.create(this,R.raw.eighth);
        m12 = MediaPlayer.create(this,R.raw.new_song);

        i1 = findViewById(R.id.Image1);
        i2 = findViewById(R.id.Image2);
        i3 = findViewById(R.id.Image3);
        i4 = findViewById(R.id.Image4);
        i5 = findViewById(R.id.Image5);
        i6 = findViewById(R.id.Image6);
        i7 = findViewById(R.id.Image7);
        i8 = findViewById(R.id.Image8);
        i9 = findViewById(R.id.Image9);
        i10 = findViewById(R.id.Image10);
        i11 = findViewById(R.id.Image11);
        i12 = findViewById(R.id.Image12);

//        i1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m1.start();
//            }
//        });
//
//        i2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m2.start();
//            }
//        });
//
//        i3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m3.start();
//            }
//        });
//
//        i4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m4.start();
//            }
//        });
//
//        i5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m5.start();
//            }
//        });
//
//        i6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m6.start();
//            }
//        });
//
//        i7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m7.start();
//            }
//        });
//
//        i8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                m8.start();
//            }
//        });

//
//            }
//        }


    }

    public void play_sound(View view) {

        switch (view.getId()) {

            case R.id.Image1:
                //m1 = MediaPlayer.create(this, R.raw.one);
                m1.start();
                break;

            case R.id.Image2:
                //m2 = MediaPlayer.create(this, R.raw.two);
                m2.start();
                break;

            case R.id.Image3:
                //m3 = MediaPlayer.create(this, R.raw.three);
                m3.start();
                break;

            case R.id.Image4:
                //m4 = MediaPlayer.create(this, R.raw.four);
                m4.start();
                break;

            case R.id.Image5:
                //m5 = MediaPlayer.create(this, R.raw.fv);
                m5.start();
                break;

            case R.id.Image6:
                //m6 = MediaPlayer.create(this, R.raw.seventh);
                m7.start();
                break;

            case R.id.Image7:
                //m7 = MediaPlayer.create(this, R.raw.eighth);
                m7.start();
                break;

            case R.id.Image8:
            //m8 = MediaPlayer.create(this, R.raw.eighth);
            m8.start();
            break;

            case R.id.Image9:
                //m8 = MediaPlayer.create(this, R.raw.eighth);
                m9.start();
                break;

            case R.id.Image10:
                //m8 = MediaPlayer.create(this, R.raw.eighth);
                m10.start();
                break;

            case R.id.Image11:
                //m8 = MediaPlayer.create(this, R.raw.eighth);
                m11.start();
                break;

            case R.id.Image12:
                //m8 = MediaPlayer.create(this, R.raw.eighth);
                m12.start();
                break;

        }
    }
}
