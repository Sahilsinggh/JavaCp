/*

//https://www.yourcodeway.com/2020/10/hackerrank-problem-solving-basic-solution_5.html

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    */
/*
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     *//*


    public static int filledOrders(List<Integer> order, int k) {
        // Write your code here
        int n = order.size();
        Collections.sort(order);
        int res =0;
        int count =0;

        for(int i=0;i< n;i++){
            if(count + order.get(i)<=k){
                res++;
                count = count+ order.get(i);
            }
            else{
                break;
            }
            System.out.println(count+" "+ res);

        }
        return res;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int orderCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> order = IntStream.range(0, orderCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.filledOrders(order, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
