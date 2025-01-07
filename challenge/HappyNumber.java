package challenge;

public class HappyNumber {

	public static boolean isHappy(int n) {
        while (n != 1 && n != 4) { // 4 indicates a cycle for non-happy numbers
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n)); // Output: true
	}

}
