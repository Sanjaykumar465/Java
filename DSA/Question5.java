import java.util.*;
public class Question5 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  int number;
    //  int choice;
    //  int evensum =0;
    //  int oddsum =0;
    //   do
    //   {
    //     System.out.println("Enter any number");
    //     number =sc.nextInt();
    //     if(number % 2 == 0)
    //     {
    //          evensum = number+evensum;
    //     }
    //     else{
    //         oddsum = number + oddsum;
    //     }
    //     System.out.print("do you want to continue: press 1 for yes or 0");
    //     choice = sc.nextInt();
    //   }
    //   while(choice == 1);
    //   System.out.println("sum of even number:" +  evensum);
    //   System.out.println("sum of odd number: " + oddsum);


    // factorial of any number
    // int number;
    // int fact = 1;
    // System.out.print("Enter any positive number to find factorial");
    // number = sc.nextInt();
    //    for(int i =1; i <= number; i++)
    //    {
    //     fact = i*fact;
    //    }
    //    System.out.println("The factorial is:" + fact);

    System.out.print("Enter a number");
    int n  = sc.nextInt();

    for(int i = 1;i<=10;i++)
    {
        System.out.println( + n + "*" + i + "=" + n*i );
        
    }

  }  
}
