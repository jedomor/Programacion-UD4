package com.mycompany.operacionesconjuntas;

import java.util.*;

public class OperacionesConjuntas {

    public static void main(String[] args) {

        Set buscaPolicia = new HashSet(Arrays.asList("12345678A", "12345678B", "12345678C", "12345678D"));
        Set buscaGuardia = new HashSet(Arrays.asList("12345678E", "12345678F", "12345678G", "12345678D"));

        System.out.println();

        Set resultado = new HashSet(buscaGuardia);
        resultado.addAll(buscaPolicia);
        System.out.println("Buscados por la Nacional o la Benemerita: " + resultado);

        resultado = new HashSet(buscaGuardia);
        resultado.retainAll(buscaPolicia);
        System.out.println("Buscados por la Nacional y la Benemerita: " + resultado);

        resultado = new HashSet(buscaGuardia);
        resultado.removeAll(buscaPolicia);
        System.out.println("Buscados por la Benemerita: " + resultado);

        resultado = new HashSet(buscaPolicia);
        resultado.removeAll(buscaGuardia);
        System.out.println("Buscados por la Nacional: " + resultado);

    }
}
