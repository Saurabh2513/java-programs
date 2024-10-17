package oop.classes_objects;
//2. Use same Employee1 class and take all values from user for 3 students.
//      show who is the oldest student and who is the yonger student.

import java.util.Scanner;

class student1 {
    int rollno;
    String name;
    int age;
    String address;

    student1(int r, String n, int age, String add) {
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

public class YoungerStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first student details

        System.out.println("student rollno:");
        int rollno = scanner.nextInt();

        System.out.println("student name:");
        String name = scanner.next();

        System.out.println("student age:");
        int age = scanner.nextInt();

        System.out.println("student address:");
        String city = scanner.next();
        student1 s1 = new student1(rollno, name, age, city);
        s1.display();

        //second student details
        System.out.println("student rollno:");
        int rollno2 = scanner.nextInt();

        System.out.println("student name:");
        String name2 = scanner.next();

        System.out.println("student age:");
        int age2 = scanner.nextInt();

        System.out.println("student address:");
        String city2 = scanner.next();
        student1 s2 = new student1(rollno2, name2, age2, city2);
        s2.display();

        // third student details
        System.out.println("student rollno:");
        int rollno3 = scanner.nextInt();

        System.out.println("student name:");
        String name3 = scanner.next();

        System.out.println("student age:");
        int age3 = scanner.nextInt();

        System.out.println("student address:");
        String city3 = scanner.next();
        student1 s3 = new student1(rollno3, name3, age3, city3);
        s3.display();

        if (age < age2 && age < age2) {
            System.out.println("student younger\n" + name + "age is:" + age);
        } else if (age2 < age && age2 < age3) {
            System.out.println("student younger\n" + name2 + "age is:" + age2);
        } else {
            System.out.println("student younger\n" + name3 + "age is:" + age3);
        }
        if (age > age2 && age > age2) {
            System.out.println("student older\n" + name3 + "age is:" + age3);
        } else if (age2 > age && age2 > age3) {
            System.out.println("student older\n" + name2 + "age is:" + age2);
        } else {
            System.out.println("student older\n" + name3 + "age is:" + age3);
        }
    }
}

