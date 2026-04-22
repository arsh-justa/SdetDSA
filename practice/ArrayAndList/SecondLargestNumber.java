import java.util.*;

public class SecondLargestNumber{

    public static void main(String[] args)
    {
       int arr[] = {2, 5, 1, 3, 0}  ;

        System.out.print(secondHighest(arr));
         System.out.print("");
    }

    public static int secondHighest(int[] arr)
    {   int n = arr.length - 2;
        Arrays.sort(arr);
        return arr[n];
    }
}
