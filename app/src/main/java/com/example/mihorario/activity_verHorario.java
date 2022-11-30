package com.example.mihorario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class activity_verHorario extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ArrayAdapter<String> adaptadorDias;
    ArrayAdapter<Asignatura> adaptadorAsignatura;
    String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    ArrayList<Asignatura> asignaturasEnDia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_horario);

        adaptadorDias = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, diasSemana);
        Spinner spinnerDia = findViewById(R.id.spinner_dia);
        spinnerDia.setAdapter(adaptadorDias);
        spinnerDia.setOnItemSelectedListener(this);

        asignaturasEnDia = new ArrayList<>();
        adaptadorAsignatura= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, asignaturasEnDia);
        ListView asignaturas= findViewById(R.id.list_asignaturas);
        asignaturas.setAdapter(adaptadorAsignatura);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        asignaturasEnDia.clear();

        String diaSemana = diasSemana[i];
        for (Asignatura a : asignaturasEnDia){
            if (a.getDia().equals(diaSemana)){
                asignaturasEnDia.add(a);
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}