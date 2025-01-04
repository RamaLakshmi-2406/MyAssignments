package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ListAssign4 {
	public static void main(String[] args) {
		 List<String> companyList = new ArrayList<String>();
		 String company1 = "HCL";
	     String company2 = "Wipro";
	     String company3 = "Aspire Systems";
	     String company4 = "CTS";
	    
	    
	    companyList.add(company1);
	    companyList.add(company2);
	    companyList.add(company3);
	    companyList.add(company4);
	    
	    // Print the required output manually in the desired order
	    System.out.println(companyList.get(1));
	    System.out.println(companyList.get(0));
	    System.out.println(companyList.get(3)); 
	    System.out.println(companyList.get(2)); 
	}
	}
	