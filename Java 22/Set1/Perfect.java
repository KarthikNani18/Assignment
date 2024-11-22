package Set_1;
import java.util.Scanner;


public class Perfect {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nunber");
         int temp=0;
        int num=sc.nextInt();

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                 temp=temp+i;
            }
        }

      System.out.println(temp);

      if(temp==num)
      {
        System.out.println("it ia perfect nunbtre");
      }
      else{
        System.out.println("it is not a perfect numbre");
      }

    }
    
}
