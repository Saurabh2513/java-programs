package loop;
//3. Print Odd Numbers between 1 - 100
public class OddNumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "\n");
            }
        }
    }
}
