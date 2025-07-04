import java.util.*;
public class Check{
    public static void main (String []args){
        Scanner id=new Scanner(System.in);
        int num=id.nextInt();
        if(num>=1){
            System.out.println("Positive Number");
        }
        else if(num<0){
            System.out.println("Negative Number");
        }
        else if (num==0){
            System.out.println("Zero");
        }
    }
}