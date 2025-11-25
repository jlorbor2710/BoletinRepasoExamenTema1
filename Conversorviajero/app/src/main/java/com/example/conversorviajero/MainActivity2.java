package com.example.conversorviajero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewFecha;
    TextView textViewResultado;
    Button buttonVolver;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewFecha = findViewById(R.id.textViewFecha);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonVolver = findViewById(R.id.buttonVolver);

        double euros = getIntent().getDoubleExtra("euros", 0);
        double dolares = euros * 1.08;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String fechaLocal = DateFormat.getDateInstance(DateFormat.LONG).format(new Date());
        textViewFecha.setText(fechaLocal);
        textViewResultado.setText(numberFormat.format(dolares));

        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });



        }
    }
