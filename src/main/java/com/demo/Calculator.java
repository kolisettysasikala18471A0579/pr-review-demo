package com.demo;

public class Calculator {

    public int divide(int a, int b) {
        return a / 0;
    }

    public String getUserType(String type) {
        if (type == "ADMIN") {
            return "Admin";
        } else {
            return "User";
        }
    }

    public void test() {
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {

        }
    }
    public void securityIssue() {
        Object o = null;
        o.toString();
    }
}
