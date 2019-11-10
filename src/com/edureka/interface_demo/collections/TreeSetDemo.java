package com.edureka.interface_demo.collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(34);
        numbers.add(45);
        numbers.add(67);
        numbers.add(12);
        numbers.add(13);
        numbers.add(89);
        numbers.add(43);
        numbers.add(43);

        Student ram = new Student(34, "Ram", 12, "Bangalore" );
        Student vinay = new Student(36, "Vinay", 4, "Chennai");
        Student vinay2 = new Student(389, "Vinay", 6, "Mumbai");
        Student ram2 = new Student(36, "Ram", 12, "Calcutta" );
        Student kishore = new Student(30, "Kishore", 4, "Chennai");
        Student vinay4 = new Student(38, "Harish", 6, "Mumbai");

        Set<Student> students = new TreeSet<>(new GradeDescComparator());
        students.add(ram);
        students.add(vinay);
        students.add(vinay2);
        students.add(ram2);
        students.add(kishore);
        students.add(vinay4);


        Set<String> letters = new TreeSet<>( );
        letters.add("f");
        letters.add("b");
        letters.add("d");
        letters.add("a");
        letters.add("e");

        Iterator<Student> it = students.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}