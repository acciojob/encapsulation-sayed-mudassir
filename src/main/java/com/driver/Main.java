package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
//        r.name = "Mudassir";
//        System.out.print(r.name);
//        this will show us error
//        error: name has private access in com.driver.RWOnly
        r.setName("Mudassir");
        String name = r.getName();

    }
}