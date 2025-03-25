package com.example.exercciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ex3 extends AppCompatActivity{
    private EditText editTextNome, editTextIdade, editTextUF, editTextCidade, editTextTelefone, editTextEmail;
    private RadioGroup radioGroupTamanho;
    private CheckBox checkBoxVermelho, checkBoxAzul, checkBoxVerde, checkBoxPreto;
    private TextView textViewResultado;
    private Button buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);

        // Referência aos componentes
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextUF = findViewById(R.id.editTextUF);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextEmail = findViewById(R.id.editTextEmail);
        radioGroupTamanho = findViewById(R.id.radioGroupTamanho);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxPreto = findViewById(R.id.checkBoxPreto);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(v -> cadastrarUsuario());
    }

    private void cadastrarUsuario() {
        textViewResultado.setText("Cadastro realizado com sucesso!");
    }
}
