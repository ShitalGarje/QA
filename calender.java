package sel;

import java.io.InterruptedIOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException   
	{
		
		 System.setProperty("webdriver.chrome.driver","D:\\worksoft\\chromedriver_win32\\chromedriver.exe");  
	         driver = new ChromeDriver();
	        driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
	        Thread.sleep(3000);
	        WebElement yymm=driver.findElement(By.cssSelector("#datepicker"));
	        yymm.click();
	        System.out.println("YYMMis" +yymm.getText());
	        selectDateInCalendar("15/02/2019");	  
	}
	        
	public static void selectDateInCalendar(String date) throws InterruptedException{
		Date currentDate=new Date();
		//currentDate=today();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
		try
		{
			java.util.Date expectedDate=dateFormat.parse(date);
			
			
			String day=new SimpleDateFormat("dd").format(expectedDate);
			String month=new SimpleDateFormat("MMMM").format(expectedDate);
			String year=new SimpleDateFormat("yyyy").format(expectedDate);
			String expectedMonthYear=month+ " "+year;
			System.out.println("Exp month year:"+expectedMonthYear);
			while(true)
			{
				String displayDate=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
				if(expectedMonthYear.equals(displayDate))
				{
					driver.findElement(By.xpath("//a[text()="+day+"]")).click();
					break;
					}else if(expectedDate.compareTo(currentDate)>0)
					{
						driver.findElement(By.xpath("//span[text()='Next']")).click();
					Thread.sleep(1000);
					}
					else
					{
						driver.findElement(By.xpath("//span[text()='P              rev']")).click();
						Thread.sleep(1000);

						
					}
			}
			
		}
		catch (ParseException e) {
		      e.printStackTrace();
		
		
	}
	}

}

