package com.friendsource.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.file.Files;

public class Main2Activity extends AppCompatActivity {
    Button btncara, btnpesan,btnkeluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btncara =findViewById(R.id.btncara);
        btnpesan =findViewById(R.id.btnpesan);
        btnkeluar =findViewById(R.id.btnExit);

        btncara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, detail.class);
                startActivity(intent);
            }

        });
        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, produk.class);
                startActivity(intent);
            }

        });
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
