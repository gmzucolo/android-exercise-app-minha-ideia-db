package com.example.app_minha_ideia_db.controller;

import android.content.Context;
import android.util.Log;

import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
