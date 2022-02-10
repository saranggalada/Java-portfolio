import java.util.*;

public class Bin2Dec {
    
    //Converts a binary number string into a decimal integer
    public static int decimalize(String str){
        int num=0; int i,j,x; char c;
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();int len=sb.length();
        for(i=0;i<len;i++){
            c = sb.charAt(i);
            if(c=='1'){
                x=1;
                for(j=0;j<i;j++){
                   x*=2; 
                }num+=x;
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String s = input.next();        
        System.out.println(s+" is binary for "+decimalize(s));
    }
}
