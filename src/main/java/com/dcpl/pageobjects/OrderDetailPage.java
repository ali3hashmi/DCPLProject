/**
 * 
 */
package com.dcpl.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dcpl.actiondriver.Action;
import com.dcpl.base.BaseClass;

/**
 * @author USER
 *
 */
public class OrderDetailPage extends Action {

	public OrderDetailPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Order Details']")
	private WebElement orderDetailText;
	
	
	public String verifyOrderDetailText() {
		
		String odtext=orderDetailText.getText();
		return odtext;
	}
}
