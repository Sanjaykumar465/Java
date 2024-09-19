public class Question7 
{
    public static int avg(int a,int b,int c)
    {
        int average = (a+b+c)/3;
        return average;  
     }
     //Even number test
     public static boolean isEven(int n){

     
       if(n % 2 == 0)
       {
        return true;
       }
       return false;
    }
     public static void main(String[] args) {
        // System.out.println("average is" + avg(50,100,150));
        System.out.println(isEven(6));
     }
}
