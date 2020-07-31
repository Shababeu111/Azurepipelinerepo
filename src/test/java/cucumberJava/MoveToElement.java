package cucumberJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException{
		
		
	 System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	 driver.get("http://www.spicejet.com");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		 Actions e =new Actions(driver);
		 e.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("SpiceMax")).click(); 

	 
	 
}

}
