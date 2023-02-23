package com.mycompany.ud4.UD4_22;

public class Madera implements Pesable {

    private double peso;

    public Madera(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

}
