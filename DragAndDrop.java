package Week5Day5Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the driver and setup the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("http://www.leafground.com/pages/drag.html");
		//Maximize
		driver.manage().window().maximize();
		//Store element
		WebElement element = driver.findElement(By.id("draggable"));
		//drag and drop 
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(element, 100, 100).perform();
		


	}

}
