import java.util.NoSuchElementException;

public class CircularQueue {
    int front, rear, nums[];

    CircularQueue(int size) {
        this.front = this.rear = -1;
        this.nums = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full ...Can't enqueue more.");
        } else if (isEmpty()) {
            front++;
        }
        rear = (rear + 1) % nums.length;
        nums[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int temp = nums[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % nums.length;
        }
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return nums[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    private boolean isFull() {
        return (rear + 1) % nums.length == front;
    }

    void display() { // For debugging purposes
        System.out.print("Queue(<-- way): ");
        if (front > rear) {
            for (int i = front; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
        for (int i = 0; i <= rear; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30);
        q.enqueue(35);
        q.enqueue(40);
        q.display();
        System.out.println();
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.peek() + " is first in queue");
        q.enqueue(45);
        q.enqueue(50);
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.peek() + " is first in queue");
        q.display();
    }
}