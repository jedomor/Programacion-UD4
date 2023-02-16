
package com.mycompany.ud4.UD4_21;

public abstract class Dispositivo {
    private String Marca, Modelo;
    private int tamanioPulgadas;
    private boolean estado;

    public Dispositivo(String Marca, String Modelo, int tamanioPulgadas, boolean estado) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.tamanioPulgadas = tamanioPulgadas;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", tamanioPulgadas=" + tamanioPulgadas + ", estado=" + estado + '}';
    }
    
    
}
