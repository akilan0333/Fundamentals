import java.util.*;
public class Pattern{
    public static void main(String []args){
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=num;j>i;j--){
                System.out.print( " ");
            }
       for(int k=1;k<=i;k++){
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}