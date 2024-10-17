package classprogram;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputOutput {
    public static void byteArrayIs() {
        String str = "This is java input output programing";
        byte[] arr = str.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        ByteArrayInputStream bin1 = new ByteArrayInputStream(arr, 0, arr.length);
        int count;
        while ((count = bin.read()) != -1) {
            System.out.print((char) count);
        }
        System.out.println(" \n ---------------------");
        try {
            while ((count = bin.read(arr)) != -1) {
                System.out.println(new String(arr, 0, count));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileIs() {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/sagar/OneDrive/Documents/data.txt");
            int count;
            byte[] arr = new byte[100];

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        byteArrayIs();
        fileIs();
        //bufferedIS();
//seqIS();
//stringBufferIS();
//pushbackIS();
        //  fileIO();
    }
}
