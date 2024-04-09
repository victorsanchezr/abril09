package com.softtek.modelo.ejemploslambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class ProbarProveedor {
    public void metodo1(){ // buscar

        Supplier<LocalDateTime> fx = () ->LocalDateTime.now().minusDays(2);
        System.out.println(fx.get());
    }
}
