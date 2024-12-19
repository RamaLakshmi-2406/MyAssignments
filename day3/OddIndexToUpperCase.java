package week1.day3;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		 String test = "changeme";
	        char[] charArray = test.toCharArray();
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            // Check if the index is odd
	            if (i % 2 != 0) {
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }
	        System.out.println(new String(charArray));
	}

}
