package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ButtonWebeElements 

{
	
	WebDriver driver;
	
	public ButtonWebeElements(WebDriver rdriver)
	{
		driver=rdriver;
		
	PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(name="radioButton")
	WebElement radiobutton1;
	
	@FindBy(xpath="//input[@placeholder='Type to Select Countries']")
	WebElement textbox;
	
	@FindBy(id="dropdown-class-example")
	WebElement dropdowns;
	
	@FindBy(xpath="//label//input[@type='checkbox']")
	WebElement checkbox;
	
	
	public void RadioFunction()
	{
		radiobutton1.click();
	}
	public void Textboxfield(String country)
	{
		textbox.sendKeys(country);
	}
	public void dropdowns()
	{
		Select dropdown = new Select(dropdowns);
		dropdown.selectByIndex(1);
	    
	}
	public void checkbox()
	{
		List<WebElement> list = driver.findElements(By.xpath("//label//input[@type='checkbox']"));
		for (WebElement checkboxes : list) {
			
			checkboxes.click();
			
		}
	}
	
	
	
	
	
	
	
	
	

}
