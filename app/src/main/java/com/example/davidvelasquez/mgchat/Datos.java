package com.example.davidvelasquez.mgchat;

/**
 * Created by David Velasquez on 12/04/2016.
 */
import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Datos {

    public String[] leer(Context Contexto) {

        try {
            BufferedReader fin =
                    new BufferedReader(
                            new InputStreamReader(
                                    Contexto.openFileInput("meminterna.txt")));

            String texto = fin.readLine();
            String[] lineas=texto.split(";");
            fin.close();

            return lineas;
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al leer fichero desde la memoria interna");
            return new String[]{"",""};
        }

    }


    public void escribir(Context Contexto,String username, String password){
        try {
            OutputStreamWriter fout =
                    new OutputStreamWriter(
                            Contexto.openFileOutput("meminterna.txt", Context.MODE_PRIVATE));

            fout.write(username +";"+password);
            fout.close();
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero en la memoria interna");
        }


    }

    public void cerrar (Context Contexto){

        try {
            OutputStreamWriter fout =
                    new OutputStreamWriter(
                            Contexto.openFileOutput("meminterna.txt", Context.MODE_PRIVATE));

            fout.write("");
            fout.close();
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero en la memoria interna");
        }


    }
}
