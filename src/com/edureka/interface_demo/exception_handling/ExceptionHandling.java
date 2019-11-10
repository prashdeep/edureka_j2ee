package com.edureka.interface_demo.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.edureka.interface_demo.CateringClient.CURRENCY;
import static com.edureka.interface_demo.CateringClient.staticMethod;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            System.out.println("Currency "+ com.edureka.interface_demo.CateringClient.CURRENCY);
            staticMethod();
            System.out.println("please enter a number to be divided");
            scanner = new Scanner(System.in);
            int divident = scanner.nextInt();
            System.out.println("please enter another number for divisor");
            int divisor = scanner.nextInt();

            double result = divident / divisor;
        } catch (ArithmeticException  | InputMismatchException e){
            System.out.println("Wrong input");
        } catch (Exception e){
            System.out.println("Exception ");
            e.printStackTrace();
            scanner.close();
        } finally {
            System.out.println("See you soon !!");
        }
    }
}