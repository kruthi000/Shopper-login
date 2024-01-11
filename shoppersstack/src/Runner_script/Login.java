package Runner_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_script.Base_test;
import POM_script.POM1;

public class Login extends Base_test
{
  @Test
  public void log()
  {
	  POM1 p=new POM1(driver);
	  p.login();
	  p.admin();
	  p.create();
	  p.FN("Khushi");
	  p.LN("Prasanth");
	  p.gender();
	  p.number("9876543210");
	  p.mailID("khushi123@gmail.com");
	  p.createpwd("Khushi@123");
	  p.confirmpwd("Khushi@123");
	  p.clickcountry();
	  WebElement ele = driver.findElement(By.id("India"));
	  ele.click();
	  WebElement ele1 = driver.findElement(By.id("Tamil Nadu"));
	  ele1.click();
	  WebElement ele2 = driver.findElement(By.id("Chennai"));
	  ele2.click();
	  p.clickregister();
  }
}
