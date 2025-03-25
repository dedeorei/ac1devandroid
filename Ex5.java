package com.example.exercciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ex5 extends AppCompatActivity{
    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5);

        // Referenciando os componentes da interface
        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);
        buttonSalvar = findViewById(R.id.buttonSalvar);

        // Configurando evento de clique do botão
        buttonSalvar.setOnClickListener(v -> salvarPreferencias());
    }

    private void salvarPreferencias() {
        StringBuilder preferencias = new StringBuilder();

        if (checkBoxNotificacoes.isChecked()) {
            preferencias.append("Receber notificações\n");
        }
        if (checkBoxModoEscuro.isChecked()) {
            preferencias.append("Modo escuro\n");
        }
        if (checkBoxLembrarLogin.isChecked()) {
            preferencias.append("Lembrar login\n");
        }

        if (preferencias.length() == 0) {
            Toast.makeText(this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Preferências selecionadas:\n" + preferencias, Toast.LENGTH_SHORT).show();
        }
    }
}
