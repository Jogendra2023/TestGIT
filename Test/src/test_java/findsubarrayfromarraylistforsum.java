package test_java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findsubarrayfromarraylistforsum 
{
	// Utility function to print the sub-array arr[i,j]
    public static void print(int[] arr, int i, int j)
    {
        System.out.println(IntStream.range(i, j + 1)
                                    .mapToObj(k -> arr[k])
                                    .collect(Collectors.toList()));
    }
 
    // Function to find sub-arrays with given sum in an array
    public static void findSubarrays(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int sum_so_far = 0;
 
            // consider all sub-arrays starting from i and ending at j
            for (int j = i; j < arr.length; j++)
            {
                // sum of elements so far
                sum_so_far += arr[j];
 
                // if sum so far is equal to the given sum
                if (sum_so_far == sum) {
                    print(arr, i, j);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 3, 3, 1, -4 };
        int sum = 7;
 
        findSubarrays(arr, sum);
    }
}
