import java.util.concurrent.atomic.AtomicInteger;

public class Temp {

    public static void helper(int[] a, int [] b) {
        a[0] += 10;
        b[0] += 100;
        //  a aar b subsequence

        System.out.println("Helper " + a[0]);
    }

    public static int temp(int [] a, int [] b) {
        if(a[0] > b[0]) {
            return a[0];
        }
        return b[0];
    }

    public static void main(String []args) {
        int []a = {5};
        int []b = {7};
        helper(a, b);

//        temp(a, b);
        int t = temp(a,b);
        System.out.println(t);

        System.out.println(a[0] + " " + b[0]);
    }
}
