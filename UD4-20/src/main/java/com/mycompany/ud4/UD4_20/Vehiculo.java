package com.mycompany.ud4.UD4_20;

public class Vehiculo {

    private String marca, modelo, matrícula;
    private int anioFabricación;
    private double precio;

    public Vehiculo(String marca, String modelo, String matrícula, int anioFabricación, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matrícula = matrícula;
        this.anioFabricación = anioFabricación;
        this.precio = precio;
    }

    
    public double getPrecio() {
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (61 * hash + this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return this.precio == other.precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matr\u00edcula=" + matrícula + ", anioFabricaci\u00f3n=" + anioFabricación + ", precio=" + precio + '}';
    }

}
