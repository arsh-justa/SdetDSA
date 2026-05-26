import java.util.*;
public class MaximumSumSubarray {
    
    public static int[] maximumSumSubarray(int[] arr)
    {   int maxSum = arr[0];
        int sum = 0;
        int first=0;
        int last=0;
    

        for(int i=0;i<arr.length;i++)
        { sum = arr[i];
            if(i==arr.length-1)
            {
               if(sum>maxSum)
                {
                   maxSum = sum;
                   first = i;
                   last = i;
                } 
            }
            
            for(int j=i+1;j<arr.length;j++)
            {  
                sum=sum+arr[j];
                if(sum>maxSum)
                {
                   maxSum = sum;
                   first = i;
                   last = j;
                }
                
            }
        }
        
        int[] sumAndIndex = new int[3];
          System.out.println("---");
        sumAndIndex[0] = first;
        sumAndIndex[1] = last;
        sumAndIndex[2] = maxSum;

        System.out.println(sumAndIndex[2]);
        return sumAndIndex;
    }



    public static void main(String[] args) {
       // MaximumSumSubarray a = new MaximumSumSubarray();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(Arrays.toString(maximumSumSubarray(arr)));
    }
}
