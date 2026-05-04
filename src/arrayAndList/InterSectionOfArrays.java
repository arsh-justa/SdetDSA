package arrayAndList;

import java.util.HashSet;
//import java.util.LinkedHashSet; - use to maintain the order of insertion
import java.util.Set;

/**
 * DSA - Intersection of Two Arrays
 *
 * Problem Statement:
 * Given two arrays, find the intersection of the two arrays.
 * Return the common elements between the two arrays.
 * Example: Input: [1,2,2,1], [2,2] Output: [2]
 *
 * Approach Used: HashSet
 * - Use HashSet to store elements of first array
 * - Iterate through second array and check for common elements
 * - Time Complexity: O(m+n), Space Complexity: O(m)
 */

public class InterSectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 9, 5 };
		int[] b = { 9, 4, 9, 8, 4 };
		intersection(a, b);
	}

	public static void intersection(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0) return;
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if (set.contains(b[i])) {
				set1.add(b[i]);
			}
		}
		System.out.println(set1);
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Intersection of Two Arrays II (LeetCode 350)
 *    - Find intersection with duplicates preserved
 *    - Example: [1,2,2,1], [2,2] -> [2,2]
 *    - Use HashMap to count frequencies
 *
 * 2. Intersection of Three Arrays
 *    - Find common elements in three arrays
 *    - Use multiple HashSets or HashMap
 *
 * 3. Union of Two Arrays
 *    - Find all unique elements from both arrays
 *    - Combine elements without duplicates
 *
 * 4. Find Common Elements in N Arrays
 *    - Generalized intersection problem
 *    - Use HashMap or reduce approach
 *
 * 5. Relative Complement (Set Difference)
 *    - Elements in first array but not in second
 *    - Example: [1,2,3], [2,3,4] -> [1]
 *
 * 6. Symmetric Difference
 *    - Elements in either array but not in both
 *    - Example: [1,2,3], [2,3,4] -> [1,4]
 *
 * 7. Two Sum (LeetCode 1)
 *    - Find two numbers that add up to target
 *    - Use HashMap for O(n) solution
 *
 * 8. Three Sum (LeetCode 15)
 *    - Find three numbers that add up to zero
 *    - Sort array and use two pointers
 *
 * 9. Four Sum (LeetCode 18)
 *    - Find four numbers that add up to target
 *    - Similar to three sum with extra loop
 *
 * 10. Longest Consecutive Sequence (LeetCode 128)
 *     - Find longest consecutive elements sequence
 *     - Use HashSet for O(n) solution
 *
 * Related Data Structures:
 * - HashSet: For unique element storage and lookup
 * - HashMap: For frequency counting
 * - Two Pointers: For sorted array intersection
 * - Bit Manipulation: For small integer ranges
 *
 * Time/Space Trade-offs:
 * - HashSet: O(m+n) time, O(m) space
 * - Two Pointers (sorted): O(m+n) time, O(1) space
 * - Brute Force: O(m*n) time, O(1) space
 */
