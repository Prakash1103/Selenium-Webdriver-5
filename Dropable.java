package Week5Day5Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the driver and setup the path
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("http://www.leafground.com/pages/drop.html");
		//Maximize
		driver.manage().window().maximize();
		
		//store Dragable element
		WebElement source = driver.findElement(By.id("draggable"));
		
		//store dropable element
		WebElement destination = driver.findElement(By.id("droppable"));
		
		//drag and drop
	    Actions builder=new Actions(driver);
	    builder.dragAndDrop(source, destination).perform();
	    }
}
