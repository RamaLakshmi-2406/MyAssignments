package week2.day3;

public class LoginPage extends BasePage {
	
	 	    void performCommonTasks() {
	        System.out.println("Performing specific tasks for the LoginPage");
	        findElement();
	        enterText("username");
	        enterText("password");
	        clickElement();
	    }
	 	   public static void main(String[] args) {

System.out.println("\nUsing LoginPage:");
LoginPage loginPage = new LoginPage();
loginPage.performCommonTasks(); 
}
}
