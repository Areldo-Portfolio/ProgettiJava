package com.arelz.gestionaleBiblioteca;

public class ElementoLibro extends ElementoBiblioteca {
    String autore;

    public ElementoLibro(String autore, String nome, boolean presente, tipoElemento tipo) {
        super(nome, presente,tipo); // usa il costruttore della superclasse
        this.autore = autore;
    }

    @Override
    public String toString() {
        return super.toString() + ", autore='" + autore + "'";
    }
}
