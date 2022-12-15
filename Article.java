package com.example.gestiondelistes;

public class Article {
    public int code;
    public String libelle;
    public int Pv;

    public Article(int code ,String libelle ,int pv) {
       this.Pv = pv;
        this.libelle=libelle;
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPv() {
        return Pv;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPv(int pv) {
        Pv = pv;
    }

    @Override
    public String toString() {
        return "Article      "+ code+"       "  + libelle +"         " + Pv ;
    }
}