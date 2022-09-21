package loop;

//7. Print all number divisible by 7 between 1-300

public class Divisible7 {
    public static void main(String[] args) {
        for (int num = 1; num < 300; num++) {
            if (num % 7 == 0)
                System.out.print(num + " \t");
        }
    }
}
