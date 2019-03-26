
package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkinsIntegration {
  @Test
  public void f() {
	  System.out.println("This is my test project");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lavanya.pulipati\\Devops Testing\\chromedriver_win32\\chromedriver.exe");
	  //launch chrome browser
	  WebDriver driver=new ChromeDriver();
	  //open the application
	  driver.get("http://newtours.demoaut.com/");
	  
	  //enter username
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  driver.close();
	  
  }
} 
 
