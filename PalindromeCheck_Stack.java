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