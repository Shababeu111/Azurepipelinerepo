package cucumberJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args){
			
		 System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.switchTo().frame(0);
		 Actions e= new Actions(driver);
		 e.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		 .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		 .release()
		 .build()
		 .perform();
		 
		 
}
}
