import java.util.Scanner;
public class sum {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thge number");
        int a=sc.nextInt();
      
        
       int n=pow(a);

       if(n!=0)
       {
        System.out.print( pow(n));
       
       }

        
          


    }
    public static int pow(int a)
    { int temp=0;
        while(a!=0)
        {
            temp=temp+a%10;
            a=a/10;
          }
          return temp;

    }
    
}
