package challenge;

import java.util.Arrays;

public class FindSingleNumber {

	public static void main(String[] args) {
		int[] num1 = {2, 2, 1};
        int[] num2 = {4, 1, 2, 1, 2};
        int[] num3 = {1,5,1};

        // Print outputs
        System.out.println("Output for num1: " + findSingleNumber(num1));
        System.out.println("Output for num2: " + findSingleNumber(num2));
        System.out.println("Output for num3: " + findSingleNumber(num3));
    }

    // Method to find the single number
	public static int findSingleNumber(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Iterate through the array and compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            // If the current element is equal to the next element, skip both
            if (nums[i] == nums[i + 1]) {
                i++; // Skip the next element
            } else {
                return nums[i]; // Return the element that is not equal to the next one
            }
        }

        // If no element is found by the loop, the last element is the unique one
        return nums[nums.length - 1];

	}

}
