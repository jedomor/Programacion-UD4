package com.mycompany.ud4_4;

import java.util.*;

public class NombresDePerros {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Variable String para añadir nombres nuevos
        String nombreNuevo;
        //Se crea una lista de tipo ArrayList y se guarda en una referencia de tipo List llamada nombres.
        List nombres = new ArrayList();
        //Guardaremos en la lista los siguientes valores: “Toby”, “Rocky”, “Max”, “Pancho”, “Coco”, “Chispa”
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        //A continuación, escribiremos en pantalla: “Actualmente conozco X nombres para perros. Te los digo: ” y se imprimirán los nombres de la lista, uno debajo de otro, recorriéndola mediante un iterador.
        System.out.println("Actualmente conozco " + nombres.size() + " nombres para perros. Te los digo:");
        Iterator iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
        //Acto seguido, escribiremos “También te los puedo decir en orden alfabético: “. Entonces ordenamos la lista y la volvemos a recorrer usando un iterador.
        System.out.println("Tambien te los puedo decir por orden alfabetico:");
        Collections.sort(nombres);
        iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
        //Ahora nos interesa que el usuario nos de algunos nombres más. Para ello, le diremos al usuario que nos enseñe más nombres de perros y que cuando se canse añada el nombre “FIN” para terminar. Los nombres que vaya introduciendo los iremos añadiendo a la lista.
        System.out.println("Dime mas nombres (escribe fin para terminar)");
        do {
            System.out.println("Dime un nombre: ");
            nombreNuevo = sc.nextLine();
            if (nombreNuevo.equalsIgnoreCase("FIN") == false) {
                nombres.add(nombreNuevo);
            }
        } while (!nombreNuevo.equalsIgnoreCase("fin"));
        //Una vez el usuario ha terminado de introducir nombre entonces ordenaremos la lista alfabéticamente y escribiremos: “Gracias. Ahora conozco X nombres de perros. Te los digo en orden: “ y se imprimirán los nombres recorriendo la lista con un iterador
        System.out.println("Gracias. Ahora conozco "+nombres.size()+" nombres de perros. Te los digo en orden:");   
        Collections.sort(nombres);
        iter= nombres.iterator();
        while (iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
        //FINAL
    }
}
