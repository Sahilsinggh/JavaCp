package Sortings;

public class InsertionSort {
    private int[] sort(int[] arr){
        int len = arr.length;

        for(int i=1;i<len;i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
        arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int arr[] ={12, 11, 13, 5, 6 };

        arr =obj.sort(arr);

        for(int n : arr){
            System.out.print(n + " ");
        }

    }
}
