public class fun {

    public static void main(String[] args) {
        
        int n=5;
        for(int i=0;i<n;i++)
        {
            int count=n;
            for(int j=0;j<n;j++)
            {  
               
                if(i<=j)
                {
                    System.out.print(count);
                    count--;
                }
                System.out.print("");
                
            }
            System.out.println();
        }
    }
    
}
