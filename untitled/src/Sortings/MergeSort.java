package Sortings;

public class MergeSort {

    private int[] merge(int arr[], int left, int mid, int right){

        int n1 = mid - left +1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr =new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i] = arr[i+left];
        }
        for(int i=0;i<n2;i++){
            rightArr[i] = arr[mid+i+1];
        }

        int i=0,j=0;
        int k =left;
        while(i<n1 &&j<n2){
            if(leftArr[i]> rightArr[j]){
                arr[k] = rightArr[j];
                j++;
            }
            else {
                arr[k] = leftArr[i];
                i++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return arr;
    }
    private int[] mergeSort(int[] arr, int left, int right){


        if(left>=right){
            return arr;
        }
        int mid = left+ (right-left)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        arr = merge(arr,left,mid,right);

        return arr;

    }
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();

        int[] arr= new int[]{14,24,53,12,11,45};
        arr =obj.mergeSort(arr,0, arr.length-1);

        for(int n: arr){
            System.out.println(n +" ");
        }
    }
}
