package Alternative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

public class Sendkeys {
	public static void main(String[] args) {
	      System.setProperty("WebDriver.chrome.driver",
	    		  "C:\\Users\\ghs6kor\\Desktop\\Java\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.google.com/");
	      // JavaScript Executor to enter text
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript ("document.getElementById('gsc-i-id1').value='Selenium'");
	      WebElement l = driver.findElement(By.id("gsc-i-id1"));
	      String s = l.getAttribute("value");
	      System.out.println("Value entered is: " + s);
	      driver.quit();
	   }

}
