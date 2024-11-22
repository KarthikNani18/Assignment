import java.util.*;
public class equal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numnber");
        int a=sc.nextInt();
        int count=0;

        while(a/10!=0)
        {
           int temp= a%10;
           count++;

        }

        if(count%2==0)
        {
            comp(a,count);
        }
        else{
            System.out.println(false);

        }




    }
    public static boolean comp(int a,int count)
    {

      String str="";
      return true;

         
        
    }
    
}
