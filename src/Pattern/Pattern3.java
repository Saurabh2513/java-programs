package pattern;

import java.util.Scanner;

/*3.
        A A A A A
        A A A A
        A A A
        A A
        A
*/
public class Pattern3 {
    public static void main(String[] args) {
        int  i, j,num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of pattern:");
        num= scanner.nextInt();
        for (i = num - 1; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print("A" + " ");
            }
            System.out.println();
        }
    }
}
