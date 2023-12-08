package JavaProgram;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class BasicProgram {

		
		
		public static void main (String[] args)
		
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!my%20trip%20booking&ef_id=:G:s&msclkid=70a3297140dc1434ce474c00f92a366e");
			driver.manage().window().maximize();
			
			List<WebElement> trip = driver.findElements(By.xpath("//div[@class='chHeaderContainer']//nav//li"));
			for (WebElement object : trip) {
				
				System.out.println(object.getText());

				
			}
			
			
		
			}
			
		
		
	 
		}

