package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvNama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.namaku);

        String namakuSiapa = getIntent().getStringExtra("MANTAB");
        tvNama.setText("Namaku : " + namakuSiapa);

    }

    public void _telpon(View v){
        Intent intentImplicit = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082282225802"));
        startActivity(intentImplicit);
    }
}
