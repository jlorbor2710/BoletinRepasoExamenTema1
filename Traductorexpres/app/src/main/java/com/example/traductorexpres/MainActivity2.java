package com.example.traductorexpres;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    TextView txtTraducido;
    private Map<String, String> diccionario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inicializarDiccionario();

        txtTraducido = findViewById(R.id.textView);
        String textoOriginal = getIntent().getStringExtra("texto");
        if (textoOriginal != null) {
            String textoTraducido = traducir(textoOriginal.toLowerCase());

            if (textoTraducido.equals("Traducción no encontrada")) {
                Toast.makeText(this, "Traducción no encontrada", Toast.LENGTH_SHORT).show();
                txtTraducido.setText(textoOriginal);
            } else {
                txtTraducido.setText(textoTraducido);
            }
        }
    }

    private void inicializarDiccionario() {
        diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
    }

    private String traducir(String texto) {
        return diccionario.getOrDefault(texto, "Traducción no encontrada");
    }
}
