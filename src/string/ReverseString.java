package string;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("enter the String: ");
        String str = name.nextLine();
        int length = str.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println("Reverse String is :" + rev);
    }
}

