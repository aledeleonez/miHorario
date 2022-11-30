package com.example.mihorario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class activity_anadirClase extends AppCompatActivity {

    ArrayList<Asignatura> asignaturas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_clase);

        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        ArrayAdapter<String> adaptadorDias = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, diasSemana);
        Spinner spinnerAsignaturas = findViewById(R.id.spinnerAsignatura);
        spinnerAsignaturas.setAdapter(adaptadorDias);
    }

    public void anadirAsignatura(){
        EditText textAsignatura = findViewById(R.id.txt_asignatura);
        EditText textHora = findViewById(R.id.txt_hora);
        Spinner spinnerDias = findViewById(R.id.spinnerAsignatura);

        String nombre = textAsignatura.getText().toString();
        String dia = (String) spinnerDias.getSelectedItem();
        String hora = textHora.getText().toString();

        Asignatura a = new Asignatura(nombre, dia, hora);
        asignaturas.add(a);
    }

    public void cancelar(){
        onBackPressed();
    }
}