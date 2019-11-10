package com.edureka.interface_demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList();

        ages.add(0, 45);
        ages.add(56);
        ages.add(57);
        ages.add(57);
        ages.add(43);

        List<String> names = new ArrayList<>();
        names.add("Suma");
        names.add("Vinay");
        names.add("Kiran");
        names.add("Sumant");

        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"Vinay"));
        students.add(new Student(14,"Vikram"));
        students.add(new Student(15,"Harish"));

        int n[] = new int[10];
        System.out.println(students);

        //System.out.println(students.size());
        //printing the elements in the collection
        /*for (int index = 0; index < ages.size(); index++){
            System.out.println(ages.get(index));
        }*/

      /*  for(Student student: students){
            System.out.println(student.getName());
        }
        */


    }
}

