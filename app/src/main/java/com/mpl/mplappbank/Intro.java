package com.mpl.mplappbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {
    Button btnLogin, btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnLogin.setOnClickListener(this::Ir_Login);
        btnSignUp.setOnClickListener(this::Ir_SignUp);

    }

    public void Ir_Login(View view) {
        Intent intent=new Intent(this, Login.class);
        startActivity(intent);
    }

    public void Ir_SignUp(View view) {
        Intent intent=new Intent(this, SignUp.class);
        startActivity(intent);
    }
}