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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button_awal);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent (getApplicationContext(),pilih_fasilitas.class);
                startActivity(i);
            }
        });
        ImageButton kontak = (ImageButton)findViewById(R.id.contact);
        kontak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Contact Us").setMessage("Email : pophotel@gmail.com\nFacebook : pophotelindonesia\nIG : @pophotelindo\nNo : 031 - 8234578").setNeutralButton("OKE!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();}
                }).show();
            }
        });
        ImageButton keluar = (ImageButton)findViewById(R.id.exit);
        keluar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apa anda ingin keluar?").setCancelable(false) .setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }
}
