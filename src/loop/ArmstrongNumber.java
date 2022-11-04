package loop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int i = 1, a, arm, n, temp;
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
         a = scanner.nextInt();
      */
        System.out.println("armstrong number between 1 to 500 are:");
        while (i < 500) {
            n = i;
            arm = 0;
            while (n > 0) {
                a = n % 10;
                arm = arm + (a * a * a);
                n = n / 10;
            }
            if (arm == i)
                System.out.println(i);
            i++;
        }
    }
}

