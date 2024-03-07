package Basic;

import java.util.Arrays;

public class Anagram {

    Anagram(){
        System.out.println("constructor called");
    }
    private boolean findAnagram(String str1, String str2){
        //findAnagrams(str1,str1);
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);



        return false;
    }

//    private static boolean findAnagrams(String string1, String string2){
//
//    }
    public static void main(String[] args) {
        Anagram obj = new Anagram();
        String str1 ="ate", str2 ="eat";

        if(obj.findAnagram(str1, str2)){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
