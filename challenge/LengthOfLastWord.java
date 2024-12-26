package challenge;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Have a Good Day"; 
		System.out.println("The length of the String is:" + s.length());
        
        int result = getLengthOfLastWord(s);
        System.out.println("The length of the last word is:" + result);
    }

    public static int getLengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
	}

}
