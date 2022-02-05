package com.example.app_minha_ideia_db.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.datamodel.ProdutoDataModel;
import com.example.app_minha_ideia_db.datasource.AppDataBase;
import com.example.app_minha_ideia_db.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {

        super(context);
        Log.d(AppUtil.TAG, "ProdutoController: Conectado");
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();
        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObjeto = new ContentValues();
        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());
        return false;
    }

    @Override
    public boolean deletar(Produto obj) {

        dadoDoObjeto = new ContentValues();
        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        return false;
    }

    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();
        return lista;
    }
}
