package week1.day3;

public class removeduplicates {
	public static void main(String[] args) {
		        String text = "We learn Java basics as part of java sessions in java week1";

		        String[] words = text.split(" ");
		        int count;

	
		        for (int i = 0; i < words.length; i++) {
		            count = 1; 


		            if (words[i].equals("")) {
		                continue;
		            }
		            for (int j = i + 1; j < words.length; j++) {
		      
		                if (words[i].equalsIgnoreCase(words[j])) {
		                    count++; 
		                    words[j] = ""; 
		                }
		            }
		        }

		        StringBuilder result = new StringBuilder();
		        for (String word : words) {
		            if (!word.equals("")) { 
		                result.append(word).append(" ");
		            }
		        }


		        System.out.println(result.toString().trim());
		    }
	}

