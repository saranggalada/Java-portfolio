import java.util.Scanner;

public class PalindromeCheck_Stack {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Stack st = new Stack(s.length());
        int i = 0;
        String r = "";
        while (!st.isFull()) {
            st.push(Character.toString(s.charAt(i)));
            i++;
        }
        i = 0;
        while (!st.isEmpty()) {
            r += st.pop();
            i++;
        }
        if (s.equalsIgnoreCase(r)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}

class Stack {
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
    }
}