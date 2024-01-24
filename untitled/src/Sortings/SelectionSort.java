package Sortings;

public class SelectionSort {
    private int[] sort(int[] arr){
        int len = arr.length;

        for(int i=0;i<len;i++){
            int min_index = i;

            for(int j = i+1;j<len;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
         int temp = arr[min_index];
         arr[min_index] = arr[i];
         arr[i] = temp;
        }
        return arr;
    }
    private void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{52,14,43,22,26,11};
        SelectionSort obj = new SelectionSort();
        int[]arr2=obj.sort(arr);
        System.out.println("array after sorting:");
        obj.printArr(arr2);

    }
}
