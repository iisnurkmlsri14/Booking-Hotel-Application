package com.projekbureni.bismillah;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.projekbureni.bismillah.MainActivity;
import com.projekbureni.bismillah.R;


public class splash extends AppCompatActivity{
    private static int splashInterval = 2500;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        Thread myThread = new Thread (){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),navbar.class);
                    startActivity(intent);
                    finish();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
