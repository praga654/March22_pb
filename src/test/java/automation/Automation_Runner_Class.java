package automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.manager.Object_Store;
import com.utility.automation_base;

import Com.Logger_demo.Basic_Configuration;
import com_test_demo.Automation_runne_class;

public class Automation_Runner_Class extends automation_base {
	

	public static WebDriver driver = browser_launch("chrome");
	public static Object_Store obj = new Object_Store(driver);
	static  Logger log = Logger.getLogger(Automation_runne_class.class);

	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		geturl("http://automationpractice.com/index.php");
		log.info("Url Launch");
		log.debug("debug");
		log.warn("Warning");
		log.error("Error"); 
		log.fatal("url launch");
		System.exit(0);
		
		
		
		
		implicitlyWait(5, TimeUnit.SECONDS);
		String cell_Data = particular_Cell_Data(
				"C:\\Users\\Hassan\\eclipse-workspace\\March22_PB\\automationtest_case\\Automation_TestCase.xlsx", 2,
				5);
		send(obj.getText().getEmail(), cell_Data);
		 String data = particular_Cell_Data(
					"C:\\Users\\Hassan\\eclipse-workspace\\March22_PB\\automationtest_case\\Automation_TestCase.xlsx", 8,
					5);
		send(obj.getText().getPass(),data);
		click(obj.getText().getSub());
		click(obj.getTs().gettShirt());
		click(obj.gettShirt().getsize());
		
		
		selectDropDown(obj.gettShirt().getDrp1(), "index", "4");

		click(obj.gettShirt().getPic());
		click(obj.gettShirt().getQuantity());
		click(obj.gettShirt().getQuantity());
		click(obj.gettShirt().getAdToCart());

		click(obj.getClick().getPro());
		click(obj.getClick().getPro1());
		click(obj.getClick().getPro2());
		click(obj.getClick().getCheck());
		click(obj.getClick().getPro3());

		click(obj.getPay().getPay());
		click(obj.getPay().getCon());
		
		click(obj.getPay().getCon1());
		log.info("Credentials Entered in field");

	}
}
