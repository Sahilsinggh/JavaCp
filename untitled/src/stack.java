//Stack implementation using Array
class stackDefination{

        int max = 1000;
        Integer[] arr = new Integer[max];
        int top=-1;
    public int push(int i){
        if(top>=max){
            System.out.println("stack overflow");
            return 0;
        }
        else{
            arr[++top] =i;
            return 1;
        }
    }
    public void print(){
        for(int i=top;i>-1;i--){
            System.out.println(arr[i]);
        }
    }
    protected void pop(){
        if(top<0){
            System.out.println("empty stack");
        }
        else{
            top--;
        }
    }

    protected int peek(){
        if(top<0){
            System.out.println("empty stack");
            return 0;
        }
        return arr[top];
    }

    protected boolean isEmpty(){
        if(top>-1){
            return false;
        }
        return true;
    }

}
class stack{

        public static void main(String[] args){
        stackDefination s = new stackDefination();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.print();

        s.pop();
            System.out.println("poped: ");
        s.print();
            System.out.println("peek value: "+ s.peek());

            System.out.println("stack is empty or not: "+ s.isEmpty());
        }

}
