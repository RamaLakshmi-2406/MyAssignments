package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Declare a String as "PayPal India"
        String input = "PayPal India";

        // Convert it into a character array
        char[] charArray = input.toCharArray();

        // Declare a Set as charSet for Character
        Set<Character> charSet = new LinkedHashSet<>();

        // Declare a Set as dupCharSet for duplicate Character
        Set<Character> dupCharSet = new HashSet<>();

        // Iterate character array and add it into charSet
        for (char c : charArray) {
            // If the character is already in the charSet, add it to the dupCharSet
            if (!charSet.add(c)) {
                dupCharSet.add(c);
            }
        }

        // Remove the duplicate characters from charSet
        charSet.removeAll(dupCharSet);

        // Iterate using charSet
        for (char c : charSet) {
            // Check the iterator variable isn't equals to an empty space
            if (c != ' ') {
                // Print it
                System.out.print(c);
            }
        }

	}

}
