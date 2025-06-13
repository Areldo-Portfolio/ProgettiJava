package com.arelz.gestionaleBiblioteca;

public class ElementoBiblioteca {
    String nome;
    boolean presente;
    private tipoElemento tipo;

    public ElementoBiblioteca(String nome, boolean presente, tipoElemento tipo) {
        this.nome = nome;
        this.presente = presente;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ElementoBiblioteca{nome='" + nome + "', presente=" + presente + ", tipo=" + tipo + "}";
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public tipoElemento getTipo() {
        return tipo;
    }

    public void setTipo(tipoElemento tipo) {
        this.tipo = tipo;
    }
}
