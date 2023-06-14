package com.jetbreed.andriodlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2Activity extends AppCompatActivity {

    Button victor;
    Button briggs;
    Button wendy;
    Button mitchie;
    Button wills;
    Button adefx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        victor = findViewById(R.id.victor);
        briggs = findViewById(R.id.briggs);
        wendy = findViewById(R.id.wendy);
        mitchie = findViewById(R.id.mitchie);
        wills = findViewById(R.id.wills);
        adefx = findViewById(R.id.adefx);

        victor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent victor = new Intent(Page2Activity.this,
                        VictorActivity.class);
                startActivity(victor);
            }
        });

        briggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent briggs = new Intent(Page2Activity.this,
                        BriggsActivity.class);
                startActivity(briggs);
            }
        });

        wendy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wendy = new Intent(Page2Activity.this,
                        WendyActivity.class);
                startActivity(wendy);
            }
        });

        mitchie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mitchie = new Intent(Page2Activity.this,
                        MitchieActivity.class);
                startActivity(mitchie);
            }
        });

        wills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wills = new Intent(Page2Activity.this,
                        WillsActivity.class);
                startActivity(wills);
            }
        });

        adefx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adefx = new Intent(Page2Activity.this,
                        AdefxActivity.class);
                startActivity(adefx);

                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });


    }
}