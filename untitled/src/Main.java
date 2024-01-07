//convert array to 2D array 2610 leetcode

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 4, 1, 2, 3, 1};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i: nums) {
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (!hashmap.isEmpty()){
            ArrayList<Integer> temp= new ArrayList<>();
            ArrayList<Integer> toErase = new ArrayList<>();
            for(HashMap.Entry<Integer, Integer> entry : hashmap.entrySet()){

                int k = entry.getKey();
                int v = entry.getValue();
                temp.add(k);
                v--;
                if(v==0) {
                    toErase.add(k);
                }
                hashmap.put(k,v);
            }
            ans.add(temp);
            for(int i: toErase) {
                hashmap.remove(i);
            }
        }

        System.out.println("hashmap: "+ans);


    }
}