package week2.day3;

public class BasePage {
    
    void findElement() {
        System.out.println("Finding an element on the page...");
    }

  
    void clickElement() {
        System.out.println("Clicking an element...");
    }

    // Method to simulate entering text
    void enterText(String text) {
        System.out.println("Entering text: " + text);
    }

   
    void performCommonTasks() {
        System.out.println("Performing common tasks on the page");
    }

    public static void main(String[] args) {
     
        System.out.println("Using BasePage:");
        BasePage basePage = new BasePage();
        basePage.performCommonTasks();
    }
}