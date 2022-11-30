/**
 * 
 */
package com.dcpl.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dcpl.actiondriver.Action;

/**
 * @author USER
 *
 */
public class ConfirmOrderPage extends Action{

	public ConfirmOrderPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h3[normalize-space()='Order Confirm']")
	private WebElement orderConfirmText;
	
	public String verifyOrderConfirmPageText() {
		
		String actText = orderConfirmText.getText();
		return actText;
	}
}
