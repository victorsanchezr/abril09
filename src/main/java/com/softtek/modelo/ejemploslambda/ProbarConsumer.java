package com.softtek.modelo.ejemploslambda;

import java.util.function.Consumer;

public class ProbarConsumer {
    public void metodo1(){
        Consumer<String> imprime = x -> System.out.println(x);

        Consumer<Integer> fx = x ->{

            x = x+5;
            System.out.println(x);
        };

        imprime.accept("Hola mundo");
        fx.accept(10);
    }



}
