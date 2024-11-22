package Set_1;
import java.util.Scanner;

public class StrongNum {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int num1=num; 
        int sum=0;

        while(num!=0)
        {
          int  temp=num%10;
          
          sum=sum+fact(temp);
           num/=10;

        }
        if(num1==sum)
            System.out.println("it is a strong number");
        else
            System.out.println("it is not a strong number");
 }
       public static int  fact(int temp)
       {

           if(temp==0|| temp==1)
           return 1;
        return temp*fact(temp-1);


        
    }
    
}
