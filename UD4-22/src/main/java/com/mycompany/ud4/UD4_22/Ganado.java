package com.mycompany.ud4.UD4_22;

public class Ganado implements Pesable {

    private double peso;

    public Ganado(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

}
