package com.mycompany.ud4_10;

import java.util.*;

public class Persona implements Comparable<Object> {

    //Propiedades
    private String nombre, dni;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }

    //COMPARE TO
    @Override
    public int compareTo(Object o) {
        // Por edad y nombre ascendentes
        Persona p = (Persona) o;
        int result = edad - p.getEdad();
        if (result == 0) {
            result = nombre.compareTo(p.getNombre());
        }
        return result;
    }
    //FINAL
}
