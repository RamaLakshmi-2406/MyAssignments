package week2.day3;

class Button extends WebElement {
    // Button-specific method
    void submit() {
        System.out.println("Form submitted using Button.");
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Button bt=new Button();
	bt.submit();
	bt.click();
	bt.setText("text");
	
	
}
}