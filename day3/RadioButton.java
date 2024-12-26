package week2.day3;

class RadioButton extends Button {
    // RadioButton-specific method
    void selectRadioButton() {
        System.out.println("RadioButton selected.");
    }
    public static void main(String[] args) {
	
		RadioButton ro=new RadioButton();
		ro.selectRadioButton();
		ro.submit();
		ro.click();
		ro.setText("text");


	}

}