import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length (<92) of Fibonacci series required: ");
        int n = input.nextInt(); //stores length of fib from user
        long a = 1; long f = 0; //Initialization...
        System.out.println("Fibonacci Series:");
        
        for(int i=0;i<n;i++) { //Generates fibonacci sequence
            System.out.println(f);
            a += f; f = a-f;
        }
    }
}
