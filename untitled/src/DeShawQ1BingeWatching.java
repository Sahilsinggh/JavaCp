import java.util.Arrays;

public class DeShawQ1BingeWatching {
    public static void main(String[] args) {
        int[] input ={1,2,3,4};
        DeShawQ1BingeWatching obj = new DeShawQ1BingeWatching();
        obj.bingeWatch(input);
    }
    public void bingeWatch(int[] input){
        int len = input.length;

//        int[] temp = Arrays.copyOf(input,3);
        int[] temp =  input.clone();
        Arrays.sort(temp);

        int first = temp[len/2-1];
        int second = temp[len/2];
        int temp1 = 0,temp2 =0;

        for(int i=0;i<len; i++){
            if(input[i]==first){
                temp1 = i+1;
            }
            if(input[i]==second){
                temp2 = i+1;
            }
        }
        int a = temp2;
        int b= temp1;
        if(temp1<temp2){
            a=temp1;
            b = temp2;
        }

        System.out.println(a+" <-a "+b+"<-b");



    }
}
