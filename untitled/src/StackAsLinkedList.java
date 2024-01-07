import java.util.Stack;

public class StackAsLinkedList {
    StackNode head;
    static class StackNode{
        int data;
        StackNode next;
       // StackNode curr = new StackNode(data);
        StackNode(int data){
            this.data = data;

        }
    }
    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(head==null){
            head = newNode;
        }
        else {
            StackNode temp = head;
            head = newNode;
            newNode.next =temp;
        }
    }

    public void print(){
        StackNode temp = head;
        if(head==null){
            System.out.println("empty Stack");
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int pop(){
        if(head==null){
            System.out.println("empty stack");
            return 0;
        }
        else {
            StackNode temp = head;

            head = temp.next;
            return temp.data;

        }
    }

    public static void main(String[] args) {
        StackAsLinkedList sl = new StackAsLinkedList();
        sl.push(1);
        sl.push(2);
        sl.push(3);

        sl.print();

       int pop= sl.pop();
        System.out.println("popped data:"+pop);

        System.out.println("print sl: ");
        sl.print();

    }
}
