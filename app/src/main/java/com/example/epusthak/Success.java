package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }
    public void BhagG(View v)
    {
        Intent i=new Intent(this,Bhag.class);
        startActivity(i);
    }
    public void maha(View v){
        Intent i=new Intent(this,maha.class);
        startActivity(i);
    }
    public void ram(View v){
        Intent i=new Intent(this,ram.class);
        startActivity(i);
    }
    public void ramC(View v){
        Intent i=new Intent(this,ramC.class);
        startActivity(i);
    }
    }
