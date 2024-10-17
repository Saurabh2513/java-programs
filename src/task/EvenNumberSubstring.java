package task;

public class EvenNumberSubstring {
    public static void evenNumberSubstring(char[] str) {
        int count = 0;
        // Traverse each digit in the given string
        for (int i = 0; i < str.length; i++) {
            // Check if the current digit is even
            if (str[i] % 2 == 0) {
                // Add i + 1 to the count, because all substrings ending at "i" are valid
                count += (i + 1);
            }
        }
        // Output the count of even-numbered substrings
        System.out.println(count);
    }
    public static void main(String[] args) {
        // Example input
        char[] str = "154".toCharArray();
        evenNumberSubstring(str);
    }
}
