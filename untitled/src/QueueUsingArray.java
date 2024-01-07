class Queue{

    int front, rear, capacity;
    int queue[];

    Queue(int c){
        front = rear = 0;
        capacity =c;
        queue = new int[capacity];
    }
    public void EnQueue(int data){
        if(capacity<=rear){
            System.out.println("Queue is full");
            return;
        }
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    public void printQueue(){
        for(int i=front;i<rear;i++){
            System.out.println(queue[i]);
        }
    }

    public void Dequeue(){
        if(rear==0){
            System.out.println("empty queue");
            return;
        }
        else {

        }
    }
}

public class QueueUsingArray {

    public static void main(String[] args){
        Queue q = new Queue(4);

        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);

        q.printQueue();
        System.out.println("rear "+ q.rear+", front: "+ q.front);

//        q.DeQueue();
    }
}
