package pattern;
/*6.
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
*/
public class pattern6 {
    public static void main(String[] args) {
        int  num1 = 5, i, j;
        for (i = num1; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
