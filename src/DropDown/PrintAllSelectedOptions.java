package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class PrintAllSelectedOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("coffee2"));
		Select a=new Select(ele);
		a.selectByValue("honey");
		a.selectByValue("cream");
		List<WebElement> Allopt=a.getAllSelectedOptions();
			for(WebElement b:Allopt) {
				System.out.println(b.getText());
			}
			
	}
}
