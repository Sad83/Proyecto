package com.tb1.consultadeproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Consultas extends AppCompatActivity {

    Button Btn_Buscar;
    Button Agregar;
    Button Actualizar;
    Button Eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);
        AsignarReferencias();

        Btn_Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Consultas.this, "Buscar Producto", Toast.LENGTH_SHORT).show();
            }
        });

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Consultas.this, "Agregar Producto", Toast.LENGTH_SHORT).show();

            }
        });

        Actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Consultas.this, "Actualizar Producto", Toast.LENGTH_SHORT).show();

            }
        });

        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Consultas.this, "Eliminar Producto", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void AsignarReferencias(){
        Btn_Buscar = findViewById(R.id.Btn_Buscar);
        Agregar = findViewById(R.id.Agregar);
        Actualizar = findViewById(R.id.Actualizar);
        Eliminar = findViewById(R.id.Eliminar);

    }
}