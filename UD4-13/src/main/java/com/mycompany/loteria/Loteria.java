package com.mycompany.loteria;

import java.util.*;

public class Loteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set num = new HashSet();
        Integer entrada;

        System.out.println("Elija un número (-1 para terminar)");
        entrada = sc.nextInt();

        while (entrada != -1) {
            num.add(entrada);
            System.out.println("Elija un número (-1 para terminar)");
            entrada = sc.nextInt();
        }
        System.out.println("Entre el número del GORDO");
        entrada = sc.nextInt();
        
        Iterator iter = num.iterator();
        while (iter.hasNext()) {
            Integer temp = (Integer) iter.next();
            if(Integer.compare(temp, entrada)==0){
                System.out.println("La empresa vendió el numero premiado");
                break;
            }else{
                System.out.println("La empresa no ha vendido el numero premiado");
            }
        }
             
            
        

    }
}
