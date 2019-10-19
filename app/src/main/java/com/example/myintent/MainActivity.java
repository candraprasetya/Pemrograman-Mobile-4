package com.example.myintent;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button btnPindah;
    EditText etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.buttonPindah);
        etNama = findViewById(R.id.tfNama);
    }


    public void _pindah(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        String inputan = etNama.getText().toString();
        intent.putExtra("MANTAB",inputan);
        startActivity(intent);
    }

}
