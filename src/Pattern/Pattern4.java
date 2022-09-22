package pattern;

/*4.
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
public class Pattern4 {
    public static void main(String[] args) {
        int num = 1, i, j;
        for (i = 1 ; i <= 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
