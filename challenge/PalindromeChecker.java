package challenge;

public class PalindromeChecker {

	public static void main(String[] args) {
		String word = "Given a string s,return true if it is a palindrome,or false otherwise";
		
	String check ="moon";
	
	String LowerCase = check.toLowerCase();
	System.out.println("Lowercase");
	
	String replaceAll = LowerCase.replaceAll(",", "");
	System.out.println("replaceAll");
	
	int length = replaceAll.length()-1;
	System.out.println("length");
	
	boolean flag = false;
	
	for (int i =0;i<length;i++);
	{
		int i = 0;
		if(replaceAll.charAt(i)!=replaceAll.charAt(length-i)) {
			flag = true;
		}
		if(flag) {
			System.out.println("The word is not a Palindrome");
		}
			else
			{
				System.out.println("The word is a Palindrome");	
		}
	}
	
	}
}