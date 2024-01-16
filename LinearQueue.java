import java.util.NoSuchElementException;

public class LinearQueue {
    int front, rear, nums[];

    LinearQueue(int size) {
        this.front = this.rear = -1;
        this.nums = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full ...Can't enqueue more.");
        }
        if (isEmpty()) {
            front++;
        }
        nums[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty ...Nothing to dequeue.");
        }
        int temp = nums[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return temp;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    private boolean isFull() {
        return rear == nums.length - 1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty ...Nothing to peek into.");
        }
        return nums[front];
    }

    void display() { // For debugging purposes
        System.out.print("Queue(<-- way): ");
        // System.out.println(Arrays.toString(nums));
        for (int i = front; i <= rear; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(10);
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
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.dequeue() + " left the queue");
        System.out.println(q.peek() + " is first in queue");
        q.display();
    }
}