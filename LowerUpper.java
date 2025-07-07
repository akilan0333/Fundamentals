import java.util.*;
public class LowerUpper{
    public static void main (String []args){
        Scanner obj=new Scanner(System.in);
       char ch=obj.next().charAt(0);
       if(ch>='a' && ch<='z'){
           System.out.println((char)(ch-32));
       }
       else if(ch>='A' && ch<='Z'){
           System.out.println((char)(ch+32));
       }
      
    }
}