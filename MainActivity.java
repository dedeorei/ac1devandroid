package com.example.exercciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private Button buttonVerificar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonVerificar = findViewById(R.id.buttonVerificar);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarMaioridade();
            }
        });
    }

    private void verificarMaioridade() {
        String nome = editTextNome.getText().toString();
        String idadeStr = editTextIdade.getText().toString();

        if (nome.isEmpty() || idadeStr.isEmpty()) {
            textViewResultado.setText("Por favor, preencha todos os campos.");
            return;
        }

        int idade = Integer.parseInt(idadeStr);
        String resultado = nome + ", você é " + (idade >= 18 ? "maior de idade." : "menor de idade.");
        textViewResultado.setText(resultado);
    }
}