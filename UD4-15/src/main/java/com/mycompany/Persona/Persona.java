package com.mycompany.Persona;

public class Persona {

    private String DNI, nombre, apellidos, direccion;
    private int edad, telefono;
    private boolean estaCasada, tieneTrabajo;

    public Persona(String DNI, String nombre, String apellidos, String direccion, int edad, int telefono, boolean estaCasada, boolean tieneTrabajo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.estaCasada = estaCasada;
        this.tieneTrabajo = tieneTrabajo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstaCasada() {
        return estaCasada;
    }

    public void setEstaCasada(boolean estaCasada) {
        this.estaCasada = estaCasada;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    public void setTieneTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", edad=" + edad + ", telefono=" + telefono + ", estaCasada=" + estaCasada + ", tieneTrabajo=" + tieneTrabajo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.edad;
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
        final Persona other = (Persona) obj;
        return this.edad == other.edad;
    }

    
    
    
}
