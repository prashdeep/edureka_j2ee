package com.edureka.interface_demo.collections;

@FunctionalInterface
public interface Pay {
    void transferMoney(String customer, String merchant);
}