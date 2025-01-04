package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassRoomActivity2 {

	public static void main(String[] args) {
		String name = "ramalakshmi";
		System.out.println("My Name:"+name);

        // Convert the name to a character array
        char[] charArray = name.toCharArray();

        // Create an empty LinkedHashSet to maintain order and remove duplicates
        Set<Character> uniqueCharacters = new LinkedHashSet<Character>();

        // Add characters to the set
        for (char c : charArray) {
            uniqueCharacters.add(c);
        }

        // Print the characters in the same order
        System.out.println("Name after removing duplicates:");
        for (char c : uniqueCharacters) {
            System.out.print(c);
        }
    }

	}


