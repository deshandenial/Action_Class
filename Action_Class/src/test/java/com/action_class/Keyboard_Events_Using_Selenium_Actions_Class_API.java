package com.action_class;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events_Using_Selenium_Actions_Class_API {

	public static void main(String[] args) throws Exception {
		
		
		//Ways To Handle Keyboard Keys:
		
			/*1.Handle Keyboard Keys using Action class.
			2.Handle Keyboard Keys using sendkeys chord.
			3.Handle Keyboard keys using Robot class.*/
		
		  	
//1. Handle Keyboard Keys using Action class:
		
		
		 /*Actions Class Method for Keyboard:

			keyDown and keyUp are the main methods in KeyBoard Events in Selenium Webdriver Actions class.

			1.public Actions keyDown(Keys theKey) : Performs a modifier key press (SHIFT,Keys.ALT or Keys.CONTROL) to Handle keyDown operation.
			2.public Actions keyDown(WebElement element, Keys theKey) : Performs a modifier key press (SHIFT,Keys.ALT or Keys.CONTROL) after focusing on an element perform keyDown using WebElement.
			3.public Actions keyUp(Keys theKey) : Performs a modifier key release (SHIFT,Keys.ALT or Keys.CONTROL) to Handle keyUp operation.
			4.public Actions keyUp(WebElement element, Keys theKey) : performs a modifier key release after focusing on an element to perform keyUp operation.
			5.public Actions sendKeys(java.lang.CharSequence… keysToSend) : The key sends the active element to the key, it is actively different from calling sendKeys two passes (CharSequence…) on an active element in two ways: Modifiers are not included in this call, and no one is able to focus the element again. Do not try. Then we will send some sendKeys(Keys.TAB) to switch the elements.
			6.public Actions sendKeys(WebElement element, java.lang.CharSequence… keysToSend) : Sends keys to the given element using sendKeys.
		 */
		
		//1.public Actions keyDown(Keys theKey) :
		
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				Actions action=new Actions(driver);
				action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();*/
			
	    // 2.public Actions keyDown(WebElement element, Keys theKey) :	
		
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				WebElement element=driver.findElement(By.xpath("//input[@id='user[login]']"));
				Actions action=new Actions(driver);
				action.keyDown(element, Keys.SHIFT).sendKeys("deshanraj").build().perform();*/
		
		// 3.public Actions keyUp(Keys theKey) :
			
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				Actions action=new Actions(driver);
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				*/
				
	    // 4.public Actions keyUp(WebElement element, Keys theKey) : 
				
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				WebElement element=driver.findElement(By.xpath("//input[@id='user[login]']"));
				Actions action=new Actions(driver);
				action.keyDown(element, Keys.SHIFT).sendKeys("deshanraj").keyUp(element, Keys.SHIFT).build().perform();*/
		
		// 5.public Actions sendKeys(java.lang.CharSequence… keysToSend) :
		
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				Actions action=new Actions(driver);
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();*/
		
		// 6.public Actions sendKeys(WebElement element, java.lang.CharSequence… keysToSend) :
				
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				WebElement element=driver.findElement(By.xpath("//input[@id='user[login]']"));
				Actions action=new Actions(driver);
				action.sendKeys(element,"Deshanraj").build().perform();*/
				
// 2. Handle Keyboard Keys using sendkeys chord:
				
				// 1. Handle Single Keyboard Key using Sendkeys
				// 2. Handle multiple Keyboard keys using chord
				
				
		// 1. Handle Single Keyboard Key using Sendkeys
				
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys(Keys.ENTER);*/
				
				
		// 2. Handle multiple Keyboard keys using chord
				
				/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
				*/
				
// 3. Handle Keyboard keys using Robot class:
				
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("---disable-notification---");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.github.com");
				Robot rocls=new Robot();
				rocls.keyPress(KeyEvent.VK_CONTROL);
				rocls.keyPress(KeyEvent.VK_A);
				rocls.keyRelease(KeyEvent.VK_CONTROL);
				rocls.keyRelease(KeyEvent.VK_A);
				
	}

}
