package Set_1;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
          int mul=1;
        for(int i=1;i<=b;i++)
        {
             mul=mul*a;
        }
        System.out.println(mul);
    }
    
}
