package com.projekbureni.bismillah;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class verifikasi extends AppCompatActivity {
    public static int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8);
        TextView namma = (TextView)findViewById(R.id.textView40);
        TextView alammat = (TextView)findViewById(R.id.textView37);
        TextView telpun = (TextView)findViewById(R.id.textView38);
        TextView tannggal = (TextView)findViewById(R.id.textView48);
        TextView blllan = (TextView)findViewById(R.id.textView49);
        TextView thaun = (TextView)findViewById(R.id.textView50);
        TextView tanggalaout = (TextView)findViewById(R.id.textView36);
        TextView bulanaout = (TextView)findViewById(R.id.textView43);
        TextView tahunout = (TextView)findViewById(R.id.textView44);
        TextView jeniskamar = (TextView)findViewById(R.id.textView41);
        TextView fasil = (TextView)findViewById(R.id.textView42);
        TextView lamaa = (TextView)findViewById(R.id.textView35);
        //fungsi
        namma.setText(kamar_standard.namaa);
        alammat.setText(kamar_standard.alamaat);
        telpun.setText(kamar_standard.value);
        tannggal.setText(kamar_standard.tanggall);
        blllan.setText(kamar_standard.bulann);
        thaun.setText(kamar_standard.tahunn);
        tanggalaout.setText(kamar_standard.tanggalll);
        bulanaout.setText(kamar_standard.bulannn);
        tahunout.setText(kamar_standard.tahunnn);
        jeniskamar.setText(lanjutan.kamare);
        lamaa.setText("" + lanjutan.value);
        fasil.setText("Kamar Standard");

        Button ya = (Button)findViewById(R.id.button4);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent (getApplicationContext(),biaya.class);
                startActivity(i);
            }
        });
        Button tidak = (Button)findViewById(R.id.button5);
        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent (getApplicationContext(),kamar_standard.class);
                startActivity(i);
            }
        });
    }
}