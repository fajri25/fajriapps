 package com.jri.gofajriapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

     public void ClickHospital(View view) {
        //gambar hospital di click
         Intent i = new Intent(this,hospital.class);
         startActivity(i);

     }
 }