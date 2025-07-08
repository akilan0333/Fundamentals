import java.util.*;
public class FloydsTriangle{
    public static void main(String []args){
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int b=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b + " ");
               b++;
            }
             System.out.println();
        }
    }
}