package week2.day3;

public class Elements extends Button {
    public static void main(String[] args) {
        // Base Class WebElement
        System.out.println("Base Class: WebElement");
        WebElement element = new WebElement();
        element.click();
        element.setText("Hello WebElement");
        
        System.out.println("\nExecution Class: Elements");
        Elements elements = new Elements();
        elements.click(); // Inherited from WebElement
        elements.submit(); // Inherited from Button
    }
}