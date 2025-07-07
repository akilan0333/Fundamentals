import java.util.*;
public class CheckAscen{
    public static void main (String []args){
        Scanner obj=new Scanner(System.in);
        char name=obj.next().charAt(0);
        char name1=obj.next().charAt(0);
        char temp;
            if(name>name1){
                temp=name;
                name=name1;
                name1=temp;
            }
             System.out.println((char) name + " " +(char) name1);
        
    }
}