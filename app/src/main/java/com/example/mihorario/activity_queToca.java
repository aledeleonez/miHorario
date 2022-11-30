package com.example.mihorario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static  com.example.mihorario.MainActivity.misAsignaturas;
public class activity_queToca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_toca);

        TextView queToca = findViewById(R.id.txt_loQueToca);

        int hoy = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
        int hora = new GregorianCalendar().get(Calendar.HOUR);
        for (Asignatura a : misAsignaturas){
            if (diaNumerico(a.getDia()) == hoy){
                if (Integer.parseInt(a.getHora()) == hora){
                    queToca.setText("Tienes clase de " + a.getNombre());
                    return;
                }
            }

        }

        queToca.setText("No tienes ninguna clase ahora mismo");
    }

    private static int diaNumerico(String dia){
        switch(dia){
            case "Lunes":
            return 2;
            case "Martes":
                return 3;
            case "Miercoles":
                return 4;
            case "Jueves":
                return 5;
            case "Viernes":
                return 6;
            default:
                return -1;
        }
    }
}