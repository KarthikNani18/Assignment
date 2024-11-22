package Set_1;
import java.util.Scanner;

public class GreatestOfThree {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is greates");
        }
        else if(b>c)
        {
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is agreates");
        }
    }
}
