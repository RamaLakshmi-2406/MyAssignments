package week1.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 8, 6, 7};

        Arrays.sort(array);

        int missingElement = -1; 
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                missingElement = array[i] + 1;
            }
        }
        if (missingElement != -1) {
            System.out.println("Missing element: " + missingElement);
        } else {
            System.out.println("No missing element in the sequence.");
        }

	}

}
