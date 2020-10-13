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

public class lanjutan_superior extends AppCompatActivity {
    public static int a;
    public static String kamare, value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);
        final EditText lama = (EditText)findViewById(R.id.lamainap);
        final RadioButton dewe = (RadioButton)findViewById(R.id.single);
        final RadioButton dobel = (RadioButton)findViewById(R.id.doubless);
        Button kalku = (Button)findViewById(R.id.proses);
        kalku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lama.getText().toString().trim().length() <=0){
                    Toast.makeText(lanjutan_superior.this,"Data Harus Dilengkapi", Toast.LENGTH_LONG).show();
                }else if(!dewe.isChecked() && !dobel.isChecked()){
                    Toast.makeText(lanjutan_superior.this,"Anda belum memilih Tipe Kamar", Toast.LENGTH_LONG).show();
                }
                else if(dewe.isChecked()){
                    kamare = dewe.getText().toString();
                    value= lama.getText().toString();
                    int lama_inap = Integer.parseInt(value);
                    a=(kamar_superior.harganya+100000)*lama_inap;
                    Intent i =new Intent (getApplicationContext(),verifikasi_superior.class);
                    startActivity(i);
                }
                else if(dobel.isChecked()){
                    kamare = dobel.getText().toString();
                    value= lama.getText().toString();
                    int lama_inap = Integer.parseInt(value);
                    a=(kamar_superior.harganya+200000)*lama_inap;
                    Intent i =new Intent (getApplicationContext(),verifikasi_superior.class);
                    startActivity(i);
                }
            }

        });

    }
}