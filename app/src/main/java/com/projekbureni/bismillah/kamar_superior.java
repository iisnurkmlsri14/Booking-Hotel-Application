package com.projekbureni.bismillah;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.content.DialogInterface;
import android.widget.Spinner;
import android.widget.Toast;

public class kamar_superior extends AppCompatActivity {
    public static int harganya = 450000;
    public static String namaa, value, alamaat, tanggall, bulann, tahunn, tanggalll, bulannn, tahunnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa);
        final EditText nama = (EditText)findViewById(R.id.name);
        final EditText hp = (EditText)findViewById(R.id.phone);
        final EditText alamat = (EditText)findViewById(R.id.address);
        final Spinner tanggal_cekin = (Spinner)findViewById(R.id.tgl);
        final Spinner bulan_cekin = (Spinner)findViewById(R.id.bln);
        final Spinner tahun_cekin = (Spinner)findViewById(R.id.thn);
        final Spinner tanggal_cekot = (Spinner)findViewById(R.id.tglcc);
        final Spinner bulan_cekot = (Spinner)findViewById(R.id.blncc);
        final Spinner tahun_cekot = (Spinner)findViewById(R.id.thncc);

        ImageButton next = (ImageButton)findViewById(R.id.keverifikasi);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(nama.getText().toString().trim().length() <=0 || hp.getText().toString().trim().length() <=0 || alamat.getText().toString().trim().length() <=0 ){
                    Toast.makeText(kamar_superior.this,"Data Harus Dilengkapi", Toast.LENGTH_LONG).show();
                }else{
                     namaa = nama.getText().toString();
                     value = hp.getText().toString();
                    int hpp = Integer.parseInt(value);
                     alamaat = alamat.getText().toString();
                     tanggall =tanggal_cekin.getSelectedItem().toString();
                     bulann =bulan_cekin.getSelectedItem().toString();
                     tahunn =tahun_cekin.getSelectedItem().toString();
                     tanggalll =tanggal_cekot.getSelectedItem().toString();
                     bulannn =bulan_cekot.getSelectedItem().toString();
                     tahunnn =tahun_cekot.getSelectedItem().toString();
                    Intent i =new Intent (getApplicationContext(),lanjutan_superior.class);
                    startActivity(i);
                }

            }
        });
    }
}