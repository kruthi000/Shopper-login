package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	@FindBy(id="c")
	private WebElement loginbtn;
	
	@FindBy(xpath="//button[@id='vertical-tab-2']")
	private WebElement Admin;
	
	@FindBy(xpath="//button[@id='Create Account']")
	private WebElement createAcc;
	
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='Female']")
	private WebElement Gender;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNo;
	
	@FindBy(xpath="//input[@id='Email Address']")
	private WebElement emailID;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement setPWD;
	
	@FindBy(xpath="//input[@id='Confirm Password']")
	private WebElement confirmPWD;
	
	@FindBy(id="Country")
	private WebElement country;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="Register")
	private WebElement register;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement Pwd;
	
	
	@FindBy(id="Login")
	private WebElement log;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	public void admin() 
	{
	   Admin.click();
	}
	public void create() 
	{
	   createAcc.click();
	}
	public void FN(String Fname) 
	{
	   firstName.sendKeys(Fname);
	}
	public void LN(String Lname) 
	{
	   lastName.sendKeys(Lname);
	}
	public void gender() 
	{
	   Gender.click();
	}
	public void number(String no) 
	{
		phoneNo.sendKeys(no);
	}
	public void mailID(String id) 
	{
		emailID.sendKeys(id);
	}
	
	public void createpwd(String pwd) 
	{
		setPWD.sendKeys(pwd);
	}
	public void confirmpwd(String pwd) 
	{
		confirmPWD.sendKeys(pwd);
	}
	
	public void clickcountry() 
	{
		country.click();
	}
	public void clickstate() 
	{
		state.click();
	}
	public void clickcity() 
	{
		city.click();
	}
	public void clickregister() 
	{
		register.click();
	}
	
	
    /*public void emailId(String UN)
    {
    	Email.sendKeys(UN);
    }
    public void passPwd(String pwd)
	{
		Pwd.sendKeys(pwd);
	}
    
    public void loginbtn()
	{
		log.click();
	}*/

	
}
