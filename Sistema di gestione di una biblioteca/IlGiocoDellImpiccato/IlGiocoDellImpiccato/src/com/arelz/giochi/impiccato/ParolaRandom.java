package com.arelz.giochi.impiccato;

import java.util.ArrayList;
import java.util.Random;

public class ParolaRandom {
    private String parola;

    public ParolaRandom(ArrayList<String> parole) {
        Random rand = new Random();
        this.parola = parole.get(rand.nextInt(parole.size())).toLowerCase();
    }

    public String getParola() {
        return parola;
    }
}
