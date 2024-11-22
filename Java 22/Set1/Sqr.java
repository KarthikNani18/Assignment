import java.util.Scanner;
public class Sqr {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");

        int a=sc.nextInt();
         int count=0;

        int temp=1;
        while(a!=0)
        {
             temp=a%10;
              count++;
             a=a/10;
        }
        System.out.println(count);
        int n=a*a;

        int temp1=1;
        int count1=0;

        while(n!=0)
        {
             temp1=n%10;
             count1++;

             n=n/10;
           
        }

      
        System.out.println(count);
        System.out.println( show(n,a,count,count1));
       }
    public static boolean show(int n,int a,int count,int count1)
    {  
        
    
        
        if(a==n%10)
        {
            return true;
        }
    

    
    return false;
        
    

    }
}
    

