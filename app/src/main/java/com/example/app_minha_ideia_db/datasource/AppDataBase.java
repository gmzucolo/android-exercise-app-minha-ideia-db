package com.example.app_minha_ideia_db.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.app_minha_ideia_db.api.AppUtil;
import com.example.app_minha_ideia_db.datamodel.ClienteDataModel;
import com.example.app_minha_ideia_db.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {

        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados...");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada " + ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Produto criada " + ProdutoDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /**
     * Método para incluir dados no banco de dados
     *
     * @return
     **/
    public boolean insert(String tabela, ContentValues dados) {

        db = getWritableDatabase();
        boolean retorno = false;
        //regra de negócio
        try {
            //O que deve ser realizado? Salvar dados.
            retorno = db.insert(tabela, null, dados) > 0;
        } catch (Exception e) {
            Log.d(AppUtil.TAG, "insert: " + e.getMessage());
        }
        return retorno;
    }

    /**
     * Método para deletar dados no banco de dados
     *
     * @return
     **/
    public boolean deleteByID(String tabela, int id) {

        db = getWritableDatabase();
        boolean retorno = false;
        //regra de negócio
        try {
            //O que deve ser realizado? Deletar dados.
            retorno = db.delete(tabela, "id = ?", new String[]{String.valueOf(id)}) > 0;
        } catch (Exception e) {
            Log.d(AppUtil.TAG, "delete: " + e.getMessage());
        }
        return retorno;
    }
}
