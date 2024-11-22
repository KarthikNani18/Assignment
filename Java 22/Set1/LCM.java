package Set_1;
import java.util.*;
class LCM
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
System.out.println("enter the A nad b");
    int a=sc.nextInt();
    int b=sc.nextInt();
    

    int ans =(a>b)?a:b;  

    while(true){

        if(ans%a==0&& ans%b==0)
        {
            break;
        }
        ans++;
    }
System.out.print(ans);
    }


   

}

