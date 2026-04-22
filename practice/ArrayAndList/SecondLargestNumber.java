import java.util.*;

public class SecondLargestNumber{

    public static void main(String[] args)
    {
       int arr[] = {2, 5, 1, 3, 0}  ;

        System.out.println(secondHighestOptimized(arr));
    }
    //time = nlogn
    public static int secondHighest(int[] arr)
    {   int n = arr.length - 2;
        Arrays.sort(arr);
        return arr[n];
    }
    // TIME - n
    public static int secondHighestOptimized(int[] arr)
    {   int max1 = arr[0];
        int max2 = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
