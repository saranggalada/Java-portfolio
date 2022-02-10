import java.util.*;

public class Power_recursive {
    
    //Recursive fn to compute a power(y) of a number(x)
    public static long power(long x, long y){
        if(y==0){ return 1;}
        else{ return x*power(x,y-1);}
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         
        System.out.print("Enter number: "); int num = input.nextInt();
        System.out.print("Enter power: "); int pow = input.nextInt();
        long ans = power(num,pow);
        System.out.println(num+" to the power "+pow+" equals: "+ans);
    }
}
