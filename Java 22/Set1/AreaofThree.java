package Set_1;
import java.util.*;


public class AreaofThree {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        System.out.println("please select the operation to perform");
    
        System.out.println("1. Area of Circle");
        System.out.println("2 Area of Rectangle");
         System.out.println("3. Area of triangle");


         int n=sc.nextInt();

         switch(n)
         {
            case 1 : 
            System.out.println("enter the radius");
            int r=sc.nextInt();
            AreaOfCricle(r);
            break;
            case 2 :
            System.out.println("enter the length");
            int len=sc.nextInt();
            System.out.println("enter the breath ");
            int b=sc.nextInt();
            AreaOfRectangle(len,b);
            break;
            case 3:
            System.out.println("enter the base");
            int l=sc.nextInt();
            System.out.println("enter the height ");
            int be=sc.nextInt();
            AreaOfTraiangle(l,be);
            
         }

    
        
    }

   
public static void AreaOfCricle(int r)
{
    System.out.println(3.14*r*r);
}
public static void AreaOfRectangle(int l,int b)
{
    System.out.println(l*b);
}
public static void AreaOfTraiangle(int l,int b)
{
    System.out.println(0.5*l*b);
}
    
   


    
}
