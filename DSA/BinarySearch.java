public class BinarySearch {
    //LINEAR SEARCH
    // public static int LinearSearch(int numbers[], int value)  {
    //     for(int i = 0; i<numbers.length; i++)  {
    //         if(numbers[i] == value)  {
    //            return i;
    //         }
           
    //     }
    //     return -1;
    // }

    //BINARY SEARCH
    // public static int BinarySearch_s(int numbers[], int value)  {
    //    int start=0, end = numbers.length-1;
    //    while(start<=end)  {
    //     int mid = (start + end) / 2;
    //     //comprarision
    //     if(numbers[mid] == value) {
    //      return mid;
    //     }
    //     if(numbers[mid] < value)  { //right
    //          start = mid+1;
    //     } else {
    //         end = mid - 1;
        
    //     }

    //    }
    //    return -1;
    // }

    //REVERSE AN ARRAY

    // public static void ReverseNum(int numbers[])  {
    //     int first = 0, last = numbers.length-1;
    //     while(first<last)  {
    //         //swap
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;
    //         first ++;
    //         last --;
    //     }
    // }

    //PAIRS IN ARRAY

    // public static void printPairs(int numbers[]) {
    //     int tot = 0;
    //     for(int i = 0; i<numbers.length;i++)  {
    //         int curr = numbers[i];
    //         for(int j = i+1;j<numbers.length;j++)  {
    //             System.out.print("(" + curr + "," + numbers[j] + ") ");
    //             tot++;
               
    //         }
    //         System.out.println();
            
            
    //     }
    //     System.out.println("total no. of arrays :" + tot);
        
    // }

    //PRINT OF SUB-ARRAYS

    // public static void printSubarray(int numbers[])  {
    //     int tot = 0;
    //     for(int i = 0;i<numbers.length; i++)  {
    //         int start = i;
    //         for(int j = i;j<numbers.length;j++)  {
    //             int end = j;
    //             for(int k = start;k<=end;k++)  {
    //                 System.out.print(numbers[k]+" ");
                    
    //             }
    //             tot++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total numbers of subarray :"+ tot);
        
    // }

    //MAXIMUM SUB ARRAY SUM(PREFIX SUM)

    public static void printSumofSubarray(int numbers[])  {
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;
       int prefix[] = new int[numbers.length];
       for(int i = 1;i<prefix.length; i++)  {
        prefix[i] = prefix[i-1] + numbers[i];
       }
       for(int i=0;i<numbers.length;i++)  {
        int start = i;
        for(int j = i; j<numbers.length; j++)  {
            int end = j;
            currSum = start == 0 ? prefix[start]:prefix[end] - prefix[start-1];
            if(maxSum<currSum)  {
                maxSum = currSum;
            }
        }
       }
       System.out.println("The maximum sum is :" + maxSum);
    }
    public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10,12,14};
    //    int value = 10;
    //    int index = LinearSearch(numbers,value);
    //    if(index == -1) {
    //     System.out.println("NOT FOUND");
    //    } else {
    //     System.out.println("The index is  :" + index);
    //    }
           

    // int numbers[] = {2 , 4 , 6 , 8 , 10 , 12 , 14 , 16};
    // int value = 16;
    // System.out.println("The index number is :" + BinarySearch_s(numbers,value));

    // int numbers[] = {2 , 4 , 6 , 8 , 10};
    // ReverseNum(numbers);
    // for(int i=0;i<numbers.length;i++)  {
    //     System.out.print(numbers[i] + " ");
    // }
    // System.out.println();

    // int numbers[] = {2 , 4 , 6 , 8 , 10};
    // printPairs(numbers);


    // int numbers[] = {2 , 4 , 6 , 8 , 10};
    // printSubarray(numbers);
    int numbers[] = {2 , 4 , 6 , 8 , 10};
    printSumofSubarray(numbers);

    }

}
