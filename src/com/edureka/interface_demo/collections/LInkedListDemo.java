package com.edureka.interface_demo.collections;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LInkedListDemo {
    public static void main(String[] args) {


        List<String> names = new LinkedList<>();
        List<Integer> ages = new LinkedList<>();
        ages.add(0, 45);
        ages.add(56);
        ages.add(57);
        ages.add(57);
        ages.add(43);
        names.add("Suma");
        names.add("Vinay");
        names.add("Kiran");
        names.add("Sumant");


        /*List<NewStudent> students = new LinkedList<>();
        students.add(new NewStudent(12,"Vinay"));
        students.add(new NewStudent(14,"Vikram"));
        students.add(new NewStudent(15,"Harish"));

        System.out.println(students.size());
        //printing the elements in the collection
        /*for (int index = 0; index < ages.size(); index++){
            System.out.println(ages.get(index));
        }

        for(NewStudent student: students){
            System.out.println(student.getName());
        }
    }
    List<Integer> ages = new ArrayList();
    */

        Student studentOne = new Student(34, "Ram");
        Student studentTwo = new Student(34, "sdfsdf");

        System.out.println(studentOne == studentTwo);
        System.out.println(studentOne.equals(studentTwo));
    }


}

class NewStudent{
    private int age;
    private String name;

    public NewStudent(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}