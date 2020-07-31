package cucumberJava; 

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.*;



import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import gnu.cajo.utils.BaseItem.MainThread; 

public class annotation {				

	WebDriver driver;			
	
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	   DesiredCapabilities capability = DesiredCapabilities.chrome();
           capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
           capability.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, true);
       System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");					
       driver= new ChromeDriver(capability);
       driver.manage().window().maximize();

       driver.get("https://us-wclaudweb76.us.kworld.kpmg.com/ClaraPortal/"); 
       
       
       Runtime.getRuntime().exec("C:/Users/serkkara/Desktop/Retty/test.exe");
       Thread.sleep(5000);
       
//       AutoItX auto = new AutoItX();
//       auto.sleep(3000);
//
//       auto.controlGetFocus("Windows Security");
//
//       auto.winWaitActive("[CLASS:#Chrome_RenderWidgetHostHWND; INSTANCE:1]");
//
//       auto.send("{DOWN 3}",false);
//
//       auto.sleep(1000);
//
//        auto.send("{ENTER}", false);
       
       
       
       
       
       
       
//       String certificateZkhan = "C:/Users/serkkara/Desktop/Retty/1.png";
//   	String okButton = "C:/Users/serkkara/Desktop/Retty/2.png";
//   	Screen screen = new Screen();
//   	    try {
//   	        screen.click(1);
//   	        screen.click(2);
//   	    } catch (FindFailed findFailed) {
//   	        findFailed.printStackTrace();
//   	    }
      
       
       //driver.get("https://serkkara@kpmg.com:KPMGkpmg2020!@us-wclaudweb76.us.kworld.kpmg.com/ClaraPortal/");
       
       
       
//       if(driver.getTitle() == "Authentication Successful")
//           System.out.println("Test Passed");
//       else
//           System.out.println("Test failed");
       
       //WebDriverWait wait= new WebDriverWait(driver,5);
      // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//dash-tile[@id='LandingPageGroupWFEngagementsEntry2019V1']//div[@class='box-content']")));
//       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//       WebElement e= driver.findElement(By.name("Engagements"));
//        e.click();
       
       
       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       //WebElement e= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/clara-page[1]/div[1]/div[1]/div[1]/clara-host[1]/div[1]/div[2]/div[1]/dash-host[1]/div[1]/div[1]/div[1]/ng-include[1]/section[1]/dash-group[1]/div[1]/div[1]/div[4]/div[1]/dash-tile[3]/div[1]/div[2]/div[2]/div[1]/dash-imagetext-template[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
      // e.click();
    }		

   
    	
    	
    
    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {	
    	
    
      
    	 System.out.println("shababmanzil");					
      							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
    	//if (driver != null)
			//driver.quit();
    }		
}	