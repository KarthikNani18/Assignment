package Set_1;
import java.util.*;

public class PosOrNeg {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        if(n==0)
           System.out.println("it is a zero");
        else if(n>0)
            System.out.println("it is a positive number");
        else
            System.out.println("it is a negative number");
        

    }
    
}
