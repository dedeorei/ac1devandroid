package com.example.exercciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ex2 extends AppCompatActivity {

    private EditText editTextValor1, editTextValor2;
    private Button buttonSoma, buttonSubtracao, buttonMultiplicacao, buttonDivisao;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        // Referenciando os elementos da tela
        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        buttonDivisao = findViewById(R.id.buttonDivisao);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurando eventos de clique para os botões
        buttonSoma.setOnClickListener(v -> calcular("+"));
        buttonSubtracao.setOnClickListener(v -> calcular("-"));
        buttonMultiplicacao.setOnClickListener(v -> calcular("*"));
        buttonDivisao.setOnClickListener(v -> calcular("/"));
    }

    private void calcular(String operacao) {
        String valor1Str = editTextValor1.getText().toString().trim();
        String valor2Str = editTextValor2.getText().toString().trim();

        // Verificando se os campos estão preenchidos
        if (valor1Str.isEmpty() || valor2Str.isEmpty()) {
            Toast.makeText(this, "Preencha os dois valores!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double valor1 = Double.parseDouble(valor1Str);
            double valor2 = Double.parseDouble(valor2Str);
            double resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = valor1 + valor2;
                    break;
                case "-":
                    resultado = valor1 - valor2;
                    break;
                case "*":
                    resultado = valor1 * valor2;
                    break;
                case "/":
                    if (valor2 == 0) {
                        Toast.makeText(this, "Não é possível dividir por zero!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    resultado = valor1 / valor2;
                    break;
            }

            textViewResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Digite números válidos!", Toast.LENGTH_SHORT).show();
        }
    }
}