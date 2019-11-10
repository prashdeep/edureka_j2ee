package com.edureka.interface_demo.collections;

public class InnerClassClient {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner();
        inner.printValue();
    }
}