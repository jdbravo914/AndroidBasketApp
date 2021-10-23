package com.example.app_tareabaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameE1;
    private EditText nameE2;
    private Equipo equipo1;
    private Equipo equipo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameE1= findViewById(R.id.eTequipo1);
        nameE2= findViewById(R.id.eTequipo2);
    }

    public void loadNextActivity(View view) {
        String name1=nameE1.getText().toString();
        String name2=nameE2.getText().toString();
        Intent secondActivity= new Intent( this, Match.class);

        //Enviar obj
        equipo1= new Equipo(name1, 0);
        equipo2= new Equipo(name2, 0);

        secondActivity.putExtra("equipo1",equipo1);
        secondActivity.putExtra("equipo2",equipo2);

        startActivity(secondActivity);
    }
}

