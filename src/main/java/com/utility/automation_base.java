package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;





public class automation_base {
	public static WebDriver driver;
	
	private static String value;

	// public static Select drp;
//BROWSER LANCH-------------------------------------------------------------------------------------
	public static WebDriver browser_launch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "");

		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

		}
		driver.manage().window().maximize();
		return driver;
	}

//CLOSE AND QUIT------------------------------------------------------------------------------------
	public static void close_Quit(String type) {

		if (type.equalsIgnoreCase("close")) {
			driver.close();
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}

//GET URL------------------------------------------------------------------------------------------
	public static void geturl(String url) {

		driver.get(url);

	}

//GET TITLE-----------------------------------------------------------------------------------------
	public static void get_title() {

		System.out.println(driver.getTitle());
	}

//CLICK---------------------------------------------------------------------------------------------
	public static void click(WebElement click) {

		click.click();

	}

//SEND KEYS----------------------------------------------------------------------------------------
	public static void send(WebElement send, String keys) {

		send.sendKeys(keys);
	}

//	public static Select select(WebElement ref,String f, String a1, String par) {
//		drp = new Select(reef);
//
//		if (f.equalsIgnoreCase("Index")) {
//		int index=Integer.parseInt(par);
//			drp.selectByIndex(index);
//
//		} else if (f.equalsIgnoreCase("value")) {
//			drp.selectByValue(a1);
//
//		} else if (f.equalsIgnoreCase("visibletext")) {
//			drp.selectByVisibleText(a1);
//
//		}
//		return drp;
//SELECT BY----------------------------------------------------------------------------------------
	public static void selectDropDown(WebElement ref, String type, String value) {

		Select select = new Select(ref);
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);

			break;

		default:
			System.out.println("plese give the correct method");
			break;
		}

	}

//ALERT-------------------------------------------------------------------------------------------
	public static void alert(String click, String text) {

		Alert al = driver.switchTo().alert();
		if (click.equalsIgnoreCase("ok")) {
			al.accept();

		} else if (click.equalsIgnoreCase("cancel")) {
			al.dismiss();
		} else if (click.equalsIgnoreCase("text")) {
			al.sendKeys(text);
		} else {
			System.out.println("Pass the correct click values");
		}
	}

//NAVIGATE----------------------------------------------------------------------------------------
	public static void navigate(String method, String url) {

		switch (method) {
		case "to":
			driver.navigate().to(url);

			break;
		case "back":
			driver.navigate().back();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;
		case "forward":
			driver.navigate().forward();

		default:
			System.out.println("pass the correct method");
			break;
		}

	}

//FRAMES-----------------------------------------------------------------------------------------
	public static void frame(String type, String index, String idOrName) {

		if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(idOrName);
		} else if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(index));

		}
	}

//DEFAULT CONTENT FRAMES--------------------------------------------------------------------------
	public static void oldWindow() {

		driver.switchTo().defaultContent();
	}

//ACTION-----------------------------------------------------------------------------------------
	public static void drag(String type, WebElement src, WebElement dist) {

		Actions s = new Actions(driver);
		if (type.equalsIgnoreCase("scroll")) {
			s.moveToElement(src);
		} else if (type.equalsIgnoreCase("dragAndDrop")) {
			s.dragAndDrop(src, dist).build().perform();

		}
	}
//SCREES SHOT---------------------------------------------------------------------------------------

	public static void screenshot(String type, String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + path);
		if (type.equalsIgnoreCase("utils")) {
			FileUtils.copyFile(src, target);
		} else if (type.equalsIgnoreCase("handler")) {
			org.openqa.selenium.io.FileHandler.copy(src, target);

		}

	}

	public static void implicitlyWait(int time,TimeUnit unit) {
	
		driver.manage().timeouts().implicitlyWait(time,unit);
  	}






	

	public static WebDriver browser_Configuration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("FireFox")) {
			System.setProperty("WebDriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void inputValueElement(WebElement element, String data) {

		element.sendKeys(data);
	}

	public static void close() {
		driver.close();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void navigate(String url) {
		driver.navigate().to(url);
	}

	public static void wait(long time, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);
	}

	public static void select(WebElement element, String type, String value) {

		try {
			Select s = new Select(element);

			if (type.equalsIgnoreCase("ByValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("ByText")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("ByIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}

	}

	public static void screenshot(String image) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Mainproject_march22\\\\Screenshot//" + image);
		FileUtils.copyFile(source, destination);
	}

	public static void javaScript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)", "");
	}

	public static void alert(String type) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("prompt")) {
			a.sendKeys("alert");
			a.accept();
		} else {
			a.dismiss();
		}
	}

	public static void mouseOver(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	
	public static String particular_Cell_Data(String path,int rowindex,int cellindex) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(rowindex);
		Cell c = r.getCell(cellindex);	
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING))
		{
			 value = c.getStringCellValue();
	    }
		else if (type.equals(CellType.NUMERIC))
		{
			double cellValue = c.getNumericCellValue();
			int value = (int) cellValue;
			System.out.println(value);
		}
		return value;


		
	}

	

}



	
				
				
	
	
	
	
	

