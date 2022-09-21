package loop;
//6. Print leap years from, 2000 - 3000

public class LeapYear {
    public static void main(String[] args) {

        for (int year = 2000; year <= 3000; year++) {
            if (year % 4 == 0) {
                System.out.print("\t" + year);
            }
        }
    }
}