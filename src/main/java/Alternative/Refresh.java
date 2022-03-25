package Alternative;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D: \\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.close();
	}
	}

