package com.edureka.interface_demo.collections;

public class Outer {

    private static String variable = "Hello World";

    private static void printData(){
        System.out.println("The value of variable is "+variable);
    }

    public static class Inner {

        public void printValue(){
            printData();
        }
    }
}