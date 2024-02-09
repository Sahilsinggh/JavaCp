package collection;

import java.util.*;
import java.util.function.Consumer;


public class ArrayLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("list1"+list1);
        Iterator<Integer> it = list1.iterator();
       while(it.hasNext()) {
           System.out.println(it.next().toString());
        }

        ArrayList<Integer> list2 = new ArrayList();

        list2.add(60);
        list2.add(70);
        list2.add(90);
        list2.addAll(list1);

        System.out.println(list2);

        List<Integer> ll= new LinkedList<>();
        ll.add(110);
        ll.add(199);
        ll.add(150);


        ll.addAll(list2);
        System.out.println(ll);

        ll.clear();
        System.out.println(ll);
        System.out.println(list2);

        System.out.println(list2.containsAll(list1));

    }
}
