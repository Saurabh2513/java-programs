package classprogram;

public class Stack<T> {
    int size;
    StackElement top;

    public Stack() {
        size = 0;
        top = null;
    }

    public void push(T newValue) {
        StackElement<T> newElement = new StackElement<T>(newValue, top);
        top = newElement;
        size++;
    }

    public T pop() {
        StackElement<T> oldTop = top;
        if (size == 0) {
            return null;
        }
        top = top.getNext();
        size--;
        return oldTop.getValue();
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return (T) top.getValue();
    }

    public void empty() {
        size = 0;
        top = null;
    }

    public static void main(String[] args) {
        Stack<String> myStringStack = new Stack<String>();
        myStringStack.push("sagar");
        myStringStack.push("Yadav");
        System.out.println(myStringStack.peek());
        System.out.println(myStringStack.pop());
        System.out.println(myStringStack.pop());
        System.out.println(myStringStack.pop());
    }
}
