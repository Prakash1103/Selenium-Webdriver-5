package Week5Day5Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the Driver and setup the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("https://jqueryui.com/resizable");
		//maximize
		driver.manage().window().maximize();
		
		//switchTo frame
		WebElement element2 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(element2);
		
		//Perform Re sizable
		WebElement element = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']/following-sibling::div[1]"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(element, 15,20).release().perform();
	}

}
