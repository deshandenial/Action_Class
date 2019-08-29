package com.action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events_Using_Selenium_Actions_Class_API {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
// Mouse Events Using Selenium Actions Class API:

		
		/*1.click (): Simply click on element
		2.doubleClick (): Double clicks onElement
		3.contextClick() : Performs a context-click (right click) on an element
		4.clickAndHold(): Clicks at the present mouse location (without releasing)
		5.dragAndDrop(source, target): Invokes click-and-hold at the source location and moves to the location of the target element before releasing the mouse. source – element to grab, target – element to release
		6.dragAndDropBy(source, xOffset, yOffset) : Performs click-and-hold at the source location, shifts by a given offset, then frees the mouse. xOffset – to shift horizontally, yOffset – to shift vertically
		7.moveByOffset(x-offset, y-offset): Shifts the mouse from its current position (or 0,0) by the given offset. x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left), y-offset – Sets the vertical offset (negative value – shifting the mouse to the up)
		8.moveToElement(toElement): It shifts the mouse to the center of the element
		9.release(): Releases the depressed left mouse button at the existing mouse location*/

		
  // 1.click (): Simply click on element
		
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.github.com");
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();*/
		
 //   2.doubleClick (): Double clicks onElement
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		WebElement element=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		Actions action=new Actions(driver);
		//action.doubleClick(element).build().perform();
		// (or)
		action.moveToElement(element).doubleClick().build().perform();*/
		
		
//  3.contextClick() : Performs a context-click (right click) on an element
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
		Actions action=new Actions(driver);
		action.contextClick(element).build().perform();
		// (or)
		action.moveToElement(element).contextClick().build().perform();*/
		
		
// 4.clickAndHold(): Clicks at the present mouse location (without releasing)	
		
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action=new Actions(driver);
		action.clickAndHold(element).build().perform();
		// (or)
		action.moveToElement(element).clickAndHold().build().perform();*/
	
	
		
// 5.dragAndDrop(source, target): Invokes click-and-hold at the source location and moves to the location of the target element before releasing the mouse. source – element to grab, target – element to release
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();*/

				
// 6.dragAndDropBy(source, xOffset, yOffset) : Performs click-and-hold at the source location, shifts by a given offset, then frees the mouse. xOffset – to shift horizontally, yOffset – to shift vertically
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(source, 100, 100).build().perform();*/
		
		
// 7.moveByOffset(x-offset, y-offset): Shifts the mouse from its current position (or 0,0) by the given offset. x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left), y-offset – Sets the vertical offset (negative value – shifting the mouse to the up)
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action=new Actions(driver);
		//action.moveByOffset(200, 200).contextClick().build().perform();
		// (or)
		action.clickAndHold(source).build().perform();
		Thread.sleep(5000);
		action.moveByOffset(150, 150).release().build().perform();*/
		
// 8.moveToElement(toElement): It shifts the mouse to the center of the element
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'jQuery Mobile')]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();*/
		
// 9.release(): Releases the depressed left mouse button at the existing mouse location*/		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action=new Actions(driver);
		action.clickAndHold(source).build().perform();
		Thread.sleep(5000);
		action.moveByOffset(150, 150).release().build().perform();
		
	}

}