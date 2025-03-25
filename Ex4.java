package com.example.exercciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Ex4 extends AppCompatActivity{
    private EditText editTextNome;
    private Button buttonGerar;
    private LinearLayout layoutCheckBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);

        // Referenciando os elementos da tela
        editTextNome = findViewById(R.id.editTextNome);
        buttonGerar = findViewById(R.id.buttonGerar);
        layoutCheckBoxes = findViewById(R.id.layoutCheckBoxes);

        // Configurando evento de clique do botão
        buttonGerar.setOnClickListener(v -> gerarCheckBoxes());
    }

    private void gerarCheckBoxes() {
        String nome = editTextNome.getText().toString().trim();

        // Limpar checkboxes anteriores
        layoutCheckBoxes.removeAllViews();

        // Verificar se o campo não está vazio
        if (nome.isEmpty()) {
            return;
        }

        // Criar um CheckBox para cada letra do nome
        for (char letra : nome.toCharArray()) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(letra));
            layoutCheckBoxes.addView(checkBox);
        }
    }
}