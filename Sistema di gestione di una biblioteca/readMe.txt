# Gestionale Biblioteca

Questo è un piccolo progetto Java che simula la gestione di una biblioteca. Gli oggetti rappresentano libri e film, e possono essere aggiunti a una lista, stampati e gestiti con semplicità.

## Cosa fa il progetto

- Crea una lista di elementi (libri e film)
- Ogni elemento ha un nome, un autore o un regista, un tipo (libro o film) e se è presente o meno
- Usa concetti base di programmazione orientata agli oggetti come
  - Classi e sottoclassi
  - Ereditarietà
  - Enum
  - ArrayList
  - Override del metodo `toString()`

## Struttura delle classi

- `ElementoBiblioteca` classe base con nome, tipo, stato di presenza
- `ElementoLibro` estende `ElementoBiblioteca` e aggiunge l'autore
- `ElementoFilm` estende `ElementoBiblioteca` e aggiunge il regista
- `tipoElemento` enum per distinguere film e libro
- `Main` crea alcuni oggetti e li stampa

## Come usarlo

Puoi compilare ed eseguire il file `Main.java` per vedere la lista di elementi stampata nel terminale.

## Possibili estensioni

- Aggiungere prestiti e restituzioni
- Interfaccia grafica
- Salvataggio su file

## Autore

Creato da Arelz come esercizio per imparare meglio Java e la programmazione a oggetti.
