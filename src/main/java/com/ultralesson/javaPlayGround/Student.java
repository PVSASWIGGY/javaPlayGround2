package com.ultralesson.javaPlayGround;

public class Student {
    private String name;
    public Student(){
        this.name="Unknown";
    }
    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Student s1=new Student("Akhil");
        Student s2=new Student();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
