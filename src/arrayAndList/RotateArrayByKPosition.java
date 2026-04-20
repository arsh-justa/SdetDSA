package arrayAndList;

/**
 * DSA - Rotate Array by K Positions
 *
 * Problem Statement:
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Example: Input: [1,2,3,4,5], k=2 Output: [4,5,1,2,3]
 *
 * Approach Used: Rotate by One (k times)
 * - Rotate array by one position k times
 * - Each rotation moves last element to front
 * - Time Complexity: O(n*k), Space Complexity: O(1)
 */

public class RotateArrayByKPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		rotateByK(arr, k);
	}

	public static void rotateByK(int arr[], int k) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			rotateByOne(arr);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotateByOne(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

}

/**
 * Similar Concepts & Questions:
 *
 * 1. Rotate Array (LeetCode 189)
 *    - Rotate array by k positions efficiently
 *    - Use reverse technique: O(n) time, O(1) space
 *    - Reverse whole array, then reverse first k and last n-k
 *
 * 2. Rotate Array Left by K Positions
 *    - Rotate to the left instead of right
 *    - Similar approaches with direction change
 *
 * 3. Rotate Matrix 90 Degrees (LeetCode 48)
 *    - Rotate 2D matrix clockwise by 90 degrees
 *    - Use transpose then reverse columns
 *
 * 4. Rotate String (LeetCode 796)
 *    - Check if one string is rotation of another
 *    - Concatenate string with itself and check substring
 *
 * 5. Rotate List (LeetCode 61)
 *    - Rotate linked list by k positions
 *    - Find new head and connect lists
 *
 * 6. Reverse Array in Groups
 *    - Reverse every k elements in array
 *    - Use stack or two pointers
 *
 * 7. Juggling Algorithm for Rotation
 *    - Rotate array using GCD
 *    - More efficient for large arrays
 *
 * 8. Block Swap Algorithm
 *    - Another efficient rotation method
 *    - Uses block swapping technique
 *
 * 9. Rotate Array with Extra Space
 *    - Use temporary array for rotation
 *    - Simple but uses O(n) space
 *
 * 10. Cyclic Rotation
 *     - Rotate by one position efficiently
 *     - Handle edge cases carefully
 *
 * Related Data Structures:
 * - Array: Basic storage and manipulation
 * - Temporary Array: For extra space solutions
 * - Linked List: For list rotation problems
 * - Matrix: For 2D rotation problems
 *
 * Time/Space Trade-offs:
 * - Rotate by One (k times): O(n*k) time, O(1) space
 * - Reverse Technique: O(n) time, O(1) space
 * - Extra Space: O(n) time, O(n) space
 * - Juggling Algorithm: O(n) time, O(1) space
 */