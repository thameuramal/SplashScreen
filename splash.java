package com.example.user.repairmycity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//page SplashScreen
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Entre.class);
                startActivity(intent);
                finish();

            }
        };
        new Handler().postDelayed(runnable,3000);
    }
}
