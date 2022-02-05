package com.example.app_minha_ideia_db.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_minha_ideia_db.R;
import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.controller.ClienteController;
import com.example.app_minha_ideia_db.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteControler;
    Cliente obj1, obj2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "OnCreate: App Minha Ideia DataBase");

        clienteControler = new ClienteController(getApplicationContext());

        obj1 = new Cliente();
        obj1.setNome("Gustavo");
        obj1.setEmail("gustavo@teste.com.br");

        obj2 = new Cliente();
        obj2.setNome("Carol");
        obj2.setEmail("carol@teste.com.br");

        if (clienteControler.incluir(obj1)) {

            Toast.makeText(MainActivity.this, "Cliente " + obj1.getNome() + " incluído com sucesso...", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente " + obj1.getNome() + " incluído com sucesso...");
        } else {

            Toast.makeText(MainActivity.this, "Cliente " + obj1.getNome() + " não incluído...", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente " + obj1.getNome() + "não incluído...");

        }


        if (clienteControler.incluir(obj2)) {

            Toast.makeText(MainActivity.this, "Cliente " + obj2.getNome() + " incluído com sucesso...", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente " + obj2.getNome() + " incluído com sucesso...");
        } else {

            Toast.makeText(MainActivity.this, "Cliente " + obj2.getNome() + " não incluído...", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente " + obj2.getNome() + "não incluído...");

        }
    }
}