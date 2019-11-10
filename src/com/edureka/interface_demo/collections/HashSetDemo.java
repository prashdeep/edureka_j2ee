package com.edureka.interface_demo.collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Student ram = new Student(34, "Ram");
        Student vinay = new Student(36, "Vinay");
        Student vinay2 = new Student(36, "Vinay");
        Set<Student> students = new HashSet<>();
        students.add(ram);
        students.add(vinay);
        students.add(vinay2);
        vinay.setName("HariVinay");
        vinay.setAge(3);

        Iterator<Student> iterator = students.iterator();
        System.out.println("Is the set empty before iteration :: "+students.isEmpty());



        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
            //iterator.remove();
        }
        students.clear();
        System.out.println("Is the set empty after iteration:: "+students.isEmpty());


    /*  ListIterator<Student> listIterator = students.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Printed all the students ");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
*/
    }
}