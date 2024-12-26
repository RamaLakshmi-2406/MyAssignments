package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		char[] array = companyName.toCharArray();
		for (int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
	}

}
