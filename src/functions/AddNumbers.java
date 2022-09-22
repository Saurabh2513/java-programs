package functions;

public class AddNumbers {

    public int addNumber(int num1, int num2){
        return  num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        AddNumbers addNumbers = new AddNumbers();
        int result = addNumbers.addNumber(num1,num2);
        System.out.println("Addition : "+ result);
    }
}
