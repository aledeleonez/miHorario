package com.example.mihorario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nuevaClase = findViewById(R.id.bt_anadirClase);
        Button verHorario = findViewById(R.id.bt_verHorario);
        Button queToca = findViewById(R.id.bt_queToca);
    }

    public void nuevaClase(View view){
        Intent intentNuevaClase = new Intent(this, activity_anadirClase.class);
        startActivity(intentNuevaClase);
    }

    public void verHorario(View view){
        Intent intentVerHorario = new Intent(this, activity_verHorario.class);
        startActivity(intentVerHorario);
    }

    public void queToca(View view){
        Intent intentQueToca = new Intent(this, activity_queToca.class);
        startActivity(intentQueToca);
    }


    @Override
    public void onClick(View view) {
        
    }
}