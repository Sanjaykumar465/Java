public class Hollow_square8 
{
    //Hollow_Square
  public static void Hollow_squ(int rows,int cols)
  {
    for(int i = 1;i<=rows; i++)
    {
        for(int j = 1; j<=cols; j++)
        {
            if(i==1 || i==rows || j==1 || j==cols)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
             System.out.println();
        } 
        
    }
}

        //INVERTED HALF PYRAMID
        public static void Inverted_Rotated_Half_Pyramid(int n)
        {
           for(int i=1; i<=n;i++)
           {
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
           }
        }
        //inverted_Number
        public static void Inverted_Num(int n)
        {
            for(int i = 1; i<=n;i++)
            {
               for(int j = 1; j<=n-i+1;j++)
               {
                System.out.print(j);
               }
               System.out.println();
            }
         }
         //Floyts_Pattern
         public static void Floyts_Pattern(int n)
         {
         int count = 1;
         for(int i = 1; i<=n; i++)
         {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(count +"");
                count++;
            }
            System.out.println();
      }
    }
       //Zero-One Triangle
    public static void Zero_one_Triangle(int n) {
        for(int i =1; i<=n; i++)  {
            for(int j=1; j<=i; j++)  {
                if((i+j) % 2 == 0)  {
                    System.out.print("1");
                }else {
                     System.out.print("0");
                  }
            }
            System.out.println();
            
        }
        
    }
    // BUTTERFLY PATTERN
    public static void Butterfly(int n)  {
        //outer loop
       for(int i=1; i<=n; i++)  {
          //star

          for(int j =1;j<=i; j++)  {
            System.out.print("*");
          }
            //space

            for(int j = 1; j<=2*(n-i);j++)  {
                System.out.print(" ");
            }
               //star

               for(int j = 1; j<=i; j++)  {
                   System.out.print("*");
               }
               System.out.println();
         }

         //2nd half

         for(int i = n; i>=1;i--)  {
            //star
            for(int j = 1; j<=i; j++)  {
                
                System.out.print("*");
            }
            //space

            for(int j = 1; j<=2*(n-i); j++)  {
                System.out.print(" ");
            }
             //star

             for(int j = 1; j<=i; j++)  {
                System.out.print("*");
             }
             System.out.println();
         }
             
    }

    // SOLID RHOMBUS

    public static void SolidRhombus(int n)  {
        //outer loop
        for(int i=1;i<=n;i++)  {

            //for space

            for(int j = 1; j<=(n-i);j++)  {

                System.out.print(" ");
            }

            //for star

            for(int j = 1; j<=n; j++)  {
                System.out.print("*");
            }

             System.out.println();
        }

    }

    // HOLLOW RHOMBUS

    public static void Hollow_Rhombus(int n)  {
        for(int i = 1; i<=n; i++)  {
             //for blank

             for(int j = 1; j<=(n-i); j++)  {
                System.out.print(" ");
             }

             //for star

             for(int j =1; j<=n; j++)  {
                if(i==1 || i==n || j==1 || j==n )  {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }

    // DIAMOND Shape

    public static void Diamond(int n)  {
        //First half

        for(int i = 1; i<=n; i++)  {
            
            //for spaces

            for(int j = 1; j<=n-i; j++)  {

                System.out.print(" ");
            }
            // for star
              for(int j = 1; j<=(2*i)-1; j++)  {

                System.out.print("*");
              }
              System.out.println();
        }

        //Second half

        for(int i = n; i>=1; i--)  {
             //for spaces

             for(int j = 1; j<=n-i; j++)  {

                System.out.print(" ");
             }

             //for stars

             for(int j = 1; j<=(2*i)-1;j++)  {

                System.out.print("*");
             }
             System.out.println();
        }

        
    }

     public static void main(String[] args) 
        {
        // Hollow_squ(10,5);
        // Inverted_Rotated_Half_Pyramid(4);
        // Inverted_Num(5);
        // Floyts_Pattern(5);
        // Zero_one_Triangle(5);
        // Butterfly(4);
        // SolidRhombus(7);
        // Hollow_Rhombus(5);
        Diamond(4);


  } 
}
