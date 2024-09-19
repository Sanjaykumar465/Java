 import java.util.*;
public class Cost 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float erasser = sc.nextFloat();
    float total = pencil + pen + erasser;
    System.out.println("The total cost is :" + total);
    float gst = total + (0.18f * total);
    System.out.println("after 18% of gst added the total cost :" + gst);
 }   
}


