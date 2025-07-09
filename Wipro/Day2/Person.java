package Wipro.Day2;

import java.util.Scanner;

public class Person {

    String name;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }


//    void accept_param(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter name");
//        name = sc.nextLine();
//        System.out.print("Enter age");
//        age = sc.nextInt();
//    }

    void display(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }




}
class Doctor extends Person{

    int salary;
    String specilization;

    Doctor(String specilization , int salary , String name ,int age){
        super(name , age);
        this.specilization = specilization ;
        this.salary = salary;
    }

//    void accept_student(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter course : ");
//        course = sc.nextLine();
//        System.out.print("Enter roll num :");
//        roll_num = sc.nextInt();
//    }

    void display_doctor(){
        System.out.println(" specilization : " + specilization);
        System.out.println("salary : " + salary);
    }


}

class Student extends Person{

    int roll_num;
    String course;

    Student(String course , int roll_num , String name ,int age){
        super(name , age);
        this.course = course;
        this.roll_num = roll_num;
    }

//    void accept_student(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter course : ");
//        course = sc.nextLine();
//        System.out.print("Enter roll num :");
//        roll_num = sc.nextInt();
//    }

    void display_student(){
        System.out.println("course : " + course);
        System.out.println("rollnum : " + roll_num);
    }


}

class Main{
    public static void main(String[] args) {
        Student obj = new Student("entc" ,22 ,"Anish" , 21);
//        obj.accept_param();
//        obj.accept_student();
        obj.display();
        obj.display_student();

        Doctor dtr = new Doctor("surgeon" , 200000 , "Dr.Akshay" , 23);
        dtr.display();
        dtr.display_doctor();
    }
}
