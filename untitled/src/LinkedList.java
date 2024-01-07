import java.util.List;

public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


        public static LinkedList insert(LinkedList list, int data) {

            Node new_node = new Node(data);

            if(list.head==null) {
                list.head = new_node;
            }
            else {
                Node last = list.head;
                while(last.next!=null){
                    last=last.next;
                }
                last.next=new_node;
            }
            return list;
        }

        public static void printList(LinkedList list){
            Node temp = list.head;
            if(list.head == null){
                System.out.println("empty");
            }
           while (temp!=null){
               System.out.println(temp.data+" ");
               temp = temp.next;
            }
        }

        public static LinkedList deleteByKey(LinkedList list, int key) {
            Node curr = list.head;
            Node prev = null;

            if(curr !=null && curr.data==key){
                list.head=curr.next;
                System.out.println("Its a head node!- deleted head:");
                return list;
            }
            while(curr!=null && curr.data!=key){
                prev = curr;
                curr = curr.next;
            }
            if(curr!=null){
                prev.next= curr.next;
                curr.next = null;
                System.out.println("found and deleted");
            }

            if(curr==null){
                System.out.println("not found or empty list");
            }


            return list;
        }
        public static LinkedList reverseList(LinkedList list){

            Node curr = list.head;
            Node temp = curr.next;
            Node Mnext = temp.next;


            while(temp.next!=null){
                temp.next =curr;
                curr=temp;
                temp = Mnext;
                Mnext = Mnext.next;
//                prev = curr;
//                curr = curr.next;
            }

            if(temp.next==null){
                temp.next=curr;
                Node temp2 = list.head;
                temp2.next = null;
                list.head = temp;
            }
        return list;
        }

        public static LinkedList DeleteKthlast(LinkedList list, int k){
            Node temp = list.head;
            Node curr = list.head;



            for(int i=0;i<k;i++){
                temp = temp.next;
            }
            if(temp==null){
                list.head= curr.next;
                return list;
            }
            while(temp.next!=null){
                temp = temp.next;
                curr = curr.next;
            }
            if(temp.next==null) {
                curr.next = curr.next.next;
//                curr.next =temp;
            }
            return list;
        }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
       // printList(list);

//        deleteByKey(list,4);

//         LinkedList list1= reverseList(list);
//
//        printList(list1);
        printList(list);

        System.out.println("head: "+list.head);

        DeleteKthlast(list,7);
        printList(list);


    }

    }



