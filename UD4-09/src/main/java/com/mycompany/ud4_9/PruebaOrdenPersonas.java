package com.mycompany.ud4_9;

import java.util.*;

public class PruebaOrdenPersonas {

    public static void main(String[] args) {
        //Crea una lista
        List personaLista = new ArrayList();
        //Crea 4 objetos Persona almacenandolos en la lista
        personaLista.add(new Persona("Jaime", 32, "87572745E"));
        personaLista.add(new Persona("Julia", 14, "14361320T"));
        personaLista.add(new Persona("Julia", 22, "44838658K"));
        personaLista.add(new Persona("Marcos", 31, "12174932V"));
        personaLista.add(new Persona("Antonia", 28, "75751766A"));
        personaLista.add(new Persona("Jennifer", 16, "62338332Q"));
        personaLista.add(new Persona("Jennifer", 28, "41649921M"));
        personaLista.add(new Persona("Catarra", 19, "59807411B"));
        //Muestre la lista
        System.out.println(personaLista);
        //Ordena la lista
        Collections.sort(personaLista);
        //Saca una copia del proyecto anterior y modifícalo para que se ordene por nombre en orden ascendente y, en el caso de que dos personas tengan el mismo nombre, entonces ordenará por edad descendentemente.
        System.out.println(personaLista);
        //Ver el archivo persona
        //FINAL
    }

}
