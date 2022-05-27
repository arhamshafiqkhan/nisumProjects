package com.arham.myexception;

public class StringNullException extends Exception {

    // default constructor
    public StringNullException() {
        super("String can not be null. Please enter a valid string!");
    }

    // parameterized constructor with a message
    public StringNullException(String message) {
        super(message);
    }
}
