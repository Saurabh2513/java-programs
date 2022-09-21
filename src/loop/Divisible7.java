package loop;

//7. Print all number divisible by 7 between 1-300

public class Divisible7 {
    public static void main(String[] args) {
        int number=300;
        for (int num = 1; num < number; num++) {
            if (num % 7 == 0 )
                System.out.print(num + " \n");
            }
        }
    }
