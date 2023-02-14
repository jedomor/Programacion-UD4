package com.mycompany.ud4_3;

import java.util.*;

public class PruebaListas {

    public static void main(String[] args) {
        //Creamos un objeto de tipo ArrayList y se guarda en una referencia de tipo List llamada meses.
        List meses = new ArrayList();
        //A continuación, llenamos la lista con los nombres de los 12 meses del año empezando desde “Enero”.
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        //Ahora toca hacerle consultas a la lista e imprimir “las respuestas”. Tenemos que averiguar si está vacía o no. Cuántos elementos contiene y si contiene el mes de “Henero”
        System.out.println("¿Lista vacía?: " + meses.isEmpty());
        System.out.println("¿Cuantos meses contiene?: " + meses.size());
        System.out.println("¿Contiene Henero?: " + meses.contains("Henero"));
        //Acto seguido vamos a recorrer la lista con un iterador e imprimir en pantalla cada uno de los valores.
        System.out.println("Lista completa de los meses:");
        Iterator iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
        //Después vamos a ordenar la lista y volver a imprimir los valores de la lista ordenada utilizando un iterador.
        System.out.println("Lista completa ordenada (sorted) de los meses:");
        Collections.sort(meses);
        iter = meses.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println("\t" + elem);
        }
        //Por último, vamos a vaciar la lista y volverla a imprimir con utilizando un iterador.
        System.out.println("Limpiando la lista:");
        meses.clear();
        iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //FINAL
    }
}
