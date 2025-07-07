import java.util.*;
public class Ascending{
    public static void main (String []args){
        Scanner obj=new Scanner(System.in);
        int name=obj.nextInt();
        int name1=obj.nextInt();
        int temp=0;
        if(97<=name && name<=126 && 97<=name1 && name1<=126){
            if(name>name1){
                temp=name;
                name=name1;
                name1=temp;
            }
             System.out.println((char) name + " " +(char) name1);
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}