import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloSuresh {

	public static void main(String[] args)
	{
		System.out.println("Welcome to automation testing......Mr................");
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\workSpace4Automation\\BasicPractice\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		 driver.get(URL);
	}
	 
	
}
