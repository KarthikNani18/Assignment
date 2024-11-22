package Set_1;
import java.util.*;
class Fibono
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
    System.out.print(n1+","+n2);

      Fibinose(n1,n2,n-2);}

    public static int  Fibinose(int n1,int n2,int n)
    {   
        if(n>0)
        {
        int n3=n1+n2;
        System.out.print(","+n3);
        n1=n2;
        n2=n3;
        n--;
        return Fibinose(n1,n2,n);
        
        }
        

        return 0;



    }
}