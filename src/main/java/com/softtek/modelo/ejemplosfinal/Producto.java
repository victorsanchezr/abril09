package com.softtek.modelo.ejemplosfinal;

public final class Producto { //con final en la clase no se puede heredar


    public static  int CONTADOR = 0;

    private final int ID; //const

    private String nombre;

    private double precio;

    public Producto() {
        this.ID = ++CONTADOR;

    }



    public final double importe(int cantidad){ //con final no se puede sobreescribir @Overide

        return cantidad*precio;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
