package com.example.adrianch.eva2_2_intents_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    Intent lanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lanzar = new Intent(Principal.this, Secundaria.class);
    }

    public void lanzarAct(View v){
        startActivity(lanzar);
    }
}
