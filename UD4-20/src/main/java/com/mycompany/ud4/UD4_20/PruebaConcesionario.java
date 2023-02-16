package com.mycompany.ud4.UD4_20;

public class PruebaConcesionario {
    public static void main(String[] args) {
        
        Concesionario c1 = new Concesionario("Santy Motors", "Sevilla");
        Concesionario c2 = new Concesionario("A todo gas Johnny", "Utrera");
        
        Vehiculo v1 = new Vehiculo("Mercedes", "McLaren", "5832-FTL", 2004, 230975);
        Vehiculo v2= new Vehiculo("Aston Martin", "Vantage F1", "3257-HSS", 2010, 219990);
        Vehiculo v3= new Vehiculo("Aston Martin", "DB11", "2147-MNL", 2012, 174000);
        Vehiculo v4= new Vehiculo("Audi", "R8", "2165-DKF", 2018, 181850);
        Vehiculo v5= new Vehiculo("Lotus", "Exige Sport 350", "3796_LRA", 2015, 78800);
        Vehiculo v6= new Vehiculo("Porsche", "911 Turbo S", "9517-PTS", 2022, 265908);
        
        c1.anadirVehiculo(v1);
        c1.anadirVehiculo(v2);
        c1.anadirVehiculo(v3);
        c1.anadirVehiculo(v4);
        c1.anadirVehiculo(v5);
        c1.anadirVehiculo(v6);
        
        c2.anadirVehiculo(v2);
        c2.anadirVehiculo(v3);
        c2.anadirVehiculo(v5);
        System.out.println("");
        
        System.out.println("Vehiculos en venta de los concesionarios");
        System.out.println("CONCESIONARIO 1:");
        c1.mostrarVehiculos();
        System.out.println("CONCESIONARIO 2:");
        c2.mostrarVehiculos();
        System.out.println("");
        
        System.out.println("Actualizando vehiculos de los concesionarios");
        System.out.println("CONCESIONARIO 1: ");
        c1.actualizaVehiculo(new Vehiculo("Renault", "Clio Williams", "S-4327-FS", 1995, 39000));

        c1.mostrarVehiculos();
        System.out.println("CONCESIONARIO 2: ");
        c2.actualizaVehiculo(new Vehiculo("Ferrari", "LaFerrari", "6699-FTL", 2020, 1300000));
        c2.mostrarVehiculos();
        System.out.println("");
        
        System.out.println("Sumando el precio de los vehiculos en los concesionarios");
        System.out.println("CONCESIONARIO 1: ");
        System.out.println("El concesionario 1 " +c1.getNombre() +" tiene coches por valor de: " +c1.sumaPrecios());
        System.out.println("CONCESIONARIO 2: ");
        System.out.println("El concesionario 2 " +c2.getNombre() +" tiene coches por valor de: " +c2.sumaPrecios());
        System.out.println("");

        System.out.println("Borrando vehiculos en concesionarios:");
        c1.borrarVehiculo(v6);
        c2.borrarVehiculo(v2);
        System.out.println("CONCESIONARIO 1: ");
        c1.mostrarVehiculos();
        System.out.println("CONCESIONARIO 2: ");
        c2.mostrarVehiculos();

    }
}
