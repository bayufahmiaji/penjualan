package com.friendsource.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class pesan extends AppCompatActivity {
    Spinner spjumlah;
    TextView txharga, txmerk;
    Button btnpesan, B_Cetak;
    RadioGroup Radiowarna;
    CheckBox cbxheadset, cbxantigores, cbxanticrack;
    EditText txtnama,txtalamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        spjumlah = findViewById(R.id.Spinerjumlah);
        txmerk = (TextView) findViewById(R.id.etMerk);
        txharga = (TextView) findViewById(R.id.etHarga);
        btnpesan = findViewById(R.id.btnpesan);
        B_Cetak  = findViewById(R.id.B_Cetak);
        Radiowarna = findViewById(R.id.Radiowarna);
        cbxheadset    = findViewById(R.id.cbxheadset);
        cbxantigores = findViewById(R.id.cbxantigores);
        cbxanticrack = findViewById(R.id.cbxanticrack);
        txtnama = findViewById(R.id.etNama);
        txtalamat = findViewById(R.id.etAlamat);


        if(getIntent().getStringExtra("merk") != null){
            txmerk.setText(getIntent().getStringExtra("merk"));
        }
        if(getIntent().getStringExtra("harga") != null){
            txharga.setText(getIntent().getStringExtra("harga"));
        }
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(pesan.this, R.array.value,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spjumlah.setAdapter(adapter);

        B_Cetak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rbSelected = Radiowarna.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(rbSelected);
                String warna = radioButton.getText().toString();

                String anticrack = cbxanticrack.isChecked() ? "anticrack " : "";
                String antigores = cbxantigores.isChecked() ? "antigores " : "";
                String headset = cbxheadset.isChecked() ? "headset " : "";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(anticrack);stringBuilder.append(antigores);
                stringBuilder.append(headset);

                String jumlah = spjumlah.getSelectedItem().toString();

                Intent intent = new Intent(pesan.this, nota.class);
                intent.putExtra("harga",txharga.getText().toString());
                intent.putExtra("merk",txmerk.getText().toString());
                intent.putExtra("jumlah",jumlah);
                intent.putExtra("nama",txtnama.getText().toString());
                intent.putExtra("alamat",txtalamat.getText().toString());
                intent.putExtra("warna",warna);
                intent.putExtra("aksesoris",stringBuilder.toString());
                startActivity(intent);
            }
        });
    }
}
