package com.edureka.interface_demo.collections;

public class Student implements Comparable<Student>{

    private int age;
    private String name;
    private int grade;
    private String city;

    public void setName(String name){
        this.name = name;
    } public void setAge(int age){
        this.age = age;
    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Student(int age, String name, int grade, String city){
        this.age = age;
        this.name = name;
        this.city = city;
        this.grade = grade;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    public int getGrade() {
        return grade;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        System.out.println(Math.random()*100);
        return (int)(Math.random()*10000);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age ;
    }
}