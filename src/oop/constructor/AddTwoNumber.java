package oop.constructor;

import java.util.*;


public class AddTwoNumber {
    int num1, num2, result;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value:");
        num1 = scanner.nextInt();
        System.out.println("enter second value:");
        num2 = scanner.nextInt();
    }

    void display() {
        result = num1 + num2;
        System.out.println("result is:" + result);
    }

    public static void main(String[] args) {
        AddTwoNumber add = new AddTwoNumber();
        add.accept();
        add.display();

    }
}
