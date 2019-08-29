package com.action_class;

public class What_is_Action_Class_And_What_can_we_do_with_Action_Class 
{

	public static void main(String[] args) 
	{
		/*
		 * Selenium Actions Class:
			Selenium has the built-in ability to handle various types of keyboard and mouse events
 			In order to do action events, you need to use org.openqa.selenium.interactions Actions class. 
 			The user-facing API for emulating complex user gestures. 
 			Use the selenium actions class rather than using the Keyboard or Mouse directly. 
 			This API includes actions such as drag and drop, clicking multiple elements.
		 */

		
		// To create an object ‘action‘ of Selenium Actions class:
				
				
				//  Actions action=new Actions(driver);
				/*To focus on element using WebDriver:
		     	
				*/
		
		
		
		
			// action.moveToElement(element).perform();
			/*
			 * element is the webelement which we capture
				perform() method is used here to execute the action.
			 */
		
		
		 // To click on the element:
		 // click() method is used here to click the element.
		  /*
		   * action.moveToElement(element).click().perform();
		   * 
		   */
		
		
		// Methods Available in Selenium Actions Class:
		
				// Keyboard Events Using Selenium Actions Class API:
		
						// The Keyboard interface has the below mentioned methods:
						
							/*1.Handle Keyboard Keys using Action class.
							2.Handle Keyboard Keys using sendkeys chord.
							3.Handle Keyboard keys using Robot class.*/
						 
						
			  // Mouse Events Using Selenium Actions Class API:
		
						// The mouse interface has the below mentioned methods:
		
							/*1.click (): Simply click on element
							2.doubleClick (): Double clicks onElement
							3.contextClick() : Performs a context-click (right click) on an element
							4.clickAndHold(): Clicks at the present mouse location (without releasing)
							5.dragAndDrop(source, target): Invokes click-and-hold at the source location and moves to the location of the target element before releasing the mouse. source – element to grab, target – element to release
							6.dragAndDropBy(source, xOffset, yOffset) : Performs click-and-hold at the source location, shifts by a given offset, then frees the mouse. xOffset – to shift horizontally, yOffset – to shift vertically
							7.moveByOffset(x-offset, y-offset): Shifts the mouse from its current position (or 0,0) by the given offset. x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left), y-offset – Sets the vertical offset (negative value – shifting the mouse to the up)
							8.moveToElement(toElement): It shifts the mouse to the center of the element
							9.release(): Releases the depressed left mouse button at the existing mouse location*/
			
	}

}
