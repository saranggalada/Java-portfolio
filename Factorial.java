import java.util.Scanner;

public class Factorial {
    
    //Calculates the factorial of a number (n)
    public static long fact(long n){
        long f = 1;
        while(n>0){
            f*=n; n--;
        }
        return f;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = input.nextLong();
        System.out.println(fact(num));
    }
}
