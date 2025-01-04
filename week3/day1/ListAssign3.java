package week3.day1;

import java.util.ArrayList;
import java.util.Collections;

public class ListAssign3 {
public static void main(String[] args) {
	ArrayList<Integer> numberList = new ArrayList<Integer>();
	int[] numbers = {1, 2, 3, 4, 10, 6, 8};
    for (int i = 0; i < numbers.length; i++) {
        numberList.add(numbers[i]);
    }
    
    // Sort the list in ascending order
    Collections.sort(numberList);
    
 
    System.out.println("Missing numbers:");
    for (int i = 0; i < numberList.size() - 1; i++) {
        int current = numberList.get(i);
        int next = numberList.get(i + 1);
        
       
        if (current + 1 != next) {
            for (int missing = current + 1; missing < next; missing++) {
                System.out.println(missing);
            }
        }
    }
}

	
}

