package com.mpl.mplappbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        esperarYCerrar(2000);
    }

    private void esperarYCerrar(int tiempo) {
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                llamar();
            }
        },tiempo);
    }
    public void llamar(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}