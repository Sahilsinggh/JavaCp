package Sortings;

public class BubbleSort {
    private int[] sort(int[] arr){
        int len = arr.length;

        //int temp_max = arr[0];
        for(int i=0;i<len;i++){
            for(int j =0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    private void print(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        BubbleSort obj = new BubbleSort();
        int[] arr = new int[]{15,43,21,75,11};

        arr =obj.sort(arr);
        System.out.println("bubble sorted array:");
        obj.print(arr);
    }
}
