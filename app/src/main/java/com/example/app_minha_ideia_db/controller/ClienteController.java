package com.example.app_minha_ideia_db.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.datamodel.ClienteDataModel;
import com.example.app_minha_ideia_db.datasource.AppDataBase;
import com.example.app_minha_ideia_db.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObjeto;

    public ClienteController(Context context) {

        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {

        dadoDoObjeto = new ContentValues();
        //Chave, Valor

        //dadoDoObjeto.put(ClienteDataModel.ID.obj.getId());
        //ID é a chave primária da tabela, logo é gerada
        //automaticamente pelo SQLite a cada novo registro
        //INCLUIR:
        //SQL -> INSERT INTO TABLE (...) VALUES (###)
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        //enviar os dados (dadoDoObjeto) para classe AppDataBase
        //utilizando  um método capaz de INCLUIR o Obj no banco
        //de dados.
        return true;
    }

    @Override
    public boolean alterar(Cliente obj) {

        dadoDoObjeto = new ContentValues();
        //Chave, Valor

        //dadoDoObjeto.put(ClienteDataModel.ID.obj.getId());
        //ID é a chave primária da tabela, logo é gerada
        //automaticamente pelo SQLite a cada novo registro
        //ALTERAR:
        //SQL -> UPDATE
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        //enviar os dados (dadoDoObjeto) para classe AppDataBase
        //utilizando  um método capaz de ALTERAR o Obj no banco
        //de dados.
        return true;

    }

    @Override
    public boolean deletar(Cliente obj) {

        dadoDoObjeto = new ContentValues();
        //Chave, Valor

        //dadoDoObjeto.put(ClienteDataModel.ID.obj.getId());
        //ID é a chave primária da tabela, logo é gerada
        //automaticamente pelo SQLite a cada novo registro
        //Deletar:?
        //SQL -> DELETE from TABELA where ID = xxx
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());

        //enviar os dados (dadoDoObjeto) para classe AppDataBase
        //utilizando  um método capaz de DELETAR o Obj no banco
        //de dados.
        return true;

    }

    @Override
    public List<Cliente> listar() {

        List<Cliente> lista = new ArrayList<>();
        return lista;
    }

}
