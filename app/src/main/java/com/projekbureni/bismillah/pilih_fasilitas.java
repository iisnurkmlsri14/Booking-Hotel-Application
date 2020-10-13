package com.projekbureni.bismillah;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.content.DialogInterface;

public class pilih_fasilitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iya);
        ImageButton standard = (ImageButton)findViewById(R.id.standard1);
        ImageButton superior = (ImageButton)findViewById(R.id.superior1);
        ImageButton suite = (ImageButton)findViewById(R.id.suite1);
        ImageButton suite1 = (ImageButton)findViewById(R.id.suite2);
        ImageButton suite2 = (ImageButton)findViewById(R.id.suite3);

        standard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i =new Intent (getApplicationContext(),kamar_standard.class);
                startActivity(i);
            }
        });
        superior.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a =new Intent (getApplicationContext(),kamar_superior.class);
                startActivity(a);
            }
        });
        suite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent b =new Intent (getApplicationContext(),kamar_suite.class);
                startActivity(b);
            }
        });
        suite1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent b =new Intent (getApplicationContext(),kamar_suite2.class);
                startActivity(b);
            }
        });
        suite2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent b =new Intent (getApplicationContext(),kamar_suite3.class);
                startActivity(b);
            }
        });
    }
}