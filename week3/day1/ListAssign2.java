package week3.day1;

import java.util.Arrays;

public class ListAssign2 {
public static void main(String[] args) {
	int[] numbers = {3, 2, 11, 4, 6, 7};
    
    // Sort the array in ascending order
    Arrays.sort(numbers);
    
    System.out.println("Ascending order:"+numbers);
    
    // Print the second largest number
    System.out.println("Second largest number: " + numbers[numbers.length - 2]);
}
}

