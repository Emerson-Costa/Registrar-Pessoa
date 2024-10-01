package com.emerson.registro.models;

public class Pessoa {

    Integer id;
    String nome;
    String dataNasc;
    String sexo;
    String sobre;

    public Pessoa(Integer id, String nome, String dataNasc, String sexo, String sobre) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.sobre = sobre;
        this.id = id;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
