package com.mycompany.mapahabitaciones;

import java.util.*;

public class MapaHabitaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt, hab;

        Map estadoHabitaciones = new HashMap();
        estadoHabitaciones.put(101, false);
        estadoHabitaciones.put(102, true);
        estadoHabitaciones.put(103, true);
        estadoHabitaciones.put(104, false);
        estadoHabitaciones.put(105, true);
        estadoHabitaciones.put(201, true);
        estadoHabitaciones.put(202, false);
        estadoHabitaciones.put(203, false);
        estadoHabitaciones.put(204, true);
        estadoHabitaciones.put(205, false);

        do {
            System.out.println("Introduzca la opción deseada");
            System.out.println("0 - Salir");
            System.out.println("1 - Ver estado de ocupación");
            System.out.println("2 - Ocupar una habitación");
            System.out.println("3 - Liberar una habitación");
            opt = sc.nextInt();
            switch (opt) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    Set conjuntoHabitaciones = estadoHabitaciones.keySet();
                    Iterator iterHotel = conjuntoHabitaciones.iterator();
                    while (iterHotel.hasNext()) {
                        int key = (int) iterHotel.next();
                        System.out.println("Habitación: " + key + " está ocupada: " + ((Boolean) estadoHabitaciones.get(key) ? "esta ocupada" : "está libre"));
                    }
                    break;
                case 2:
                    System.out.println("¿Que habitación desea ocupar?");
                    hab = sc.nextInt();
                    if (estadoHabitaciones.containsKey(hab)) {
                        if (!((Boolean) estadoHabitaciones.get(hab))) {
                            estadoHabitaciones.replace(hab, true);
                            System.out.println("Habitación: " + hab + " está ahora ocupada");
                        } else {
                            System.out.println("Habitación: " + hab + " ya estaba ocupada");
                        }
                    } else {
                        System.out.println("Habitacion: " + hab + " NO EXISTE");
                    }
                    break;
                case 3:
                    System.out.println("¿Que habitación desea vaciar?");
                    hab = sc.nextInt();
                    if (estadoHabitaciones.containsKey(hab)) {
                        if (((Boolean) estadoHabitaciones.get(hab))) {
                            estadoHabitaciones.replace(hab, false);
                            System.out.println("Habitación: " + hab + " está ahora vacía");
                        } else {
                            System.out.println("Habitación: " + hab + " ya estaba vacía");
                        }
                    } else {
                        System.out.println("Habitacion: " + hab + " NO EXISTE");
                    }
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (opt != 0);

    }

}
