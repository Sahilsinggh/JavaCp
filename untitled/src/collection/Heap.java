package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Heap {

    public static void heapifyOne(Integer value, ArrayList<Integer> heap){
        // same as heapify but added because we directly want to add a value
        heap.add(value);
        int ind = heap.size()-1;

        while(ind >0){
            int parentIndex = (ind-1)/2;
            if(heap.get(parentIndex)<heap.get(ind)){
                Collections.swap(heap,ind, parentIndex);
            }
            ind = parentIndex;
        }
    }

    public static void heapify(ArrayList<Integer> list, int index, ArrayList<Integer> heap){
        // Its goes from tree leaf child to root
        // added the index element of list into heap at last position in heap
        heap.add(list.get(index));

        // find the index where we added the index element of list
        int ind = heap.size()-1;

        // till we reach root we compare child node with parent node value
        // and if parent node value is small we swapped
        while(ind >0){
            // parent node index in heap
            int parentIndex = (ind-1)/2;
            // checked condition
            if(heap.get(parentIndex)<heap.get(ind)){
                Collections.swap(heap,ind, parentIndex);
            }

            // updated index to the parent index as well want to check the condition till top
            ind = parentIndex;
        }
    }

    public static ArrayList<Integer> makeHeap(ArrayList<Integer> list){
        // Function takes an argument i.e list and
        // started adding one by one value to heap and make sure heap follows properties of heap
        ArrayList<Integer> heap = new ArrayList<Integer>();
        for(int i = 0; i< list.size();i++){
            // started adding ith index value of list into the heap
            heapify(list,i,heap);
        }
        // lasting returning the heap newly formed
        return heap;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // new list with 10 random elements
        for (int i =0;i<10;i++){
            int rand = (int)(Math.random() * 100) + 1;
            list.add(rand);
            System.out.print(rand+" ");
        }
        System.out.println(" ");

        // Converted the list to heap
        ArrayList<Integer> heap = makeHeap(list);
        System.out.println("heap: "+heap);

        // Inserted an eleement into the heap
        Integer var = 50;
        heapifyOne(var,heap);
        System.out.println("update heap: "+ heap);

        // Find out the maximum element of the heap
        Integer max = heap.getFirst();
        System.out.println("Max value: "+ max);

        // delelted the maximum number from the heap
        deleteMax(heap);
        System.out.println("updated after deleting max: "+ heap);
    }

    private static void deleteMax(ArrayList<Integer> heap) {
        // for deleting max we first swapped the max element with last element in heap
        int deleteIndex = heap.size()-1;
        Collections.swap(heap,0,deleteIndex);
        // removed last element which we just swapped which is maximum of heap
        heap.removeLast();

        // started doing heapify but from root to leaf nodes
        // taken index as 0 as we denote root index as 0
        int index =0;
        // for safer side we selected conditon that our index will remain in heap size
        while(index<heap.size()-1){

            // get its child element index
            int leftChild = 2*index+1;
            int rightChild= 2*index+2;

            // isMax will be 0 when no child is there
            // isMax will be 1 whem leftChild is max Child
            // isMax will be 2 when rightChild is maxChild
            int isMax = 0;

            // checked if leftChild is in range i.e [0, heap.size()]
            if(leftChild < heap.size()) {
                isMax = 1;
            }

            // checked if rightChild is in range i.e [0, heap.size()]
            if(rightChild < heap.size()) {
                // checked if right Child is greater than left child or not
                if(heap.get(leftChild) < heap.get(rightChild)) {
                    // if right child is greater updated isMax to 2 for consistency
                    isMax = 2;
                }
            }

            if(isMax == 0) {
                // if no child found means we reached to leaf node so can stop
                break;
            }
            else if(isMax == 1) {
                // if left Child is max we swapped it with max Child and updated index to leftChild to recursively do it for leftChild
                Collections.swap(heap, index, leftChild);
                index = leftChild;
            }
            else{
                // if right Child is max we swapped it with max Child and updated index to leftChild to recursively do it for rightChild
                Collections.swap(heap, index, rightChild);
                index = rightChild;
            }
        }
    }

}
