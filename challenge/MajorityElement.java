package challenge;



public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {3, 2, 3}; // Input array
        System.out.println(findMajorityElement(nums)); // Output the majority element
    }

    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // Step 1: Find the candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Return the candidate (majority element always exists)
        return candidate;

	}

}
