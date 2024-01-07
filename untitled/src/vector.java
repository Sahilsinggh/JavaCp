import java.util.*;

public class vector extends LinkedListClass {

//    public static void t(String[] args) {
//        main1(args);
//    }

    public static void main(String[] args) {
//        t(args);

        Vector v =new Vector();

        v.add(1);
        v.add("vector");
        v.add(2);
        v.add('3');
        v.add(3);

        System.out.println("cout vector v: "+v);

        v.remove(1);
        v.removeElement('3');

        System.out.println(v);

        String arr = v.toString();
        System.out.println("String: "+ arr);

        Vector<Integer> v1 = new Vector<>();

        System.out.println("ll: "+ll);
    }
}
