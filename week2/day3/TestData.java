package week2.day3;

class TestData {
    
    static void enterCredentials() {
        System.out.println("Enter credentials");
    }

  
    void navigateToHomePage() {
        System.out.println("Navigating to the home page");
    }

    
  
        public static void main(String[] args) {
            
            TestData testData = new TestData();
            System.out.println("Using TestData object:");
            TestData.enterCredentials();
            testData.navigateToHomePage();
            }
}



        
        