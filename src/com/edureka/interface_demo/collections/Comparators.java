package com.edureka.interface_demo.collections;

import java.util.Comparator;

public class Comparators{

    public static Comparator<Student> ageAscComparator = (one, two) -> one.getAge() - two.getAge();
    public static Comparator<Student> ageDescComparator = (student1, student2) -> student2.getAge() - student1.getAge();
    public static Comparator<Student> nameAscComparator = (student1, student2) -> student1.getName().compareTo(student2.getName());
    public static Comparator<Student> nameDescComparator = (student1, student2) -> student2.getName().compareTo(student2.getName());
     Runnable call = ()-> System.out.println("Calling thread ...");


}

 class AgeAscComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }
 }

 class AgeDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getAge() - student1.getAge();
    }
 }

 class NameAscComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
 }
 class NameDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getName().compareTo(student1.getName());
    }
 }
 class GradeAscComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getGrade() - student2.getGrade();
    }
 }
 class GradeDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getGrade() - student1.getGrade();
    }
 }