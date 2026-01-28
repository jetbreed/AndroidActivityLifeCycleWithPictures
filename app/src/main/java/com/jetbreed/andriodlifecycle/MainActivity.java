package com.jetbreed.andriodlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startBtn;
    String startBtn1;


    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "ON RESUME",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "ON START",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "ON CREATE",
                Toast.LENGTH_LONG).show();

        startBtn = findViewById(R.id.startBtn);

        startBtn.setOnClickListener(view -> {
            Intent page2 =
                    new Intent(getApplicationContext(),
                            Page2Activity.class);
            startActivity(page2);

            overridePendingTransition(R.anim.slide_in_left,
                    R.anim.slide_out_right);
        });

    }



    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "ON RESTART",
                Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "ON STOP",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "ON PAUSE",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "ON DESTROY",
                Toast.LENGTH_SHORT).show();

    }
}