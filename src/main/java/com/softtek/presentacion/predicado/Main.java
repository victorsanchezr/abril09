package com.softtek.presentacion.predicado;

import com.softtek.modelo.ejercicio2estatico.Calculadora;
import jdk.jfr.Frequency;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }


    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        Predicate<Integer> NumMayor = x -> x > 0;
        boolean res = NumMayor.test(sc.nextInt());
        System.out.println(res);
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        Predicate<String> CadVacia = x -> !x.isEmpty();
        boolean res = CadVacia.test(sc.nextLine());
        System.out.println(res);
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        Predicate<Integer> NumMayor = x -> x % 2 == 0;
        boolean res = NumMayor.test(sc.nextInt());
        System.out.println(res);
    }

    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Valor a comprar?: ");
        valor = sc.nextInt();
        Predicate<Integer> NumMayor = x -> x > valor;
        boolean res = NumMayor.test(sc.nextInt());
        System.out.println(res);
    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        Predicate<Integer> NumMayor = x -> {
            for(int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
               return true;
        };
        boolean res = NumMayor.test(sc.nextInt());
        System.out.println(res);
    }
}
