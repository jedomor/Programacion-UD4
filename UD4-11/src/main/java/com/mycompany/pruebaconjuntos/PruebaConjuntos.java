package com.mycompany.pruebaconjuntos;

import java.util.*;

public class PruebaConjuntos{

    public static void main(String[] args) {

        Set candidatos = new HashSet();

        candidatos.add("Juan");
        candidatos.add("Ana");
        candidatos.add("Pedro");
        candidatos.add("Rosa");
        candidatos.add("Maria");

        System.out.println(candidatos);
        System.out.println(candidatos.size());

        if (candidatos.contains("Pedro")) {
            System.out.println("Contiene a Pedro");
        } else {
            System.out.println(candidatos.contains("No contiene a Pedro"));
        }

        Iterator iterador = candidatos.iterator();
        while (iterador.hasNext()) {
            String elem = (String) iterador.next();
            System.out.println("Candidato: " + elem);

        }
        
        
        iterador = candidatos.iterator();
        Set seleccionados = new HashSet();
        while (iterador.hasNext()) {
            String elem = (String) iterador.next();
            if (elem.contains("a")) {
                seleccionados.add(elem);
            }
        }

        Iterator iterador2 = seleccionados.iterator();
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }

    }
}
