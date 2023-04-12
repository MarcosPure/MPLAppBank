package com.mpl.mplappbank.registro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mpl.mplappbank.R;

public class Registro extends Fragment implements View.OnClickListener {
    EditText edtNombre, edtApellido, edtEmail, edtCelular;
    Button btnGuardar;

    public static final String ARCHIVO_PREFERENCIAS = "preferenciasMPL";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registro, container, false);

        edtNombre = view.findViewById(R.id.edtRegistroNombre);
        edtApellido = view.findViewById(R.id.edtRegistroApellido);
        edtEmail = view.findViewById(R.id.edtRegistroEmail);
        edtCelular = view.findViewById(R.id.edtRegistroCelular);
        btnGuardar = view.findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        SharedPreferences preferences = getContext().getSharedPreferences(ARCHIVO_PREFERENCIAS,0);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nameCliente", edtNombre.getText().toString());
        editor.putString("apellidoCliente", edtApellido.getText().toString());
        editor.putString("emailCliente", edtEmail.getText().toString());
        editor.putString("celularCliente", edtCelular.getText().toString());

        editor.commit();
        Toast.makeText(getContext(), "datos guardados", Toast.LENGTH_SHORT).show();
        
//        String nombre = edtNombre.getText().toString();
//        String apellido = edtApellido.getText().toString();
//        String email = edtEmail.getText().toString();
//        String celular = edtCelular.getText().toString();
//
//        boolean verificado = false;
//
//        if (nombre.isEmpty()| nombre.length()<3){
//            edtNombre.setError("Nombre Usuario incorrecto");
//            verificado = false;
//        }
//        else
//            verificado = true;
//        if (apellido.isEmpty()| apellido.length()<3){
//            edtApellido.setError("Formato de password incorrecto");
//            verificado = false;
//        }else
//            verificado = true;
//        if (email.isEmpty()| email.length()<=10){
//            edtEmail.setError("Formato de email incorrecto");
//            verificado = false;
//        }else
//
//            verificado = true;
//        if (celular.length()!=9 | celular.isEmpty()){
//            edtCelular.setError("Formato de celular incorrecto");
//            verificado = false;
//        }else
//            verificado = true;
//
//        if(verificado){
//            Toast.makeText(getContext(), "El nombre es: "+ edtNombre.getText().toString()+
//                            "\n El apellido es: "+ edtApellido.getText().toString()+
//                            "\n El email es: "+ edtEmail.getText().toString()+
//                            "\n El celular es: "+ edtCelular.getText().toString()
//                    , Toast.LENGTH_SHORT).show();
//        }
    }
}