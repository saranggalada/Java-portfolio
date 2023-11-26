import java.util.Scanner;

public class Stack {
    int top, capacity;
    String[] stack;

    Stack() {
        top = -1;
        capacity = 10;
        stack = new String[capacity];
    }

    Stack(int c) {
        top = -1;
        capacity = c;
        stack = new String[capacity];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String push(String data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        }
        return stack[++top] = data;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack st = new Stack(25);
        String in;
        for (int x = 0; x < 4; x++) {
            System.out.print("Enter some object names to push into the stack: ");
            in = input.next();
            st.push(in);
        }
        System.out.println("Your stack looks like...");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(st.pop());
        }
    }
}