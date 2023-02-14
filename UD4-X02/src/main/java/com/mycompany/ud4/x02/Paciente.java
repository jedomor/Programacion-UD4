package com.mycompany.ud4.x02;

public class Paciente {
    private String nombre;
    private boolean vacunado;

    public Paciente(String nombre, boolean vacunado) {
        this.nombre = nombre;
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public boolean vacunar() {
        if (!vacunado) {
            this.vacunado = true;
            return true;
        } else {
            return false;
        }
    }
    
    
}
