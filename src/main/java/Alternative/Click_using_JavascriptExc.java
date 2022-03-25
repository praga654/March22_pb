package Alternative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

public class Click_using_JavascriptExc {
	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver",
	         "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //launch URL
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // identify element
	      WebElement m = driver.findElement(By.xpath("//a[@title='TutorialsPoint - Home']"));
	      // click with Javascript Executor
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", m);
	      driver.quit();
	   }
	}


