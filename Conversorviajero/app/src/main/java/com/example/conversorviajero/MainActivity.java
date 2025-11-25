package com.example.conversorviajero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.buttonConvertir);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = editText.getText().toString();
                if (txt.isEmpty()) {
                    Toast.makeText(MainActivity.this, "El texto está vacio", Toast.LENGTH_SHORT).show();
                    return;
                }

                double euros = Double.parseDouble(txt);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("euros", euros);
                startActivity(intent);
            }
        });

        }
    }
