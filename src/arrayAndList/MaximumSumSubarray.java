package arrayAndList;

/**
 * DSA - Maximum Sum Subarray (Kadane's Algorithm)
 *
 * Problem Statement:
 * Given an array of integers, find the contiguous subarray with the largest sum.
 * Example: Input: [-2,1,-3,4,-1,2,1,-5,4] Output: 6 (subarray [4,-1,2,1])
 *
 * Approach Used: Kadane's Algorithm
 * - Keep track of current sum and maximum sum
 * - Reset current sum to 0 when it becomes negative
 * - Time Complexity: O(n), Space Complexity: O(1)
 */

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maximumSumSubarray(arr);

	}

	public static void maximumSumSubarray(int[] arr) {
		int maxSum = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(maxSum);
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Maximum Product Subarray (LeetCode 152)
 *    - Find contiguous subarray with maximum product
 *    - Handle negative numbers carefully
 *    - Keep track of max and min products
 *
 * 2. Maximum Sum Subarray of Size K
 *    - Fixed size sliding window
 *    - Use sliding window technique
 *
 * 3. Subarray Sum Equals K (LeetCode 560)
 *    - Find number of subarrays with sum = K
 *    - Use prefix sum and HashMap
 *
 * 4. Maximum Sum Circular Subarray (LeetCode 918)
 *    - Array is circular, can wrap around
 *    - Handle circular case separately
 *
 * 5. Kadane's Algorithm with Indices
 *    - Return start and end indices of max subarray
 *    - Track indices during iteration
 *
 * 6. Maximum Subarray Sum with at most one deletion (LeetCode 1186)
 *    - Can delete one element to maximize sum
 *    - Use dynamic programming
 *
 * 7. Best Time to Buy and Sell Stock (LeetCode 121)
 *    - Maximum profit from single transaction
 *    - Similar to Kadane's with price differences
 *
 * 8. Best Time to Buy and Sell Stock II (LeetCode 122)
 *    - Maximum profit from multiple transactions
 *    - Greedy approach
 *
 * 9. Longest Subarray with Sum <= K
 *    - Find longest subarray with sum <= K
 *    - Use sliding window
 *
 * 10. Minimum Size Subarray Sum (LeetCode 209)
 *     - Find minimum length subarray with sum >= K
 *     - Use sliding window with two pointers
 *
 * Related Data Structures:
 * - Array: Basic storage
 * - Prefix Sum Array: For range sum queries
 * - HashMap: For sum frequency (subarray sum = K)
 * - Deque: For sliding window maximum
 *
 * Time/Space Trade-offs:
 * - Kadane's: O(n) time, O(1) space
 * - Brute Force: O(n^2) time, O(1) space
 * - Divide and Conquer: O(n log n) time, O(log n) space
 * - Dynamic Programming: O(n) time, O(n) space
 */
