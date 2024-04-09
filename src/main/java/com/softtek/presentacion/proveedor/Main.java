

package com.softtek.presentacion.proveedor;

import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        Supplier<Double> fx = () -> Math.random()*6+1;
        System.out.println(fx.get());

    }

    public static void ejercicio2() {
        Supplier<List<String>> listaPredefinida = () -> {
            List<String> lista = new ArrayList<>();
            lista.add("elemento1");
            lista.add("elemento2");
            lista.add("elemento3");
            return lista;
        };

        // Obtener la lista predefinida
        List<String> lista = listaPredefinida.get();

        // Imprimir la lista
        System.out.println(lista);
    }
    public static void ejercicio3() {
        Supplier<LocalDateTime> fx = () ->LocalDateTime.now();
        System.out.println(fx.get());

    }

    public static void ejercicio4() {
        Supplier<String> cadenaVaciaSupplier = () -> "";

        System.out.println(cadenaVaciaSupplier.get());

    }

    public static void ejercicio5() {
        Supplier<String> conexi = () -> {
            conexion conex = new conexion();

            return conex.toString();
        };

        System.out.println(conexi.get());
    }

    }
    class conexion {

        private String conexion;
        private File ruta;


        public conexion() {
            this.ruta = new File("C:\\Users\\victor.sanchezr\\IdeaProjects\\abril09\\test2.txt");


        }

        public String getConexion() throws UnknownHostException {
            return Inet4Address.getLocalHost().getHostAddress();
        }

        public void setConexion(String conexion) {
            this.conexion = conexion;
        }

        public File getRuta() {
            return ruta;
        }

        public void setRuta(File ruta) {
            this.ruta = ruta;
        }

        @Override
        public String toString() {
            try {
                return "conexion{" +
                        "conexion='" + getConexion() + '\'' +
                        ", ruta=" + ruta +
                        '}';
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            return "conexion{" +
                    "conexion='" + "error" + '\'' +
                    ", ruta=" + ruta +
                    '}';

        }

    }
