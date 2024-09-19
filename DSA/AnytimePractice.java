public class AnytimePractice {
    public static void Maxsum(int numbers[])  {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i<prefix.length;i++)  {
            prefix[i] = prefix[i-1] + numbers[i];
                }
        for(int i = 0; i < numbers.length; i++)  {
             int start = i;
             for(int j = i; j < numbers.length; j++)  {
                int end = j;
                currsum = 0;
                
                     currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                     if(maxsum < currsum) {
                        maxsum = currsum;
                       }
                }
            }
            System.out.println("maximum sum is :" + maxsum);   

        } 
public static void kadanes(int numbers[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i<numbers.length; i++)  {
        cs = cs + numbers[i];

        if(cs<0) {
            cs = 0; 
        }
        ms = Math.max(cs,ms);
    }
    System.out.println("The maximum sum is :" + ms);
}

//RAIN WATER TRAPPED

public static int RainwaterTrapped(int height[])  {
    int leftmax[] = new int[height.length];
    leftmax[0] = height[0];
    for(int i = 1; i<height.length; i++)  {
        leftmax[i] = Math.max(height[i],leftmax[i-1]);
    } 
    int rightmax[] = new int[height.length];
    rightmax[height.length-1] = height[height.length-1];
    for(int i = (height.length - 2); i>=0;i--)  {
              rightmax[i] = Math.max(height[i] ,rightmax[i+1]);
    }
    int trappedwater = 0;
    for(int i = 0; i<height.length;i++)  {
        int waterlevel =Math.min(leftmax[i] , rightmax[i]);
        trappedwater += waterlevel - height[i];
    }
    return trappedwater;
}

     
        

    public static void main(String[] args) {
        int height[] = {4 , 2 , 0 , 6 , 3 , 2 , 5};
        System.out.println(" The amount of water trapped :" + RainwaterTrapped(height));
       

    }

} 