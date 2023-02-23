package com.myapp;
//Edo Moreno, Joan. DAW1-A

import java.util.Objects;


public class User {

    //Declaración de las propiedades
    private final String email;
    private String name;
    private int hashedPassword;

    //Constructor con los parametros
    public User(String name, String email, int hashedPassword) {
        this.name = name;
        this.email = email;
        this.hashedPassword = hashedPassword;
    }

    //Equals y Hash code para comparar los email

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.email);
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
        final User other = (User) obj;
        return Objects.equals(this.email, other.email);
    }


    //ToString que nos mostrará los mensajes
    @Override
    public String toString() {
        return "User{" + "Email=" + email + ", Name=" + name + ", Password=" + hashedPassword + '}';
    }

    //Getters de todas las propiedades
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getHashedPassword() {
        return hashedPassword;
    }

    //Setters de las propiedades (excepto Email)
    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(int hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    //Final de la clase
}
