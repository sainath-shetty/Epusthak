package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
TextView Bhag,Ramc,Ramayan,Maha;
Button Bhagb,Ramcb,Ramayanb,Mahab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bhag= findViewById(R.id.Bhag);
        Ramc= findViewById(R.id.RamC);
        Ramayan= findViewById(R.id.Ram);
        Maha= findViewById(R.id.Maha);

        Bundle b=getIntent().getExtras();
        String book=b.getString("booknames");

        if(book.contains("Bhagvath Geetha")) {
            Bhag.setText("Bhagvath Geetha");

            Bhagb=findViewById(R.id.Bhagb);
            Bhagb.setVisibility(View.VISIBLE);
            Bhagb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i=new Intent(Cart.this,Bhag.class);
                    startActivity(i);
                }
            });

        }
       if(book.contains("Ram Charithra Manas")) {
            Ramc.setText("Ram Charithra Manas");
            Ramcb=findViewById(R.id.Ramcb);
            Ramcb.setVisibility(View.VISIBLE);
            Ramcb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i=new Intent(Cart.this,ramC.class);
                    startActivity(i);

                }
            });

        }
        if(book.contains("Ramayan")) {
            Ramayan.setText("Ramayan");
            Ramayanb=findViewById(R.id.Ramb);
            Ramayanb.setVisibility(View.VISIBLE);
            Ramayanb.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Intent i=new Intent(Cart.this,ram.class);
                    startActivity(i);
                }
            });

        }
         if(book.contains("Mahabharath")) {
            Maha.setText("Mahabharath");
            Mahab=findViewById(R.id.Mahab);
            Mahab.setVisibility(View.VISIBLE);
            Mahab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i=new Intent(Cart.this,maha.class);
                    startActivity(i);
                }
            });

        }
    }
}