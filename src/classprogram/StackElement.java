package classprogram;

public class StackElement <T>{
T Value;
StackElement<T> next;

    public StackElement (T Value,StackElement<T> next){
        this.Value=Value;
        this.next=next;
    }

    public StackElement<T> getNext() {
        return next;
    }


    public T getValue() {

        return next.Value;
    }
}
