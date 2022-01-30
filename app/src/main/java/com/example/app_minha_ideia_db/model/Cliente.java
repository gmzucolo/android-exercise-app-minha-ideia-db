package com.example.app_minha_ideia_db.model;

import com.example.app_minha_ideia_db.controller.ICrud;

public class Cliente implements ICrud {

    private int id; //chave primária no banco de dados
    private String nome;
    private String email;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void incluir() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void deletar() {

    }

    @Override
    public void listar() {

    }
}
