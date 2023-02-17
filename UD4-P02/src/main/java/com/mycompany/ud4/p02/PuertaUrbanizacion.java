package com.mycompany.ud4.p02;

import java.util.*;

public class PuertaUrbanizacion {

    private Map <Integer, Tarjeta> tarjetasPermitidas;
    private Set<Tarjeta> tarjetasDentro;

    public PuertaUrbanizacion() {
        tarjetasDentro = new HashSet<>();
        tarjetasPermitidas = new HashMap();
    }

    public void agregaTarjetaPermitida(Tarjeta t) {
        if (tarjetasPermitidas.containsKey(t.getIdentificador())) {
            System.out.println("ERROR : TARJETA YA ALMACENADA");
        } else {
            tarjetasPermitidas.put(t.getIdentificador(), t);
            System.out.println("EXITO : ALMACENANDO TARJETA");
        }
    }

    public void eliminarTarjetaPermitida(Tarjeta t) {
        if (!tarjetasPermitidas.containsKey(this)) {
            System.out.println("ERROR : TARJETA NO ALMACENADA");
        } else {
            tarjetasPermitidas.remove(this);
            System.out.println("EXITO : TARJETA ELIMINADA");
        }
    }

    public void imprimeTarjetasPermitidas(Tarjeta t) {
        if (tarjetasPermitidas.isEmpty()) {
            System.out.println("ERROR : NO HAY TARJETAS ALMACENADAS");
        } else {
            Set conjuntoTarjetas = tarjetasPermitidas.keySet();
            Iterator iterImprime = conjuntoTarjetas.iterator();
            while (iterImprime.hasNext()) {
                String Imp = (String) iterImprime.next();
                System.out.println("TARJETA NUM: " +Imp +" PROPIETARIO: " +tarjetasPermitidas.get(Imp));
            }
        }
    }
    
    public void intentoEntrada (){
        
    }



}
