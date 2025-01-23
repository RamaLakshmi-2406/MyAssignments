package week6.day1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="src/test/java/feature/Login.feature",glue="stepdefinition",publish=true)



//basic report for cucumber - publish = true
//feature - set path of your feature file
//glue - given only package of stepdefinition

public class LoginPage extends AbstractTestNGCucumberTests {

}
