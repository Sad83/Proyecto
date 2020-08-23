package com.tb1.consultadeproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button BtnRealizarConsulta;
    Button BtnAcercaDe;
    Button BtnIntegrantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asignarReferencias();

        BtnRealizarConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Consultas.class);
                startActivity(intent);
            }
        });

        BtnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Informacion.class);
                startActivity(intent);
            }
        });

        BtnIntegrantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Actividad Integrantes", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void asignarReferencias() {
        BtnRealizarConsulta = findViewById(R.id.BtnRealizarConsulta);
        BtnAcercaDe = findViewById(R.id.BtnAcercaDe);
        BtnIntegrantes = findViewById(R.id.BtnIntegrantes);
    }

}