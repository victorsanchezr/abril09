package com.softtek.presentacion.ejemplosfinal;

import com.softtek.modelo.ejemplosfinal.Producto;

public class Main {
    public static void main(String[] args) {
        System.out.println(Producto.CONTADOR);
        Producto p1 = new Producto();
        System.out.println(p1.toString());
        Producto p2 = new Producto();
        System.out.println(p2.toString());
    }
}
