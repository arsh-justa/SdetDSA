package arrayAndList;

/**
 * DSA - Merge Two Sorted Arrays
 *
 * Problem Statement:
 * Given two sorted arrays, merge them into one sorted array.
 * Example: Input: [1,3,5], [2,4,6] Output: [1,2,3,4,5,6]
 *
 * Approach Used: In-place Merge
 * - Compare elements and swap when necessary
 * - Bubble sort the second array after swaps
 * - Time Complexity: O(m*n), Space Complexity: O(1)
 */

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		mergeSorted(a, b);
	}

	public static void mergeSorted(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;

				int k = j;
				while (k + 1 < b.length && b[k] > b[k + 1]) {
					int t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
					k++;
				}
				i++;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + " ");
		}
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Merge Two Sorted Arrays (LeetCode 88)
 *    - Merge nums2 into nums1 as one sorted array
 *    - nums1 has enough space for both arrays
 *    - Start from end to avoid overwriting
 *
 * 2. Merge K Sorted Arrays
 *    - Merge multiple sorted arrays
 *    - Use priority queue or divide and conquer
 *
 * 3. Merge Intervals (LeetCode 56)
 *    - Merge overlapping intervals
 *    - Sort intervals first, then merge
 *
 * 4. Merge Sorted Array with Extra Space
 *    - Use third array to store merged result
 *    - Two pointers approach
 *
 * 5. Intersection of Two Sorted Arrays
 *    - Find common elements in sorted arrays
 *    - Two pointers approach
 *
 * 6. Union of Two Sorted Arrays
 *    - Combine without duplicates
 *    - Handle duplicates carefully
 *
 * 7. Find Median of Two Sorted Arrays (LeetCode 4)
 *    - Find median without merging arrays
 *    - Binary search approach
 *
 * 8. Smallest Range Covering Elements from K Lists (LeetCode 632)
 *    - Find smallest range that covers at least one element from each list
 *    - Use sliding window with multiple pointers
 *
 * 9. Sort an Array (LeetCode 912)
 *    - Implement sorting algorithms
 *    - Various approaches: quicksort, mergesort, etc.
 *
 * 10. Wiggle Sort II (LeetCode 324)
 *     - Rearrange array so nums[0] < nums[1] > nums[2] < nums[3]...
 *     - Sort and rearrange approach
 *
 * Related Data Structures:
 * - Arrays: Basic storage and manipulation
 * - Two Pointers: For merging without extra space
 * - Priority Queue: For K-way merge
 * - Stack: For interval merging
 *
 * Time/Space Trade-offs:
 * - Two Pointers (extra space): O(m+n) time, O(m+n) space
 * - In-place merge: O(m*n) time, O(1) space
 * - Priority Queue (K arrays): O(n log k) time, O(k) space
 * - Divide and Conquer: O(n log k) time, O(log k) space
 */
