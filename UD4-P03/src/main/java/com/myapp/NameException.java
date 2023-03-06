/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.myapp;

/**
 *
 * @author Joan Edo Moreno
 */
public class NameException extends Exception{

    /**
     * Creates a new instance of <code>NameException</code> without detail
     * message.
     */
    public NameException() {
    }

    /**
     * Constructs an instance of <code>NameException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NameException(String msg) {
        super(msg);
    }
}
