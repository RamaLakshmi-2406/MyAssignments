package week2.day3;

public class CustomButton extends WebElement {
	
	public void  submit() {
		System.out.println("sumbit");
	}

	public static void main(String[] args) {
		

		CustomButton cb=new CustomButton();
		cb.submit();
		cb.click();
		cb.setText("text");
		
		
	}

}