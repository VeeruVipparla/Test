package com.practiceprograms;

class Student{
    int rollNo;
    String name;
    static String company="Wipro";
    
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
         void display(){
             System.out.println(rollNo+" "+name+" "+company);
         }
    
    
    public static void main(String args[]){
        Student s1=new Student(100,"Veeru");
        Student s2=new Student(200, "Mani");
        s1.display();
        s2.display();
    }
}
