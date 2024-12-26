package week2.day3;

class WebElement {
   
    void click() {
        System.out.println("WebElement clicked.");
    }

    void setText(String text) {
        System.out.println("Text set: " + text);
    }

    

public static void main(String[] args) {
	// TODO Auto-generated method stub
	WebElement we= new WebElement();
	we.click();
	we.setText("text");}}
	
