package com.mpl.mplappbank.datoscuenta;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.mpl.mplappbank.R;


public class DatosCuenta extends Fragment implements View.OnClickListener {



    Button btnMostrar;
    public static final String ARCHIVO_PREFERENCIAS = "preferenciasMPL";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datos_cuenta, container, false);

        btnMostrar = view.findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        SharedPreferences preferences = getContext().getSharedPreferences(ARCHIVO_PREFERENCIAS,0);

        String nombre = preferences.getString("nameCliente","nnn");
        String apellido = preferences.getString("apellidoCliente","nnn");
        String email = preferences.getString("emailCliente","nnn");
        String celular = preferences.getString("celularCliente","nnn");
        Toast.makeText(getContext(), "Los datos guardado son: "+
                nombre + "\n"+
                        apellido + "\n"+
                        email + "\n"+
                        celular + "\n"
                , Toast.LENGTH_SHORT).show();
    }
}