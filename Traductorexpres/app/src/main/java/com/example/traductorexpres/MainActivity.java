package com.example.traductorexpres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTraducir;
    EditText txtTraducir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnTraducir = findViewById(R.id.button);
    txtTraducir = findViewById(R.id.editTextText2);

    btnTraducir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String texto = txtTraducir.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("texto", texto);
            startActivity(intent);
        }
    });

        }
    }
