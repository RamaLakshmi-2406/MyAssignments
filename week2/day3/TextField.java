package week2.day3;

class TextField extends WebElement {
 
    String getText() {
        return "Sample text from TextField.";
        
      
    }
    public static void main(String[] args) {
	
TextField tf=new TextField();
tf.getText();
tf.click();
tf.setText("setText");
		
		
	}

}