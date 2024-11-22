package Set_1;import java.util.*;

public class SumOfRange {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Range(a,b));      
    }
    public static int  Range(int a,int b)
    { int temp=0;
        for(int i=a;i<=b;i++)
        {
            temp=temp+i; 
        }
        return temp;
    }
    
}
