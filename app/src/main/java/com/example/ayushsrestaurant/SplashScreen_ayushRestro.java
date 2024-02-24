package com.example.ayushsrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen_ayushRestro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_ayush_restro);

        // Transparent ActionBar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        Thread thread =  new Thread(){
          public void run(){
              try{
                sleep(1000);
              }
              catch(Exception e){
                e.printStackTrace();
              }
              finally{
                  Intent intent = new Intent(SplashScreen_ayushRestro.this, MainActivity.class);
                  startActivity(intent);
              }
          }
        };thread.start();
    }
}