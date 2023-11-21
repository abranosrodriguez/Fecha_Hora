package com.example.fecha_hora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    private Button btnRecuperarDatos;
    private TimePicker timePicker;
    private DatePicker datePicker;
    private String mensajeConDatos, mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRecuperarDatos = findViewById(R.id.btnRecuperarDatos);
        timePicker = findViewById(R.id.time_picker);
        datePicker = findViewById(R.id.date_picker);
        btnRecuperarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    int dia = datePicker.getDayOfMonth();
                    int month = datePicker.getMonth();
                    int year = datePicker.getYear();
                    mensajeConDatos = "Fecha: " + dia + "/" + month + "/" + year +
                            "\nHora: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();
                    Toast.makeText(MainActivity.this, mensajeConDatos, Toast.LENGTH_SHORT).show();

                    /*int hora = timePicker.getCurrentHour();
                    int minuto = timePicker.getCurrentMinute();
                    mensaje = "Alarma configurada por aplicacion externa puesta para las: " + hora +":"+minuto;
                    Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                    intent.putExtra(AlarmClock.EXTRA_MESSAGE, mensaje);
                    intent.putExtra(AlarmClock.EXTRA_HOUR, hora);
                    intent.putExtra(AlarmClock.EXTRA_MINUTES, minuto);

                    if (intent.resolveActivity(getPackageManager()) == null){
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "ERROR - NO SE HA CARGADO LA ALARMA", Toast.LENGTH_SHORT).show();
                    }*/

            }
        });
    }

    public void dias(){



    }
}
