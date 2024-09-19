import java.util.*;
public class Rohan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        do{
            System.out.print("Enter a number:");
            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);

        } 
        while(true);
    }    
}
