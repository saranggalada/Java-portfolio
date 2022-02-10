import java.util.*;

public class Dec2Base {
    
    //Converts decimal number into user inputed base
    public static int change_base(int n,int b){
        StringBuffer sb = new StringBuffer();
        char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0){
            sb.append(a[n%b]); n/=b; }
        sb.reverse();
        return (Integer.parseInt(sb.toString()));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt(); int count = 0;
        System.out.print("Enter desired base: ");
        int b = input.nextInt();
        int num = change_base(n,b);
        System.out.println("Base "+b+" equivalent of "+n+" = "+num);
    }
}
