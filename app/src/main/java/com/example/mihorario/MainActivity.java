package com.example.mihorario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static ArrayList<Asignatura> misAsignaturas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
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