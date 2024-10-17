package classprogram;

public class ReveresString {
        public static void main (String[] args) {

            String str= "SagarYadav", nstr="";
            char ch;

            System.out.print("Original word: ");
            System.out.println(""+str); //Example word

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }

