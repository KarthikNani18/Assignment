package Set_1;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=n;
int temp=0;
        while(n!=0) {
             temp=temp*10+n%10;
             n/=10;
        }
        System.out.println(temp==num);
    }   
}
