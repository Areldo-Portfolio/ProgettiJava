package com.arelz.giochi.impiccato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> parole = new ArrayList<>();

        parole.add("cane");
        parole.add("gatto");
        parole.add("elefante");
        parole.add("tigre");
        parole.add("leone");
        parole.add("orso");
        parole.add("volpe");
        parole.add("lupo");
        parole.add("giraffa");
        parole.add("zebra");

        ParolaRandom scelta = new ParolaRandom(parole);
        String parolaCasuale = scelta.getParola();

        GiocoDellImpiccato gioco = new GiocoDellImpiccato(parolaCasuale);
        gioco.gioca();
    }
}
