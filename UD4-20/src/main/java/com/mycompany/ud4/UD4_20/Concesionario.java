package com.mycompany.ud4.UD4_20;

import java.util.*;

public class Concesionario {

    private String nombre, dirección;
    private Set<Vehiculo> vehiculos;

    public Concesionario(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        vehiculos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void anadirVehiculo(Vehiculo c) {
        vehiculos.add(c);
    }

    public void actualizaVehiculo(Vehiculo c) {
        if (!vehiculos.isEmpty()) {
            if (vehiculos.contains(c)) {
                vehiculos.add(c);
            }
        } else {
            System.out.println("Lista vacía");
        }
    }

    public void borrarVehiculo(Vehiculo c) {
        if (vehiculos.contains(c)) {
            vehiculos.remove(c);
        } else {
            System.out.println("El vehicluo no se encontraba en la lista");
        }
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            Iterator<Vehiculo> iter = vehiculos.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next().toString());
            }
        }
    }

    public double sumaPrecios() {
        Iterator<Vehiculo> iter = vehiculos.iterator();
        double resultado = 0;
        while (iter.hasNext()) {
            Vehiculo v = iter.next();
            resultado += v.getPrecio();

        }
        return resultado;

    }

}
