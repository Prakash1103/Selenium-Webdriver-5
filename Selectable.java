package Week5Day5Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the driver and setup the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("http://www.leafground.com/pages/selectable.html");
		//maximize
		driver.manage().window().maximize();
		 
		//store Items
		  WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		  WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		  WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		  WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		 
		//Select required
		Actions builder=new Actions(driver);
		builder.clickAndHold(ele1).clickAndHold(ele2).clickAndHold(ele3).clickAndHold(ele4).perform();
		

	}


}
