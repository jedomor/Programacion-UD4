package com.mycompany.ud4.UD4_21;

public class PruebaFunda {

    public static void main(String[] args) {

        Funda<Smartphone> fundaSmartphone = new Funda<>();
        Funda<Tablet> fundaTablet = new Funda<>();
        
        Smartphone s =new Smartphone("Samsung", "Galaxy 8", 6, true);
        Tablet t =new Tablet("Huawei", "P10", 10, true);
        
        fundaSmartphone.guardaDispositivo(s);
        fundaTablet.guardaDispositivo(t);
        
        
        fundaSmartphone.sacaDispositivo();
        fundaTablet.sacaDispositivo();

    }
}
