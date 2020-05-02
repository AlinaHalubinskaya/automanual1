package com.company;

public class MyExceptions extends Exception {

    public MyExceptions() {
    }

    public MyExceptions(String msg) {
        message = msg;
        System.out.println(message);
    }

    private String message;

    public String additionalException() {
        return message;
    }

}
