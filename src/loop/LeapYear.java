package loop;
//6. Print leap years from, 2000 - 3000

public class LeapYear {
    public static void main(String[] args)
    {
        int leapYear = 2000,x;
        for (x = 4; x <= 254; x++)
        {
            System.out.print(leapYear + " ");
            leapYear = leapYear + 4;
            System.out.println(" ");
        }
    }
}