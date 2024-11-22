package Set_1;
import java.util.*;

public class NumOfDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer to count ");
        int n=sc.nextInt();
           int count=0;
        while(n!=0)
        {
            int temp=n%10;
            count++;
            n=n/10;
        }

        System.out.println(count);

    }
    
}
