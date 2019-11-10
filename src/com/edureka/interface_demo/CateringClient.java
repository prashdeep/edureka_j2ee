package com.edureka.interface_demo;

import java.util.Scanner;

interface Catering {



    String[] getStarters();

    String[] getMainCourseItems();

    String[] getDesserts();

    default String nameOfCaterer(){
        return this.getClass().getName();
    }
}

class AwesomeCaterers implements Catering {

    @Override
    public String[] getStarters() {
        return new String[]{"Soup", "Masala papad"};
    }

    @Override
    public String[] getMainCourseItems() {
        return new String[]{"Roti","Dal", "Rice", "Curd-Rice"};
    }

    @Override
    public String[] getDesserts() {
        return new String[]{"Fruit-Salad","Gulab-Jamun"};
    }
}

class BestInTownCaterers implements Catering {

    @Override
    public String[] getStarters() {
        return new String[]{"Soup", "Masala papad"};
    }

    @Override
    public String[] getMainCourseItems() {
        return new String[]{"Fried-Rice","Tanduri - Dal", "Rice", "Curd-Rice"};
    }

    @Override
    public String[] getDesserts() {
        return new String[]{"Vanilla Ice Cream","Gulab-Jamun"};
    }

    public double provideDiscount(){
        return 25;
    }


    @Override
    public String nameOfCaterer(){
        return "My Custom Name";
    }
}



abstract class ABCCaterersInTexas implements Catering {

    @Override
    public String[] getMainCourseItems() {
        return new String[]{"Fried-Rice","Tanduri - Dal", "Rice", "Curd-Rice"};
    }

    @Override
    public String[] getDesserts() {
        return new String[]{"Vanilla Ice Cream","Gulab-Jamun"};
    }

}

class ABCCaterersInHoustan extends ABCCaterersInTexas {

    @Override
    public String[] getStarters() {
        return new String[]{"Soup", "Masala papad"};
    }


}

class FamousCaterers implements Catering{

    @Override
    public String[] getStarters() {
        return new String[0];
    }

    @Override
    public String[] getMainCourseItems() {
        return new String[0];
    }

    @Override
    public String[] getDesserts() {
        return new String[0];
    }


}

public class CateringClient {

    public static final String CURRENCY = "INR";

    public static void staticMethod(){
        System.out.println("Static method ....");
    }


    public static void main(String[] args) {

        System.out.println("Please enter the caterer of your choice");
        System.out.println("***************************************");
        System.out.println("1. AwesomeCaterers");
        System.out.println("2. BestInTown");
        System.out.println("3. ABCCaterersInHoustan");
        System.out.println("***************************************");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        Catering catering = null;
        switch (option) {
            case 1:
                catering = new AwesomeCaterers();
                break;
            case 2:
                catering = new BestInTownCaterers();
                break;
            case 3:
                catering = new ABCCaterersInHoustan();
                break;
            default:
                catering = new ABCCaterersInHoustan();
                break;
        }
        scanner.close();

        //ABCCaterersInTexas abcCaterersInTexas = new ABCCaterersInTexas();


        System.out.println("Number of starters "+ catering.getStarters().length);
        System.out.println("Number of main course "+ catering.getMainCourseItems().length);
        System.out.println("Number of desserts "+ catering.getDesserts().length);
        System.out.println("Name of the caterer "+ catering.nameOfCaterer());

    }

}
