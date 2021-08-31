package sel;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class hovereffect {

	public static void main(String[] args) throws InterruptedIOException, InterruptedException{
		
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","D:\\worksoft\\chromedriver_win32\\chromedriver.exe");  
	           // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver(); 
	   // WebDriver driver=new FirefoxDriver(); 
	    driver.get("https://www.demoqa.com/tool-tips/");
	    WebElement btn;
	    btn=driver.findElement(By.id("toolTipTextField"));
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    Actions act= new Actions(driver);
	    act.moveToElement(btn).build().perform();
	    System.out.println("Button TT is:" +btn.getText());
	    Thread.sleep(3000);
	    WebElement tf= driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
	    act.moveToElement(tf).build().perform();
	    System.out.println("code ended");
	
	
	    
	    
	    
	    
	    
	    
       

	}

}
