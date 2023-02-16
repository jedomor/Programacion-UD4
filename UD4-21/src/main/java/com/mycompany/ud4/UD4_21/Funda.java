package com.mycompany.ud4.UD4_21;

import javax.swing.text.AbstractDocument;

public class Funda<T> {

    private T almacen;

    public void guardaDispositivo(T dispositivo) {
        almacen = dispositivo;
    }

    public T sacaDispositivo() {
        T dispositivoVisto = almacen;
        almacen = null;
        return dispositivoVisto;
    }
    
    public boolean estaVacio(){
        return almacen == null;
    }

}
