package com.example.app_tareabaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//C:\Users\juan_home\AndroidStudioProjects\App_TareaBaloncesto\app\build\outputs\apk\debug
public class Match extends AppCompatActivity {

    private TextView nameTX1;
    private TextView nameTX2;
    private TextView puntosE1;
    private TextView puntosE2;
    private Equipo equipo1;
    private Equipo equipo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        nameTX1=findViewById(R.id.txNE1);
        nameTX2=findViewById(R.id.txNE2);
        puntosE1=findViewById(R.id.txPE1);
        puntosE2=findViewById(R.id.txPE2);
        Intent inputIntent=getIntent();

        equipo1= (Equipo) inputIntent.getSerializableExtra("equipo1");
        equipo2= (Equipo) inputIntent.getSerializableExtra("equipo2");

        nameTX1.setText(equipo1.getName());
        nameTX2.setText(equipo2.getName());
        puntosE1.setText(String.valueOf(equipo1.getPuntos()));
        puntosE2.setText(String.valueOf(equipo2.getPuntos()));
    }


    public void pt11(View view) {
        equipo1.setPuntos1();
        puntosE1.setText(String.valueOf(equipo1.getPuntos()));
    }
    public void pt12(View view) {
        equipo1.setPuntos2();
        puntosE1.setText(String.valueOf(equipo1.getPuntos()));
    }
    public void pt13(View view) {
        equipo1.setPuntos3();
        puntosE1.setText(String.valueOf(equipo1.getPuntos()));
    }
    public void pt21(View view) {
        equipo2.setPuntos1();
        puntosE2.setText(String.valueOf(equipo2.getPuntos()));
    }
    public void pt22(View view) {
        equipo2.setPuntos2();
        puntosE2.setText(String.valueOf(equipo2.getPuntos()));
    }
    public void pt23(View view) {
        equipo2.setPuntos3();
        puntosE2.setText(String.valueOf(equipo2.getPuntos()));
    }

    public void reiniciar(View view) {
        equipo1.setReinicio();
        equipo2.setReinicio();
        puntosE1.setText(String.valueOf(equipo1.getPuntos()));
        puntosE2.setText(String.valueOf(equipo2.getPuntos()));

    }
}