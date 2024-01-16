import java.util.Scanner;

public class Factorial_recursive {
    
   //Recursive fn to calculate factorial
    public static long fact(long n){
        if(n==0){ return 1;}
        else{ return n*fact(n-1);}
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = input.nextLong();
        System.out.println(fact(num));
        System.out.print(fact(num));
    }
}
