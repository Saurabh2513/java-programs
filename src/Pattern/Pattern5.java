package pattern;

/*5.
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

 */
public class Pattern5 {
    public static void main(String[] args) {
        int num = 0, num1 = 5, i, j;
        for (i = 0; i < num1; i++) {
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
