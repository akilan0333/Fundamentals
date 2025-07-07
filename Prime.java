public class Prime{
    public static void main(String []args){
        int a=10;
        int b=99;
        for(int i=a;i<=b;i++){
            int flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(i + " ");
            }
            
        } 
    }
}