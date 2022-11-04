package classprogram;

import java.util.Scanner;

//1. Write a class named Student with variables: rollno, name, age, address. take this values from the user and store it into Student class
//& show it to user.
class student {
    int rollno;
    String name;
    int age;
    String address;

    student(int r, String n, int age, String add) {
        this.rollno = r;
        this.name = n;
        this.age = age;
        this.address = add;


    }

    public void display() {
        System.out.println("Rollno: \t" + this.rollno);
        System.out.println("Name: \t" + this.name);
        System.out.println("Age: \t" + this.age);
        System.out.println("Address: \t" + this.address);

    }
}
class Employee extends student{
    Employee(int r, String n, int age, String add) {
        super(r, n, age, add);
    }
}

public class StudentClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("student rollno:");
        int rollno = scanner.nextInt();

        System.out.println("student name:");
        String name = scanner.next();

        System.out.println("student age:");
        int age = scanner.nextInt();

        System.out.println("student address:");
        String city = scanner.next();
        student s1 = new student(rollno,   name , age, city);
        s1.display();
    }

}
