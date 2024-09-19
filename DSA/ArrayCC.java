import java.util.*;

public class ArrayCC {
    public static void update(int marks[] ,int Nonchangeable) {
        Nonchangeable = 5;
        for(int i = 0; i<marks.length;i++) {
            marks[i] = marks[i] +1;

        }
    }
    public static void main(String[] args) {
        // int marks[] = new int[50];
        // System.out.println("length of array :" + marks.length);

        // Scanner sc  = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();        
        // marks[2] = sc.nextInt();

        // System.out.println("phy :" + marks[0]);
        // System.out.println("math :" + marks[1]);
        // System.out.println("chem :" + marks[2]);

        // int percentage = (marks[0]+ marks[1] + marks[2])/3;
        // System.out.println("percentage = :"  + percentage);

         int marks[] = {99,95,88};
         int Nonchangeable = 10;
         update(marks ,Nonchangeable);
         System.out.println(Nonchangeable);
         
         for(int i = 0; i<marks.length; i++)  {
            System.out.print(marks[i] + " ");
         }
         System.out.println();

    }
    
}
