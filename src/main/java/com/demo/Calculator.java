package com.demo;

public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public String getUserType(String type) {
        if (type == "ADMIN") {
            return "Admin";
        }
        return "User";
    }
}
