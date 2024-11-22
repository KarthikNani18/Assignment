package Set_1;
import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int temp=0;
        while(num!=0)
        {
            temp=temp+num%10;
            num/=10;
        }
        System.out.println(temp);
    }
    
}
