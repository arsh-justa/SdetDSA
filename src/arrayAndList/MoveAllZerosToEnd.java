package arrayAndList;

/**
 * DSA - Move All Zeros to End
 *
 * Problem Statement:
 * Given an array of integers, move all zeros to the end while maintaining
 * the relative order of non-zero elements.
 * Example: Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 *
 * Approach Used: Two Pointers
 * - Use two pointers: one for non-zero placement, one for traversal
 * - Place non-zero elements first, then fill remaining with zeros
 * - Time Complexity: O(n), Space Complexity: O(1)
 */

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeros(arr);
	}

	public static void moveZeros(int[] arr) {
		if (arr == null || arr.length == 0) return;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Move All Zeros to End (Preserve Order)
 *    - Keep relative order of non-zero elements
 *    - Two pointers approach
 *
 * 2. Move All Zeros to Front
 *    - Move zeros to beginning instead of end
 *    - Similar two pointers but reverse logic
 *
 * 3. Sort Array with Two Types (0s and 1s)
 *    - Dutch National Flag problem variant
 *    - Sort 0s and 1s in array
 *
 * 4. Sort Colors (LeetCode 75)
 *    - Sort array with 0,1,2 (red, white, blue)
 *    - Three pointers approach
 *
 * 5. Partition Array (LeetCode 905)
 *    - Move all even numbers before odd numbers
 *    - Two pointers approach
 *
 * 6. Separate Even and Odd Numbers
 *    - Place even numbers first, then odd numbers
 *    - Maintain relative order within groups
 *
 * 7. Move Negatives to One Side
 *    - Move all negative numbers to left or right
 *    - Two pointers technique
 *
 * 8. Rearrange Array Alternately
 *    - Arrange elements in max-min order
 *    - Use extra space or in-place techniques
 *
 * 9. Rotate Array (LeetCode 189)
 *    - Rotate array by k positions
 *    - Use reverse or extra space
 *
 * 10. Reverse Array in Groups (LeetCode 341, variant)
 *     - Reverse every k elements in array
 *     - Use stack or two pointers
 *
 * Related Data Structures:
 * - Array: Basic storage and manipulation
 * - Two Pointers: For in-place rearrangement
 * - Queue/Stack: For temporary storage
 * - Extra Space: For complex rearrangements
 *
 * Time/Space Trade-offs:
 * - Two Pointers: O(n) time, O(1) space
 * - Extra Space: O(n) time, O(n) space
 * - Bubble Sort Approach: O(n^2) time, O(1) space
 * - Counting Sort: O(n) time, O(k) space (k = range)
 */
