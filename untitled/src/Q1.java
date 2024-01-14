//https://dzone.com/articles/skps-algorithms-and-data-structures-4-java-problem-1


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
import java.util.HashMap;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
        // Write your code here
        int len = customers.size();

        HashMap<String, Integer> map = new HashMap<>();

        for( String customer : customers){
            int count = map.containsKey(customer) ? map.get(customer) : 0;
            map.put(customer, count + 1);
        }

        List<String> ans = new ArrayList<>();
        Iterator hmIterator = map.entrySet().iterator();

        while (hmIterator.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry)hmIterator.next();

            String key = (String)mapElement.getKey();
            int value = (int)mapElement.getValue();

            double per = (value*100.0)/len;
            System.out.println(key+" "+ value+" "+ per);
            if(per>=5.0){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.mostActive(customers);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
