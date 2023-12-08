package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ButtonWebeElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class ButtonFunctionalities {
	public WebDriver driver;
	public ButtonWebeElements bw;
	
	@Given("User launch the Chrome browser")
	public void user_launch_the_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}

	@When("User enter the URL {string}")
	public void user_enter_the_url(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
	  
	}

	@Then("Page title should be printed {string}")
	
	public void page_title_should_be_printed(String title) {
		
		driver.getTitle();
		System.out.println(title);
		
	}
	@Then("User click on the radio button")
	public void user_click_on_the_radio_button() {
		bw.RadioFunction();   
	}

	@Then("User send the country values in the countries tab")
	public void user_send_the_country_values_in_the_countries_tab() {
		bw.Textboxfield("India");
	}

	@Then("User Select the dropdown fields")
	public void user_select_the_dropdown_fields() {
		bw.dropdowns();
	    
	}

	@Then("User Click on the checkbox")
	public void user_click_on_the_checkbox() {
		bw.checkbox();
	   
	}
	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}




}
