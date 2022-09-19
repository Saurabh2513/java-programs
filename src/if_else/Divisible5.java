package if_else;

import java.util.Scanner;

//4. Take input number from user and check if it is divisible by 5 or not.

public class Divisible5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        num = scanner.nextInt();
        if (num % 5 == 0) {
            System.out.println("number is divisible by 5");
        } else {
            System.out.println("number is not divisible by 5");
        }
    }
}
