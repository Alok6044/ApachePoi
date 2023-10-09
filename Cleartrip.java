package clearpaytm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
//this is selenium program

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step1 : Launch The Browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.cleartrip.com/");
		//Step 2: Click The TextBox of New Delhi
		WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]"));
		from.click();
		from.sendKeys("del");
		// Step 3: Pick the Airport Name(Delhi)
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='airportList']//li"));
	    for (WebElement ListItem : list) 
		{
			if(ListItem.getText().contains("IN - Indira Gandhi Airport (DEL)"))
			{
				ListItem.click();
				break;
			}
		}
		//Step 4: Pick The Airport Name (Chandigarh)
		WebElement where = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		where.click();
	    where.sendKeys("chan");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Chandigarh, IN - Chandigarh (IXC)']")).click();
		//step 5:handle the travel date of 26,july.
		datepicker.calendardate(driver);
		
		//Step 6: Click The Search Flight Button
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
		//step 7: fetch the price
		WebElement data = driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[1]/div[1]/div/div/div/div[2]/div"));
		String value=data.getText();
		System.out.println(value);
		WebElement data1 = driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div"));
		String value1=data1.getText();
		System.out.println(value1);
				
		}
		}




