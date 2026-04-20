package arrayAndList;

/**
 * DSA - Find Missing Number (1 to N)
 *
 * Problem Statement:
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * Example: Input: [1,2,4,5], n=5 Output: 3
 *
 * Approach Used: Sum Formula
 * - Calculate expected sum = n*(n+1)/2
 * - Calculate actual sum of array elements
 * - Missing number = expected - actual
 * - Time Complexity: O(n), Space Complexity: O(1)
 */

public class MissingNo1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5 };
		int n = 5;
		missingNumber(arr, n);

	}

	public static void missingNumber(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int total = n * (n + 1) / 2;
		System.out.println(total - sum);
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Find Missing Number (LeetCode 268)
 *    - Array contains 0 to n, find missing number
 *    - Use XOR or sum formula
 *
 * 2. Find All Missing Numbers (LeetCode 448)
 *    - Find all disappeared numbers in 1 to n
 *    - Use cyclic sort or marking approach
 *
 * 3. Find Duplicate and Missing Number
 *    - Array has one duplicate and one missing
 *    - Use mathematical formulas or XOR
 *
 * 4. Missing Number in Arithmetic Progression
 *    - Find missing number in AP sequence
 *    - Use sum formula or binary search
 *
 * 5. Find the Duplicate Number (LeetCode 287)
 *    - Array contains n+1 numbers from 1 to n
 *    - Find the duplicate (no modification allowed)
 *    - Use Floyd's cycle detection
 *
 * 6. First Missing Positive (LeetCode 41)
 *    - Find smallest missing positive integer
 *    - Use cyclic sort approach
 *
 * 7. Missing Ranges (LeetCode 163)
 *    - Find missing ranges in sorted array
 *    - Return list of missing intervals
 *
 * 8. Find K Missing Numbers
 *    - Find first K missing numbers
 *    - Use HashSet or mathematical approach
 *
 * 9. Missing Element in Sorted Array
 *    - Binary search for missing element
 *    - Use index differences
 *
 * 10. XOR Operation in an Array (LeetCode 1486)
 *     - Perform XOR operations on array
 *     - Find pattern in XOR results
 *
 * Related Data Structures:
 * - Array: Basic storage
 * - HashSet: For tracking seen numbers
 * - XOR: For finding single missing/duplicates
 * - Binary Search: For sorted arrays
 *
 * Time/Space Trade-offs:
 * - Sum Formula: O(n) time, O(1) space
 * - XOR: O(n) time, O(1) space
 * - HashSet: O(n) time, O(n) space
 * - Sorting + Binary Search: O(n log n) time, O(1) space
 */
