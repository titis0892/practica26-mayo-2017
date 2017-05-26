package com.arturopacheco.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button agregar;
    EditText nombre;
    EditText telefono;
    EditText correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        agregar= (Button)findViewById(R.id.btnagregar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agregar = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(agregar);

            }
        });

       nombre= (EditText)findViewById(R.id.editnombre);
        telefono = (EditText)findViewById(R.id.editTel);
        correo = (EditText)findViewById(R.id.editCorreo);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
