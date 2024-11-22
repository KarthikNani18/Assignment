package Set_1;

import java.util.Scanner;

public class vowelConso {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
        {
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("its a consonent");
        }



    }
    
}
