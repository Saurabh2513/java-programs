package loop;

import java.util.Scanner;

//9. Check is number palindrome or not.


public class PalindromeNumber {
    public static void main(String[] args) {

        int i, number = 0, temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = scanner.nextInt();

        temp = n;
        while (n > 0) {
            i = n % 10;
            number = (number * 10) + i;
            n = n / 10;
        }
        if (temp == number)
            System.out.println("it is palindrome number: " + number);
        else
            System.out.println("it is not palindrome number: " + number);
    }
}
