package com.softtek.presentacion.consumidor;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        Consumer<String> mayus = x -> System.out.println(x.toUpperCase());
        mayus.accept("Hola que tal");


    }

    public static void ejercicio2() {
        Consumer<Integer> mayus = x -> System.out.println("Nunmero: " + x + " Cuadrado: " + (x * x));
        mayus.accept(2);
        mayus.accept(4);
        mayus.accept(5);
    }

    public static void ejercicio3() {
        productoejer3 pro = new productoejer3();
        Consumer<productoejer3> mayus = x -> System.out.println("Nombre: " + pro.getNombre() + " Precio: " + pro.getPrecio());
        mayus.accept(pro);
    }

    public static void ejercicio4() {

        Consumer<String> mayus = x -> JOptionPane.showMessageDialog(null, x);
        mayus.accept("Prueba");
    }

    public static void ejercicio5() throws IOException {
        File fl = new File("test2.txt");
        FileWriter flw = new FileWriter(fl);
        BufferedWriter bfw = new BufferedWriter(flw);
        Consumer<String> archivo = x -> {
            try {
                bfw.write(x);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        archivo.accept("Hola que tal");

        bfw.close();

    }
}

class productoejer3 {
    private String nombre;
    private int precio;


    public productoejer3() {
        this.nombre = "Paco";
        this.precio = 2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
