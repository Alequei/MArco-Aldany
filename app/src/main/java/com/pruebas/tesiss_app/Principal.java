package com.pruebas.tesiss_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Principal extends AppCompatActivity {
    LinearLayout peluqueria,estetica,tratamiento,bodas,ubicaion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        peluqueria =findViewById(R.id.peluqueria_id);
        estetica = findViewById(R.id.estetica_id);
        tratamiento =findViewById(R.id.tratamiento_id);
        bodas = findViewById(R.id.bodayevento_id);
        peluqueria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peluqueria.setBackgroundColor(getResources().getColor(R.color.colorAmarillo));
                Intent intent=new Intent(Principal.this,Peluqueria.class);
                startActivity(intent);
            }
        });
    }

}
