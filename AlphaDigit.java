import java.util.*;
public class AlphaDigit{
    public static void main (String []args){
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().charAt(0);
        if((ch>='A' && ch<=Z)||(ch>=a && ch<=z)){
            System.out.println("Alphabet");
        }
        else if(ch>='0'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}