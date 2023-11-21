package com.example.fecha_hora;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;


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

            }
        });
    }
}
