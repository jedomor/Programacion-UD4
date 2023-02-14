package com.mycompany.ud4_5;

import java.util.*;

public class ManipulandoCadenas {

    public static void main(String[] args) {
        //Se crea una lista de tipo ArrayList y se guarda en una referencia de tipo List llamada cadenas.
        List cadenas = new ArrayList();
        //A continuación, cargaremos la lista con las siguientes cadenas: "Vertical", "Horizontal", "Izquierda", "Derecha", "Adelante", "Atrás", "Curvo", "Recto", "Arriba", "Abajo".
        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izqierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atrás");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("Abajo");
        //Ahora queremos imprimir las palabras de la lista en mayúsculas. OJO: no queremos cambiar las palabras de la lista, solo que al imprimirlas se vean en mayúsculas.
        System.out.println("Lista en mayúsculas:");
        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println("\t" + elem.toUpperCase());
        }
        //Acto seguido, vamos a ordenar alfabéticamente las palabras y volverlas a imprimir.
        System.out.println("Lista ordenada alfabeticamente:");
        Collections.sort(cadenas);
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println("\t" + elem);
        }
        //Ahora queremos mostrar solo las palabras que empiecen por la letra “A”.
        System.out.println("Palabras que empiezan con A:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.startsWith("A")) {
                System.out.println("\t" + elem);
            }
        }
        //Ahora queremos mostrar solo las palabras que terminen en la letra “o”.
        System.out.println("Palabras que acaban con o:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.endsWith("o")) {
                System.out.println("\t" + elem);
            }
        }
        //Ahora queremos mostrar solo las palabras que contengan la letra “e”.
        System.out.println("Palabras que contienen la letra e:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("e")) {
                System.out.println("\t" + elem);
            }
        }
        //Ahora queremos mostrar solo las palabras de 5 letras.
        System.out.println("Palabras de cinco letras:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() == 5) {
                System.out.println("\t" + elem);
            }
        }
        //Por último, mostramos solo las palabras con más de 5 letras y que empiecen por “A”
        System.out.println("Palabras de mas de cinco letras que empiezan con A:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() > 5 && elem.startsWith("A")) {
                System.out.println("\t" + elem);
            }
        }
        //FINAL
    }
}
