package com.arelz.giochi.impiccato;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GiocoDellImpiccato {
    private Scanner scanner = new Scanner(System.in);
    private final String parolaSegreta;
    private final Set<Character> lettereIndovinate = new HashSet<>();

    public GiocoDellImpiccato(String parolaSegreta) {
        this.parolaSegreta = parolaSegreta.toLowerCase();
    }

    public void gioca() {
        System.out.println("Benvenuto al Gioco dell'Impiccato!");
        while (true) {
            System.out.println("\n" + this); // mostra parola parziale
            System.out.println("Preferisci:");
            System.out.println("1 - Indovinare la parola");
            System.out.println("2 - Indovinare una lettera");
            System.out.print("Inserisci 1 o 2: ");

            int opzione = 0;
            try {
                opzione = Integer.parseInt(scanner.nextLine());
                if (opzione != 1 && opzione != 2) {
                    System.out.println("Valore non valido. Inserisci 1 o 2.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero.");
                continue;
            }

            if (opzione == 1) {
                System.out.print("Inserisci la parola: ");
                String parolaUtente = scanner.nextLine().toLowerCase();

                if (controllaParola(parolaUtente)) {
                    System.out.println("Complimenti! Hai indovinato la parola: " + parolaSegreta);
                    break;
                } else {
                    System.out.println("Mi dispiace, la parola è sbagliata.");
                }

            } else { // opzione == 2
                System.out.print("Inserisci una lettera: ");
                String input = scanner.nextLine().toLowerCase();
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Per favore inserisci una singola lettera valida.");
                    continue;
                }
                char lettera = input.charAt(0);

                if (lettereIndovinate.contains(lettera)) {
                    System.out.println("Hai già indovinato la lettera '" + lettera + "'.");
                    continue;
                }

                if (controllaLettera(lettera)) {
                    System.out.println("La lettera '" + lettera + "' è presente nella parola!");
                    lettereIndovinate.add(lettera);
                } else {
                    System.out.println("La lettera '" + lettera + "' NON è presente.");
                }

                // Controlla se ha trovato tutte le lettere
                if (tutteLettereIndovinate()) {
                    System.out.println("Complimenti! Hai scoperto tutta la parola: " + parolaSegreta);
                    break;
                }
            }
        }
    }

    private boolean controllaLettera(char lettera) {
        return parolaSegreta.indexOf(lettera) != -1;
    }

    private boolean controllaParola(String parolaUtente) {
        return parolaSegreta.equals(parolaUtente);
    }

    private boolean tutteLettereIndovinate() {
        for (char c : parolaSegreta.toCharArray()) {
            if (!lettereIndovinate.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : parolaSegreta.toCharArray()) {
            if (lettereIndovinate.contains(c)) {
                sb.append(c);
            } else {
                sb.append("-");
            }
        }
        return "Parola attuale: " + sb.toString();
    }
}
