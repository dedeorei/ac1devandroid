package com.example.exercciosac1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Ex6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex6);

        // Referenciando botões

        Button buttonMainActivity = findViewById(R.id.buttonMainActivity);
        Button buttonEx2 = findViewById(R.id.buttonEx2);
        Button buttonEx3 = findViewById(R.id.buttonEx3);
        Button buttonEx4 = findViewById(R.id.buttonEx4);
        Button buttonEx5 = findViewById(R.id.buttonEx5);

        // Definindo cliques para abrir as atividades

        buttonEx3.setOnClickListener(v -> abrirTela(MainActivity.class));
        buttonEx3.setOnClickListener(v -> abrirTela(Ex2.class));
        buttonEx3.setOnClickListener(v -> abrirTela(Ex3.class));
        buttonEx4.setOnClickListener(v -> abrirTela(Ex4.class));
        buttonEx5.setOnClickListener(v -> abrirTela(Ex5.class));
    }

    // Abrir atividades
    private void abrirTela(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
