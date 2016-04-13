package com.example.davidvelasquez.mgchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        if(iniciar_session()==true)
        {
            Toast.makeText(this, "Iniciado Session", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"No inicio session", Toast.LENGTH_LONG).show();
        }


    }

    public boolean iniciar_session() // iniciar sesion-------------------
    {
        Datos datos = new Datos();
        String [] sdatos = datos.leer(this);
       if(sdatos[0]!="" && sdatos[1]!="") // si no esta vacio
        {
            username= sdatos[0];
            password= sdatos[1];
            return true;
        }
        else {
           return false;
       }

    }
}
