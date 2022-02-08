package com.example.app_minha_ideia_db.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_minha_ideia_db.R;
import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.controller.ClienteController;
import com.example.app_minha_ideia_db.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteControler;
    Cliente obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "OnCreate: App Minha Ideia DataBase");

        clienteControler = new ClienteController(getApplicationContext());

//        for (int i = 0; i < 49; i++) {
//
//            obj = new Cliente();
//
//            obj.setNome("Gustavo" + i);
//            obj.setEmail(i + "_gustavo@teste.com.br");
//
//            clienteControler.incluir(obj);
//        }
        for (Cliente obj : clienteControler.listar()) {
            Log.i("Retorno", "onCreate: " + obj.getId() + " " + obj.getNome() + " " + obj.getEmail());
        }
    }
}