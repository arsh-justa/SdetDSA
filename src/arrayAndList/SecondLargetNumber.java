package arrayAndList;

/**
 * DSA - Find Second Largest Number
 *
 * Problem Statement:
 * Given an array of integers, find the second largest element in the array.
 * Example: Input: [12,35,1,10,34] Output: 34 (second largest after 35)
 *
 * Approach Used: Single Pass with Two Variables
 * - Keep track of largest and second largest
 * - Update both variables as we traverse
 * - Time Complexity: O(n), Space Complexity: O(1)
 */

public class SecondLargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34 };
		secondLargest(arr);
	}

	public static void secondLargest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Second largest not possible");
			return;
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];
			} else if (max1 > arr[i] && max2 < arr[i]) {
				max2 = arr[i];
			}
		}
		if (max2 == Integer.MIN_VALUE) {
			System.out.println("No second largest element");
		} else {
			System.out.println("Second Largest = " + max2);
		}
		System.out.println(max2);
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Find Kth Largest Element (LeetCode 215)
 *    - Find kth largest element in unsorted array
 *    - Use QuickSelect or Priority Queue
 *
 * 2. Find Second Smallest Element
 *    - Similar approach but track smallest and second smallest
 *    - Handle duplicates carefully
 *
 * 3. Find Largest and Smallest in Single Pass
 *    - Find both max and min in one traversal
 *    - Use two pairs of variables
 *
 * 4. Find Top K Frequent Elements (LeetCode 347)
 *    - Find k most frequent elements
 *    - Use HashMap and Priority Queue
 *
 * 5. Find Peak Element (LeetCode 162)
 *    - Find element greater than neighbors
 *    - Use binary search
 *
 * 6. Majority Element (LeetCode 169)
 *    - Find element appearing more than n/2 times
 *    - Use Boyer-Moore Voting Algorithm
 *
 * 7. Majority Element II (LeetCode 229)
 *    - Find elements appearing more than n/3 times
 *    - Extended Boyer-Moore algorithm
 *
 * 8. Find All Numbers Disappeared (LeetCode 448)
 *    - Find missing numbers in 1 to n
 *    - Use cyclic sort or marking
 *
 * 9. Single Number (LeetCode 136)
 *    - Find number that appears only once
 *    - Use XOR operation
 *
 * 10. Single Number II (LeetCode 137)
 *     - Find number appearing once, others appear thrice
 *     - Use bit manipulation
 *
 * Related Data Structures:
 * - Array: Basic storage
 * - Priority Queue: For kth element problems
 * - HashMap: For frequency counting
 * - XOR: For single number problems
 *
 * Time/Space Trade-offs:
 * - Single Pass (max/min): O(n) time, O(1) space
 * - Sorting: O(n log n) time, O(1) space
 * - Priority Queue: O(n log k) time, O(k) space
 * - QuickSelect: O(n) average time, O(1) space
 */
