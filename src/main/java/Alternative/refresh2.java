package Alternative;
import org.openqa.selenium.Keys;


import java.lang.Thread;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.Alert;
import java.util.List;

public class refresh2 {
	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	     driver= new ChromeDriver();

	//Launch the Application Under Test (AUT)
	driver.get("http://google.com");


	Actions action = new Actions(driver);
	WebElement element = driver.findElement(By.name("q"));

	element.sendKeys("test data");
	//sends normal keyboard strokes

	 // Approach 1  driver.findElement(By.xpath("//html")).sendKeys(Keys.F5);


	// Approach 2.1 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]"));
	//Approach 2.2 element1.sendKeys(Keys.F1);


	//  Approach 3   driver.findElement(By.xpath("//*[@id=\"Sr\"]")).sendKeys(Keys.F5);

	  // driver.execute_script("location.reload(true);");


	System.out.println(driver.getTitle());
	// working driver.navigate().to(driver.getCurrentUrl());
	}

	
	
	

}
