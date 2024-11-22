import java.util.Scanner;
public class count_sen {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the Sentence to count:");

    String str=sc.nextLine();


    String[] str1=str.split(" ");

    System.out.println(str1.length);


    }
    
}
