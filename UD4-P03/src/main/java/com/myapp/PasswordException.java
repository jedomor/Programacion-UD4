/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.myapp;

/**
 *
 * @author Joan Edo Moreno
 */
public class PasswordException extends Exception{

    /**
     * Creates a new instance of <code>PasswordException</code> without detail
     * message.
     */
    public PasswordException() {
    }

    /**
     * Constructs an instance of <code>PasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PasswordException(String msg) {
        super(msg);
    }
}
