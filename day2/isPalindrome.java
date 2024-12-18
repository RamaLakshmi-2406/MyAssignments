package week1.day2;

public class isPalindrome {
	public static void main(String[] args) {
		  int input = 121; 
	        int originalInput = input; 
	        int output = 0; 


	        while (input > 0) {
	            int rem = input % 10; 
	            output = output * 10 + rem; 
	            input = input / 10;
	        }

	        if (originalInput == output) {
	            System.out.println(originalInput + " is a Palindrome.");
	        } else {
	            System.out.println(originalInput + " is not a Palindrome.");
	        }
	    }
	
	}


