package com.arelz.gestionaleBiblioteca;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElementoBiblioteca> biblioteca = new ArrayList<>();

        // Aggiunta di libri
        biblioteca.add(new ElementoLibro("J.K. Rowling", "Harry Potter", true, tipoElemento.libro));
        biblioteca.add(new ElementoLibro("Mary Shelley", "Frankenstein", true, tipoElemento.libro));
        biblioteca.add(new ElementoLibro("Bram Stoker", "Dracula", false, tipoElemento.libro));
        biblioteca.add(new ElementoLibro("George Orwell", "1984", true, tipoElemento.libro));
        biblioteca.add(new ElementoLibro("J.R.R. Tolkien", "Il Signore degli Anelli", true, tipoElemento.libro));

        // Aggiunta di film
        biblioteca.add(new ElementoFilm("Steven Spielberg", "Jurassic Park", true, tipoElemento.film));
        biblioteca.add(new ElementoFilm("Stanley Kubrick", "Shining", false, tipoElemento.film));
        biblioteca.add(new ElementoFilm("Alfred Hitchcock", "Psycho", true, tipoElemento.film));
        biblioteca.add(new ElementoFilm("Ridley Scott", "Alien", true, tipoElemento.film));
        biblioteca.add(new ElementoFilm("Robert Zemeckis", "Ritorno al Futuro", true, tipoElemento.film));

        // Stampa degli elementi
        for (ElementoBiblioteca e : biblioteca) {
            System.out.println(e);
        }
    }
}
