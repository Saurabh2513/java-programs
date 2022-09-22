package pattern;
/*2.
 * * * * *
 * * * *
 * * *
 * *
 *
 */

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        int num, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        num = scanner.nextInt();
        for (i = num - 1; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}