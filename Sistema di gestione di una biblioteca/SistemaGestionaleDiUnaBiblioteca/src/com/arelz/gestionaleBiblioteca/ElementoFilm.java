package com.arelz.gestionaleBiblioteca;

public class ElementoFilm extends ElementoBiblioteca {
    String regista;

    public ElementoFilm(String regista, String nome, boolean presente,tipoElemento tipo) {
        super(nome, presente, tipo); // usa il costruttore della superclasse
        this.regista = regista;
    }

    @Override
    public String toString() {
        return super.toString() + ", regista='" + regista + "'";
    }
}
