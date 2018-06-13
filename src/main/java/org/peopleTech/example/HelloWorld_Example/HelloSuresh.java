package org.peopleTech.example.HelloWorld_Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HelloSuresh {
	
	@Test
	public void mainMethod()
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
