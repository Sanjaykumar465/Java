import java.util.*;
public class Test7
 {
    public static int calsum(int num1,int num2)
    {
       int sum = num1 + num2;
       return sum;
    }
    
        public static int calmul(int a,int b)
        {
       int product = a*b;
        return product;
    }

    // Factorial calculation

    public static int factorial( int n)
    {
        int f = 1;
        for(int i = 1; i<=n; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int binfact(int n, int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int result = fact_n/(fact_r*fact_nmr);
        return result;
    }
    //additoon of 2 number
    public static int sum(int x, int y)
    {
        return x+y;
    }

   public static int sum(int x, int y,int z)
   {
    return x+y+z;
   }
   public static boolean isprime(int n)
   {
    for(int i = 2; i<=n-1; i++)
    {
        if(n % i == 0)
        {
            return false;
        }
        
    }
    return true;
   }
   public static void primeinrange(int n)
   {
    for(int i = 2; i<=n; i++)
    {
        if(isprime(i))
        {
            System.out.println(i +" ");
        }
    }
    System.out.println();
   }
   public static void binTodec(int binNum)
   {
    int myNum = binNum;
    int power = 0;
      int decNum = 0;
      

    while(binNum >0)
    {
      int lastdigit = binNum % 10;
      decNum = decNum + (lastdigit * (int)Math.pow(2, power));
      power++;
      binNum = binNum/10;

    }
    System.out.println("decimal of  " + myNum + " " + decNum);
   }

    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calsum(a,b);
        // System.out.println(sum);

        // int a = 5;
        // int b = 9;
        // int prod = calmul(a,b);
        // System.out.println("a*b=" + prod);

        // System.out.println(binfact(5,3));
        // System.out.println(sum(5,3));
        // System.out.println(sum(5,2,1));

        // System.out.println(isprime(12));
        // primeinrange(20);
        binTodec(101);
    }

}
