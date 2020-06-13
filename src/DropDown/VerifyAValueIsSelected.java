package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class VerifyAValueIsSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		String input="whipped";
		boolean flag=false;
		WebElement ele=driver.findElement(By.name("coffee2"));
		Select a=new Select(ele);
		a.selectByValue("milk2");
		
		List<WebElement> AllSel=a.getAllSelectedOptions();
			for(WebElement b:AllSel) {
				if(b.getText().equals(input)) {
					System.out.println("Selected");
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Not Selected");
			}
}
}