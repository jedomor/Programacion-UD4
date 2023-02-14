package com.mycompany.Persona;
import java.util.*;
public class PruebaSetPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("65463213G", "Manolo", "Moreno", "Barcelona", 22, 685454323, true, false);
        Persona p2 = new Persona("23164364R", "Raquel", "Fernandez", "Madrid", 22, 699332778, true, true);
        Persona p3 = new Persona("86621654L", "Carla", "Rodriguez", "Sevilla", 21, 616953286, false, true);

        System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
        
        Set conjunto = new HashSet(Arrays.asList(p1,p2,p3));
        
        Iterator iter = conjunto.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());            
        }
    }

}
