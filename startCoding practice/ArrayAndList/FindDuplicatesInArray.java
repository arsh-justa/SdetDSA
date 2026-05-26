import java.util.*;


public class findDuplicateArray
{
    public static void main(String args[])
    {
        int arr[] = {0,2,3,4,1,2,0};
        getDuplicate(arr);
    }

    public static void getDuplicate(int arr[])
    {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!set.add(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }


    }
}