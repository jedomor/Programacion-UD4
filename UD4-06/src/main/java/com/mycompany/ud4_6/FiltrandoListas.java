package com.mycompany.ud4_6;

import java.util.*;

public class FiltrandoListas {

    public static void main(String[] args) {
        //Se crea una lista de tipo ArrayList y se guarda en una referencia de tipo List.
        List filtrando = new ArrayList();
        //A continuación, cargaremos la lista con las siguientes cadenas: “Vertical”, “Horizontal”, “Izquierda”, “Derecha”, “Adelante”, “Atrás”, “Curvo”, “Recto”, “Arriba”, “Abajo”. (COPIALO DEL EJERCICIO ANTERIOR, ES LO MISMO).
        filtrando.add("Vertical");
        filtrando.add("Horizontal");
        filtrando.add("Izqierda");
        filtrando.add("Derecha");
        filtrando.add("Adelante");
        filtrando.add("Atrás");
        filtrando.add("Curvo");
        filtrando.add("Recto");
        filtrando.add("Arriba");
        filtrando.add("Abajo");
        //Ordenamos la lista y la imprimimos utilizando su método toString().
        Collections.sort(filtrando);
        System.out.println(filtrando);
        //Ahora tenemos que aprender algo nuevo. 
        //La clase Iterator tiene un método remove() que elimina de la lista el último elemento extraído mediante un next().
        //Con esta nueva utilidad vamos a manipular la lista del siguiente modo:
            //Recorre la lista y elimina las palabras que terminen en “o”. Acto seguido muestra el contenido de la lista.
            Iterator iter = filtrando.iterator();
            System.out.println("Quitamos las palabras con la letra o");
            while (iter.hasNext()) {
                String elem = (String) iter.next();
                if (elem.contains("o")) {
                    iter.remove();
                }
            }
            System.out.println(filtrando);
            //Recorre de nuevo la lista y elimina las palabras que contengan la letra “t”. Muestra el contenido de la lista al terminar.
            iter = filtrando.iterator();
            System.out.println("Quitamos las palabras con la letra t");
            while (iter.hasNext()) {
                String elem = (String) iter.next();
                if (elem.contains("t")) {
                    iter.remove();
                }
            }
            System.out.println(filtrando);
            //Recorre de nuevo la lista y elimina las palabras que contengan la letra “a” y que tengan más de 5 letras. Muestra el contenido al terminar… ¿Nos queda alguna palabra en la lista?
            System.out.println("Quitamos las palabras con 'a' y más de 5 letras");
            iter = filtrando.iterator();
            while(iter.hasNext()) {
                String elem = (String) iter.next();
                if (elem.contains("a") && elem.length() > 5) {
                    iter.remove();
                }
            }
            System.out.println(filtrando);
            //FINAL
    }
}
