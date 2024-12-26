package week2.day3;

class LoginTestData extends TestData {
    
    void enterUsername(String username) {
        System.out.println("Entering username: " + username);
    }

   
    void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }
    public static void main(String[] args) {
    LoginTestData loginTestData = new LoginTestData();
    System.out.println("\nUsing LoginTestData object:");
    LoginTestData.enterCredentials(); 
    loginTestData.navigateToHomePage();
    loginTestData.enterUsername("testUser"); 
    loginTestData.enterPassword("testPassword"); 
}
}