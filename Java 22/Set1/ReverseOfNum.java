package Set_1;
import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    String str="";

    while(num!=0)
    {
        str=str+num%10;
        num/=10;
    }
    System.out.println(str);
    } 
}
