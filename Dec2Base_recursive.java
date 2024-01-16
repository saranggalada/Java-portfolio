import java.util.Scanner;

public class Dec2Base_recursive {
    static String s="";
    
    //Recursive fn to convert decimal number to another base
    public static void DecToBase(int n, int b){
        if(n<b){s+=Integer.toString(n);}
        else{ DecToBase(n/b, b); s+=Integer.toString(n%b);}        
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter number: "); int num = input.nextInt();
        System.out.print("Enter base: "); int base = input.nextInt();
        DecToBase(num,base);
        System.out.println(Integer.parseInt(s));
    }
}
