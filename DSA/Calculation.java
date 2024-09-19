import java.util.*;
public class Calculation 
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
     int z = sc.nextInt();
     float avg = (x + y + z) / 3;
     System.out.println("average is: "+ avg);   
    }
    
}
