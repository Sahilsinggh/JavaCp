//Convert a give file path to simpler form or Actual path. using stack.
//71. Simplify Path - LEETCODE

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

class StackQ1 {

    public static void main(String[] args) {
        String input = "/../";


        String s = ActualPath(input); //function to convert input to simpler form
        System.out.println(s);
    }

    public static String ActualPath(String input) {
        if (input.isEmpty()) {
            return  "/";
        }
        String[] words = input.split("[/ //]+");
        Stack path = new Stack<>();
        for (String str : words) {
            if (Objects.equals(str, "..")) {
                if (!path.empty()) {
                    path.pop();
                }
            } else if (Objects.equals(str, ".")) {
                continue;
            } else if (!str.isEmpty()) {
                path.push(str);
            }

        }
        System.out.println(path.toString());
        StringBuilder sb = new StringBuilder();
        while (!path.empty()) {
            sb.insert(0, path.pop());
            sb.insert(0, "/");
        }
        if(sb.isEmpty()){
            return "/";
        }
        System.out.println(sb);
        String string = sb.toString();
        return string;
//        for(int i=0;i<input.length();i++){
//            if(input.charAt(i)=='/'){
//                continue;
//            }
    }
}

//learnings:
//1. Instead of using "==" to compare String in condition, use Objects.equals(str1, str2); --24, 29
//2. Use of Split() in String: input.split("[/ //]+"); --21
//3. instead of str.length()!=0 use !str.isEmpty(); --32
//4. instead of insert in StringBuffer we can use Append also
