package week2.day3;

public class APIClient {

	public void sendRequest1 (String  endpoint) {
		System.out.println("endpoint");
	}
	
	
	public static void main(String[] args) {
		

		APIClient fr=new APIClient();
		fr.sendRequest1("endpoint");
		
		
	}

}