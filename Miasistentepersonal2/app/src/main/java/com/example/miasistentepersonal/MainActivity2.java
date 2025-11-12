package com.example.miasistentepersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        SharedPreferences sharedPreferences = getSharedPreferences("Misdatos", MODE_PRIVATE);
        String nombre = sharedPreferences.getString("Nombre", "Usuario");
        String saludo;
        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos dias " + nombre;
        } else if (hora >= 12 && hora <= 21) {
            saludo = "Buenas tardes " + nombre;
        } else {
            saludo = "Buenas noches " + nombre;
        }

        textView.setText(saludo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}