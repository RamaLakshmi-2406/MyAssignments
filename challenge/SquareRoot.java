package challenge;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 9; // Replace this with your input
        int result = getSquareRoot(x);
        System.out.println("The square root of " + x + " is: " + result);
    }

    public static int getSquareRoot(int x) {
        int current = 1;
        int result = 0;

        while (current * current <= x) { // Check if current^2 is less than or equal to x
            result = current; // Update result
            current++; // Go to the next number
        }

        return result; // Return the last valid number
    }
    }



