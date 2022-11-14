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
public class SalesHomePage extends Action{

	
	public SalesHomePage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[1]")
	private WebElement salesHomeText;
	
	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	private WebElement salesLogoutNavigation;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement salesLogout;
	
	@FindBy(xpath = "//a[normalize-space()='Home / Create Document']")
	private WebElement HomeCreateDocumentMenu;
	
	@FindBy(xpath = "//li[@class='dropdown open']//ul[@class='dropdown-menu']//li//a[contains(text(),'Search')]")
	private WebElement searchCustomerSubMenu;
	
	@FindBy(xpath = "//a[normalize-space()='Orders']")
	private WebElement ordersMenu;
	
	public String getSalesHomeText() {
		
		String salesPageHomeText = salesHomeText.getText();
		return salesPageHomeText;
	}
	
	public LoginPage salesLogout(LoginPage loginPgae) {
		
		super.click(getDriver(), salesLogoutNavigation);
		super.fluentWait(getDriver(), salesLogout, 5);
		super.click(getDriver(), salesLogout);
		//super.fluentWait(getDriver(), , 10);
		super.Alert(getDriver());
		return new LoginPage();
	}
	
	public boolean homeCreateDocumentMenuVerifcation() {
		
		return super.isDisplayed(getDriver(), HomeCreateDocumentMenu);
		//return result;
	}
	public SearchCustomerPage createNewCustomer(SearchCustomerPage searchCustomerPage) {
		
		super.click(getDriver(), HomeCreateDocumentMenu);
		//super.fluentWait(getDriver(), searchCustomer, 3);
		super.click(getDriver(), searchCustomerSubMenu);
		return new SearchCustomerPage();
		
	
	}
	
	public boolean ordersMenuVerification() {
		
		return super.isDisplayed(getDriver(), ordersMenu);
		
	}
	
	
}
