package com.mycompany.cliente;

import java.util.*;

public class PruebaMapaCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1, "Manuel", "Martorell");
        Cliente c2 = new Cliente(2, "Julia", "Yin");
        Cliente c3 = new Cliente(3, "Adrià", "Moreno");

        Map clientes = new HashMap();
        clientes.put(c1.getIdCliente(), c1);
        clientes.put(c2.getIdCliente(), c2);
        clientes.put(c3.getIdCliente(), c3);

        Set conjuntoClientes = clientes.keySet();
        Iterator iteradorClientes = conjuntoClientes.iterator();

        while (iteradorClientes.hasNext()) {
            System.out.println(clientes.get(iteradorClientes.next()));
        }
        System.out.println("Borrando cliente 1");
        conjuntoClientes.remove(c1.getIdCliente());
        
        System.out.println("Borrando cliente 2");
        
        //traemos a cliente 2
        c2 = (Cliente) clientes.get(c2);
        //modificamos el nombre a cliente 2
        c2.setNombre("Jin");
        //volvemos a poner a cliente 2 en el map
        clientes.put(c3.getIdCliente(), c3);
        

        iteradorClientes = conjuntoClientes.iterator();
        while (iteradorClientes.hasNext()) {
            System.out.println(clientes.get(iteradorClientes.next()));
        }
    }

}
