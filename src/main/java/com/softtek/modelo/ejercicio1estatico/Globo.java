package com.softtek.modelo.ejercicio1estatico;

import java.util.SplittableRandom;

public class Globo {

    private static int CONTADOR = 0;
    private  final int ID;

    public Globo() {

        this.ID = ++CONTADOR;
    }

    @Override
    public String toString() {
        return "ID: " + ID;
    }
}
