package com.friendsource.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class produk extends AppCompatActivity {
    Button btnOppo,btnIphone,btnBlackshark,btnSamsung;
    String merk,harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);
        btnOppo = findViewById(R.id.btnOppo);
        btnIphone = findViewById(R.id.btnIphone);
        btnBlackshark=findViewById(R.id.btnBlackshark);
        btnSamsung=findViewById(R.id.btnSamsung);

        btnOppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(produk.this, pesan.class);
               intent.putExtra("harga","80000000");
               intent.putExtra("merk","Oppo FindX");
               startActivity(intent);
            }
        });
        btnIphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(produk.this, pesan.class);
                intent.putExtra("harga","170000000");
                intent.putExtra("merk","Iphone 11 Pro");
                startActivity(intent);
            }
        });
        btnSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(produk.this, pesan.class);
                intent.putExtra("harga","160000000");
                intent.putExtra("merk","Samsung S20");
                startActivity(intent);
            }
        });
        btnBlackshark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(produk.this, pesan.class);
                intent.putExtra("harga","70000000");
                intent.putExtra("merk","Xiaomi BlackShark 2");
                startActivity(intent);
            }
        });
    }
}
