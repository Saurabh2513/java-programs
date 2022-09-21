package loop;

import java.util.Scanner;
//4. Input number from user and print the multiplication table of that number

public class FactorialNumber {
    public static void main(String[] args) {
        int num, factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        num = scanner.nextInt();

        for ( int i = 1; i <= num; i++) {
            System.out.print( i +" * ");
            factorial = factorial *  i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
