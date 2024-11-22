package Set_1;
import java.util.*;

public class alphabetFind {
    
    public static void main(String[] args) {
       

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number or alphabet");

        char c=sc.next().charAt(0);

        if(Character.isLetter(c))
        {
            System.out.println("it is a aplhabet");
        }
        else{
            System.out.println("it is not a aplhabet");
        }


        
    }
}
