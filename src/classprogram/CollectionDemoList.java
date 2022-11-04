package classprogram;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.Set;

public class CollectionDemoList {
    public static void HashSetDemo() {
        Set<Integer> setList = new HashSet<Integer>();
        HashSet s1 = new HashSet();
        setList.add(100);
        setList.add(200);
        setList.add(300);
        Iterator i1 = setList.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

    public static void linkedHashSet() {
        Set s1 = new LinkedHashSet();
        s1.add("AAAA");
        s1.add("BBBB");
        s1.add("CCCC");
        s1.add("AAAA");
        Iterator i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

    public static void treeSetDemo() {
        Set s1 = new TreeSet<String>();
        s1.add("Red");
        s1.add("Blue");
        s1.add("Yellow");
        s1.add("Green");
        Iterator i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

    public static void hashMapDemo() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "sweet");
        map.put(200, "sugar");
        map.put(400, "cake");
        for (Map.Entry<Integer, String> e1 : map.entrySet()) {

            System.out.println(e1.getKey()+"::"+e1.getValue());
        }
        Set s1 = map.entrySet();
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void linkedHashMapDemo(){
        LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();
        hm.put(777,"tiger");
        hm.put(888,"eat");
        hm.put(999,"meet");
        hm.put(111,"et");

        for(Map.Entry <Integer,String> m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Set s1 = hm.entrySet();
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
hashMapDemo();
        System.out.println("-----------------");
linkedHashSet();
        System.out.println("-----------------");
treeSetDemo();
        System.out.println("-----------------");
hashMapDemo();
        System.out.println("-----------------");
linkedHashMapDemo();
    }
}
