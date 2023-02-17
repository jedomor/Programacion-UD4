package com.mycompany.ud4.UD4_22;

public class Camion<T> {

    private T camion;

    public void cargarCamion(T carga) {
        camion = carga;
    }

    public T descargarCamion() {
        T descargar = camion;
        camion = null;
        return descargar;
    }

    public boolean estaVacio() {
        return camion == null;
    }

    public double getKilosCarga (){
        if (camion !=null){
            Pesable peso = (Pesable) camion;
            return peso.getPeso();
        }else{
            return 0;
        }
    }
}
