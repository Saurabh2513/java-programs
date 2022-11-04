package classprogram;

import java.util.*;

public class CollectionDemo {
    static public void ArrayListDemo() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 1);
        list.add(1, 0);
        list.add(1);
        list.add(20);
        List<Integer> I2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "-----" + list.get(i));
        }
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static public void LinkedDemo() {
        List<String> list = new LinkedList<String>();
        list.add("Bitcode");
        list.add("red");
        list.add("yellow");
        list.remove(1);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static public void VectorDemo() {
        List<Character> vec = new Vector<Character>();
        vec.add('a');
        vec.add('b');
        vec.add('c');

        System.out.println(vec.size());
        vec.remove(0);
        System.out.println(vec.size());

        Iterator itr = vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static public void StackDemo() {
        Stack<Integer> st = new Stack<Integer>();

        st.push(200);
        st.push(300);
        st.push(400);
        st.add(1, 100);
        st.pop();
        System.out.println(st.peek());

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        ArrayListDemo();
        LinkedDemo();
        VectorDemo();
        StackDemo();
    }
}
