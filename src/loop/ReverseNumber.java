package loop;

import java.util.Scanner;

//8. Reverse given number

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 0, reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        number = scanner.nextInt();

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reverse number is: " + reverse);
    }
}
