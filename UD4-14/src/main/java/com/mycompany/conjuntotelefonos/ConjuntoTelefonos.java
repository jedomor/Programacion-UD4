package com.mycompany.conjuntotelefonos;

import java.util.*;

public class ConjuntoTelefonos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer permit;

        Set permitidos = new HashSet();
        Set prohibidos = new HashSet();

        System.out.println("Introduzca números de telefono permitidos (0 o menos para salir)");
        permit = sc.nextInt();

        while (permit > 0) {
            permitidos.add(permit);
            System.out.println("Introduzca números de telefono permitidos (0 o menos para salir)");
            permit = sc.nextInt();
        }

        System.out.println("Introduzca números de telefono a bloquear (0 o menos para salir)");
        permit = sc.nextInt();

        while (permit > 0) {
            prohibidos.add(permit);
            System.out.println("Introduzca números de telefono a bloquear (0 o menos para salir)");
            permit = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca tres numeros que llaman");
            permit = sc.nextInt();
            if (prohibidos.contains(permit)) {
                System.out.println("El telefono: " + permit + " Está prohibido, cuelga");
            } else if (permitidos.contains(permit)) {
                System.out.println("El telefono: " + permit + " Está permitido, puede atender la llamada");
            }else{
                System.out.println("El telefono: " +permit + " no es un numero conocido, haz lo que creas");
            }
        }

    }
}
