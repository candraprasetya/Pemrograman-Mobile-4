package com.example.myintent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.PRDownloaderConfig;
import com.downloader.Progress;

public class SecondActivity extends AppCompatActivity {

    TextView tvNama;
    RadioButton radioButton1, radioButton2;
    CheckBox checkBox1, checkBox2;
    ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvNama = findViewById(R.id.namaku);
        radioButton1 = findViewById(R.id.rdb1);
        radioButton2 = findViewById(R.id.rdb2);
        checkBox1 = findViewById(R.id.chk1);
        checkBox2 = findViewById(R.id.chk2);
        toggleButton = findViewById(R.id.buttonToggle);

        String namakuSiapa = getIntent().getStringExtra("MANTAB");
        tvNama.setText("Namaku : " + namakuSiapa);

        //Radio Button 1 OnClick
        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(SecondActivity.this, radioButton1.getText().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        //Radio Button 2 OnClick
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(SecondActivity.this, radioButton2.getText().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        //Checkbox 1 onClick
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(SecondActivity.this, checkBox1.getText().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        //Checkbox 2 onClick
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(SecondActivity.this, checkBox2.getText().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(SecondActivity.this, "Turned ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, "Turned OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void showAlert(View v) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle("KELUAR");
        alertBuilder.setMessage("Yakin Mas? Aku Masih Kangen Loh :(");
        alertBuilder.setNegativeButton("Nooo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        alertBuilder.setPositiveButton("Yess", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                moveTaskToBack(true);
            }
        });

        alertBuilder.show();
    }

    public void _download(View v){
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }

}
