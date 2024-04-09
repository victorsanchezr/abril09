package com.softtek.modelo.ejemploslambda;

import java.util.function.Predicate;

public class ProbarPredicate {
    public void metodo1(){

        Predicate<Integer> mayorEdad = x -> x > 18;
        boolean res = mayorEdad.test(19);
        System.out.println(res);


    }
}
