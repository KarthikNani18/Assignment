import java.util.Scanner;
public class expon {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the A value");
        int a=sc.nextInt();
        System.out.println("enter the b value");
        int b=sc.nextInt();
        int res=1;
    
        for(int i=0;i<b;i++)
        {
             res=res*a;   
        }
        System.out.println(res);
    }

    
}
