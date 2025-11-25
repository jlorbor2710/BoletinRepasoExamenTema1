package com.example.centroderelajacin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonSonido;
    Button buttonVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSonido = findViewById(R.id.buttonSonido);
        buttonVideo = findViewById(R.id.buttonVideo);

        buttonSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String modo = "Sonido";
                intent.putExtra("modo", modo);
                startActivity(intent);

            }
        });
        buttonVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String modo = "Video";
                intent.putExtra("modo", modo);
                startActivity(intent);
            }
        });



    }
}
