package com.example.ayushsrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, register, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked Login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SignIn_activity.class);
                startActivity(intent);
            }
        });

        register = findViewById(R.id.btnregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register your details !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Sign_inActivity.class);
                startActivity(intent);
            }
        });


    }

}