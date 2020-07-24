package com.friendsource.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nota extends AppCompatActivity {
    TextView txnama,txalamat,t_merk,t_harga,t_jumlahbeli,t_warna,t_aksesoris,t_total;
    Button btnmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        txnama = findViewById(R.id.t_nama);
        txalamat = findViewById(R.id.t_alamat);
        t_merk = findViewById(R.id.t_merk);
        t_harga = findViewById(R.id.t_harga);
        t_aksesoris = findViewById(R.id.t_aksesoris);
        t_jumlahbeli = findViewById(R.id.t_jumlahbeli);
        t_warna = findViewById(R.id.t_warna);
        t_total = findViewById(R.id.t_total);
        btnmenu = findViewById(R.id.btnmenu);

        if(getIntent().getStringExtra("nama") != null){
            txnama.setText(": "+getIntent().getStringExtra("nama"));
        }
        if(getIntent().getStringExtra("alamat") != null){
            txalamat.setText(": "+getIntent().getStringExtra("alamat"));
        }
        if(getIntent().getStringExtra("merk") != null){
            t_merk.setText(": "+getIntent().getStringExtra("merk"));
        }
        if(getIntent().getStringExtra("harga") != null){
            t_harga.setText(": RP. "+getIntent().getStringExtra("harga"));
        }
        if(getIntent().getStringExtra("warna") != null){
            t_warna.setText(": "+getIntent().getStringExtra("warna"));
        }
        if(getIntent().getStringExtra("jumlah") != null){
            t_jumlahbeli.setText(": "+getIntent().getStringExtra("jumlah"));
        }
        if(getIntent().getStringExtra("aksesoris") != null){
            t_aksesoris.setText(": "+getIntent().getStringExtra("aksesoris"));
        }
        int jumlah = Integer.parseInt(getIntent().getStringExtra("jumlah"));
        int harga = Integer.parseInt(getIntent().getStringExtra("harga"));
        t_total.setText(": RP. "+(jumlah*harga));
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nota.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
