
package com.projekbureni.bismillah;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class biaya_suite extends AppCompatActivity {
    //Mendefinisikan variabel
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    public static int b,c;
    public static String kamare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain6);
        // Menginisiasi Toolbar dan mensetting sebagai actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Menginisiasi  NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
                switch (menuItem.getItemId()) {
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(), "Beranda Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent (getApplicationContext(),navbar.class);
                        startActivity(i);
                        return true;
                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(),"Deluxe Room Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent a =new Intent (getApplicationContext(),menuiis.class);
                        startActivity(a);
                        return true;
                    case R.id.navigation3:
                        Toast.makeText(getApplicationContext(),"Loft Room Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent d =new Intent (getApplicationContext(),menuiis1.class);
                        startActivity(d);
                        return true;
                    case R.id.navigation4:
                        Toast.makeText(getApplicationContext(),"Deluxe Suite Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent e =new Intent (getApplicationContext(),menuiis2.class);
                        startActivity(e);
                        return true;
                    case R.id.navigation5:
                        Toast.makeText(getApplicationContext(),"Rock Star Suite Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent f =new Intent (getApplicationContext(),menuiis3.class);
                        startActivity(f);
                        return true;
                    case R.id.navigation6:
                        Toast.makeText(getApplicationContext(),"King Suite Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent g =new Intent (getApplicationContext(),menuiis4.class);
                        startActivity(g);
                        return true;
                    case R.id.navigation7:
                        Toast.makeText(getApplicationContext(), "Informasi Diskon Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent b = new Intent(getApplicationContext(), about.class);
                        startActivity(b);
                        return true;
                    case R.id.navigation8:
                        Toast.makeText(getApplicationContext(), "About Us telah dipilih", Toast.LENGTH_SHORT).show();
                        Intent c = new Intent(getApplicationContext(), diskon.class);
                        startActivity(c);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Kesalahan Terjadi ", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        // Menginisasi Drawer Layout dan ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }

        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
        TextView harga = (TextView)findViewById(R.id.textView22);
        harga.setText("Total Biaya yang harus anda bayarkan sebesar : Rp. "+lanjutan_suite.a);
        final TextView diskonan = (TextView)findViewById(R.id.textView24);
        final EditText diskon = (EditText)findViewById(R.id.editText19);
        Button proses_diskon = (Button)findViewById(R.id.button2);
        proses_diskon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(diskon.getText().toString().trim().length() <=0){
                    Toast.makeText(biaya_suite.this,"Kode diskon kosong", Toast.LENGTH_LONG).show();
                }
                else if (diskon.getText().toString().equals("biola")){
                    b=lanjutan.a*25/100;
                    c= lanjutan.a-b;
                    diskonan.setText("Setelah dipotong diskon, harga yang harus anda bayarkan sebesar : Rp. "+c );
                }
                else if (diskon.getText().toString().equals("piano")){
                    b=lanjutan.a*30/100;
                    c= lanjutan.a-b;
                    diskonan.setText("Setelah dipotong diskon, harga yang harus anda bayarkan sebesar : Rp. "+c );
                }
                else if (diskon.getText().toString().equals("gitar")){
                    b=lanjutan.a*35/100;
                    c= lanjutan.a-b;
                    diskonan.setText("Setelah dipotong diskon, harga yang harus anda bayarkan sebesar : Rp. "+c );
                }
                else {
                    Toast.makeText(biaya_suite.this,"Kode diskon salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}