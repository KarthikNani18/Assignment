package Set_1;
import java.util.*;

public class ArmStrongNum {

    public static void main(String[] args) {
        
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the num");
int num=sc.nextInt();
int num1=num;
int count=0;
int res=num;

while(num!=0)
{  
   int temp=num%10;
    count++;
    num/=10;
}
int temp=0;

while(res!=0)
{
   temp=temp+sum(res%10,count);
  res/=10;  
}
if(temp==num1)
System.out.println(temp+","+num1);
else
System.out.println(0);
 }
    public static int sum(int temp,int count)
    {

        if(count==0)
        return 1;

        return temp*sum(temp,count-1);   
        
    }
    
}
