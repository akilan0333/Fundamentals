import java.util.*;
public class Age{
    public static void main (String []args){
        Scanner obj=new Scanner(System.in);
        String ch=obj.nextLine();
        int age=obj.nextInt();
        if(ch.equalsIgnoreCase("female")){
              if(age>=1 && age<=58){
                System.out.println("The Percentage of interest is :" + "8.2%");
            }
            else if (age>=59 && age<=100){
                 System.out.println("The Percentage of interest is :" + "9.2%");
            }
        }
        
        else if (ch.equalsIgnoreCase("Male")){
            
                  if (age>=1 && age<=58){
                     System.out.println("The Percentage of interest is :" + "8.4%");
                }
                else if (age>=59 && age<=100){
                    System.out.println("The Percentage of interest is :" + "10.5%");
                }
            
        }
      
    }
}