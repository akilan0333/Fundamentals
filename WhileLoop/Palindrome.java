import java.util.*;
public class Palindrome{
    public static void main(String []args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int original=b;
        int temp=0;
        while(b>0){
            int t=b%10;
            temp=temp*10+t;
            b/=10;
            
        }
        if(original==temp){
             System.out.print("Palindrome");
        }
        else{
             System.out.print("Not a Palindrome");
        }
    }
}