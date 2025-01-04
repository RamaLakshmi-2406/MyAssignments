package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// Input string
        String input = "Rama";

        // Convert String to Character array
        char[] charArray = input.toCharArray();

        // Create a new Set to store unique characters
        Set<Character> uniqueSet = new LinkedHashSet<>();
        // Create a Set to track duplicate characters
        Set<Character> duplicateSet = new HashSet<>();

        // Add each character to the Set
        for (char c : charArray) {
            if (!uniqueSet.add(c)) {
                duplicateSet.add(c);
            }
        }

        // Remove all duplicates from the uniqueSet
        uniqueSet.removeAll(duplicateSet);

        // Print the unique characters
        for (char c : uniqueSet) {
            System.out.print(c + " ");
        }

	}

}
