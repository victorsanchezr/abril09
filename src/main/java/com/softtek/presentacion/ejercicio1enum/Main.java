package com.softtek.presentacion.ejercicio1enum;

import com.softtek.modelo.ejercicio1enum.Estado;
import com.softtek.modelo.ejercicio1enum.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("paco",2, Estado.CASADO);
        Persona p2 = new Persona("luis ",2, Estado.DIVORCIADOs);
        Persona p3 = new Persona("maria",2, Estado.SOLTERO);
        Persona p4 = new Persona("alberto",2, Estado.VIUDO);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
