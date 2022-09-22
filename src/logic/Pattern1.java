package logic;

import java.util.Scanner;

/*      1.
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        int num, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter pattern number: ");
        num = scanner.nextInt();
        for (i = 0; i < num; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}