
package com.myapp;

public class EmailException extends Exception{

    /**
     * Creates a new instance of <code>EmailException</code> without detail
     * message.
     */
    public EmailException() {
    }

    /**
     * Constructs an instance of <code>EmailException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EmailException(String msg) {
        super(msg);
    }
}
