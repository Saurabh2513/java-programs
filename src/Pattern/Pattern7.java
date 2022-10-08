package pattern;

/*7.
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
public class Pattern7 {
    public static void main(String[] args) {
        int num = 1, num1 = 5, i, j;
        for (i = 0; i < num1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


