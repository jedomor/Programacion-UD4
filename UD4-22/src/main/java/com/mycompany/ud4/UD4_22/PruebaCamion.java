package com.mycompany.ud4.UD4_22;

public class PruebaCamion {

    public static void main(String[] args) {
        Camion<Ganado> camGanado = new Camion<>();
        Camion<Madera> camMadera = new Camion<>();

        Ganado ganado = new Ganado(1000);
        Madera madera = new Madera(500);

        camGanado.cargarCamion(ganado);
        camMadera.cargarCamion(madera);

        System.out.println("El camión lleva: " + camGanado.getKilosCarga() + "kg de carga de Ganado");
        System.out.println("El camión lleva: " + camMadera.getKilosCarga() + "kg de carga de Madera");

    }
}
