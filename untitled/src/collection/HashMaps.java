package collection;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        hashmap.put('l',0);
        hashmap.put('e',1);
        hashmap.put('t',3);
        hashmap.put('c',4);



        System.out.println(hashmap);

        HashMap<Character, Integer> hashmap2 = new HashMap<>();

        hashmap2.put('f',6);
        hashmap2.put('g',7);
        hashmap2.put('h',8);
        hashmap2.put('e',5);
        hashmap2.put('d',4);
        hashmap2.put('a',0);
        hashmap2.put('b',1);
        hashmap2.put('c',3);
        hashmap2.put('i',0);
        hashmap2.put('j',10);
        hashmap2.put('k',9);
        hashmap2.put('l',11);
        hashmap2.put('m',12);
        hashmap2.put('n',13);
        hashmap2.put('@',-1);
        hashmap2.put('p',13);
        hashmap2.put('q',-1);
        System.out.println(hashmap2);

    }
}
