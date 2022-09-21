package loop;

import java.util.Scanner;
//4. Input number from user and print the multiplication table of that number

public class Multiplication {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}