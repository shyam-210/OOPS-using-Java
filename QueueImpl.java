import java.util.Scanner;

interface Queue1 {
    void dequeue();

    boolean isQueueEmpty();

    boolean isQueueFull();

    void enqueue(int item);
}

class QueueIsFull extends Exception {
    QueueIsFull(String s) {
        super(s);
    }
}

class QueueIsEmpty extends Exception {
    QueueIsEmpty(String s) {
        super(s);
    }
}

public class QueueImpl implements Queue1 {
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;

    public QueueImpl(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (rear > capacity - 2) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (rear < 0 || front > rear) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        try {
            if (isQueueFull()) {
                throw new QueueIsFull("Overflow ! Unable to add element: " + item);
            } else {
                rear++;
                queueArr[rear] = item;
                System.out.println("Element " + item + " is pushed to Queue !");
            }
        } catch (QueueIsFull e) {
            System.out.println(e.getMessage());
        }
    }

    public void dequeue() {
        try {
            if (isQueueEmpty()) {
                throw new QueueIsEmpty("Underflow ! Unable to remove element from Queue");
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[front++]);
            }
        }

        catch (QueueIsEmpty e) {
            System.out.println(e);
        }
    }

    void display() {
        if (!isQueueEmpty()) {
            for (int i = front; rear < capacity && i <= rear; i++)
                System.out.println(queueArr[i]);
        } else {
            System.out.println("Queue is Empty or Front pointer cross the Rear Pointer");
        }
    }

    public static void main(String a[]) {
        System.out.println("Enter the Queue capacity");
        Scanner obj = new Scanner(System.in);
        QueueImpl queue = new QueueImpl(obj.nextInt());
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to be enqueued:");
                    queue.enqueue(obj.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Queue Elements are...");
                    queue.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter the valid choice try it once again:");
            }
            if (choice == 4)
                break;
        }
    }
}
