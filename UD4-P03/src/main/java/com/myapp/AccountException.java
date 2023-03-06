
package com.myapp;


public class AccountException extends Exception{

    /**
     * Creates a new instance of <code>AccountException</code> without detail
     * message.
     */
    public AccountException() {
    }

    /**
     * Constructs an instance of <code>AccountException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AccountException(String msg) {
        super(msg);
    }
}
