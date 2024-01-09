class Queue {

    int front, rear, capacity;
    int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void enQueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public void deQueue() {
        if (rear == 0) {
            System.out.println("empty queue");
            return;
        } else {
            for(int i=0; i<rear-1; i++) {
                queue[i] = queue[i+1];
            }

            if(rear < capacity) {
                queue[rear] =0;
            }
            rear--;

        }
    }
}

public class QueueUsingArray {

    public static void main(String[] args) {
        Queue q = new Queue(4);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        q.printQueue();
        System.out.println("rear " + q.rear + ", front: " + q.front);

        q.deQueue();
        System.out.println(" Queue after deleting element: ");
        q.printQueue();
        System.out.println("rear " + q.rear + ", front: " + q.front);
        q.enQueue(1);
        q.printQueue();


    }
}
