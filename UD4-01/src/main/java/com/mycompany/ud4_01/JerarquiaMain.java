package com.mycompany.ud4_01;

public class JerarquiaMain {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1 - Jerarquías");
        //OBJETOS
        Raton r = new Raton();
        Teclado t = new Teclado();
        Pantalla p = new Pantalla();
        Impresora i = new Impresora();
        Entrada e = t;
        Dispositivo d = p;
        
        //CONVERSIONES
        Entrada ent = r;
        Dispositivo dis = e;
        //Salida sal = t; (NO SE PUEDE IMPLEMENTAR)
        //Impresora imp = (Impresora) t; (NO SE PUEDE IMPLEMENTAR)
        EntradaSalida es = i;
        Salida s = (Salida) d;
        //Pantalla pant = d; (NO SE PUEDE IMPLEMENTAR)
        //Teclado tec = e; (NO SE PUEDE IMPLEMENTAR)
        //Raton rat = (Raton) t; (NO SE PUEDE IMPLEMENTAR)

    }
}
