package pattern;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        int i, j, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter star number:");
        num = scanner.nextInt();
        for (i = 0; i < num; i++) {
            for (j =0;j<= i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

