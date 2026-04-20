package arrayAndList;

import java.util.HashSet;

/**
 * DSA - Find Duplicates in Array
 *
 * Problem Statement:
 * Given an array of integers, find all duplicate elements in the array.
 * Example: Input: [1, 2, 3, 4, 2, 5, 1] Output: 2, 1 (duplicates found)
 *
 * Approach Used: HashSet
 * - Use a HashSet to track seen elements
 * - For each element, check if it's already in set (duplicate)
 * - Time Complexity: O(n), Space Complexity: O(n)
 */

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 5, 1 };
		findDuplicate(arr);
	}

	public static void findDuplicate(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println(arr[i]);
			}
			else
			set.add(arr[i]);
		}
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Find First Duplicate in Array
 *    - Return the first element that appears more than once
 *    - Example: [1,2,3,4,2,5,1] -> 2
 *
 * 2. Find All Duplicates in Array (LeetCode 442)
 *    - Given array where elements are 1 to n, find all duplicates
 *    - Must solve without extra space and in O(n) time
 *    - Use cyclic sort or mark visited by negating values
 *
 * 3. Remove Duplicates from Sorted Array (LeetCode 26)
 *    - Remove duplicates in-place from sorted array
 *    - Return length of array with unique elements
 *
 * 4. Remove Duplicates from Unsorted Array
 *    - Remove all duplicates, keep only unique elements
 *    - Can use HashSet or sorting approach
 *
 * 5. Find Missing Number (LeetCode 268)
 *    - Given array 0 to n, find missing number
 *    - Use XOR or sum formula
 *
 * 6. Find All Numbers Disappeared in Array (LeetCode 448)
 *    - Find numbers missing from 1 to n range
 *    - Use cyclic sort or marking approach
 *
 * 7. Intersection of Two Arrays (LeetCode 349, 350)
 *    - Find common elements between two arrays
 *    - Return unique intersection or with duplicates
 *
 * 8. Contains Duplicate (LeetCode 217)
 *    - Check if array contains any duplicate
 *    - Return true/false
 *
 * 9. Contains Duplicate II (LeetCode 219)
 *    - Check if there are duplicates within k distance
 *    - Use sliding window with HashSet
 *
 * 10. Contains Duplicate III (LeetCode 220)
 *     - Check if there are duplicates within k distance and value difference t
 *     - Use sliding window with TreeSet or bucket sort
 *
 * Related Data Structures:
 * - HashSet: For O(1) lookup
 * - HashMap: For counting frequencies
 * - Sorting: For two-pointer approach
 * - Bit Manipulation: For certain constraints
 *
 * Time/Space Trade-offs:
 * - HashSet: O(n) time, O(n) space
 * - Sorting + Two Pointers: O(n log n) time, O(1) space
 * - For constrained arrays (1-n): Can achieve O(n) time, O(1) space
 */
