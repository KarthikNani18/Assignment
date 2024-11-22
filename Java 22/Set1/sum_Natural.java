package Set_1;
import java.util.Scanner;


public class sum_Natural {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
       int  res=n<0?0:Natural(n);
       System.out.println(res);
    }
    public static int Natural(int n)
    { if(n>0)
        {
        return n+Natural(n-1);
        }
        return 0;
    }
    
}
