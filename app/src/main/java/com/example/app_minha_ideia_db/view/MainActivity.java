package com.example.app_minha_ideia_db.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_minha_ideia_db.R;
import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteControler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "OnCreate: App Minha Ideia DataBase");

        clienteControler = new ClienteController(getApplicationContext());
    }
}