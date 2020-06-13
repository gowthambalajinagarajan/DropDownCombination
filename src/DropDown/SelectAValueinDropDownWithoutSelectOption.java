package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SelectAValueinDropDownWithoutSelectOption {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/s?k=mobile&i=electronics&ref=nb_sb_noss_2");
	driver.manage().window().maximize();
	
	String input="Price: High to Low";
	WebElement ele=driver.findElement(By.id("a-autoid-0-announce"));
	ele.click();
	
	List<WebElement> AllOpt=ele.findElements(By.xpath("//*[@class='a-dropdown-item']"));
		for(WebElement b:AllOpt) {
			System.out.println(b.getText());
			if(b.getText().equals(input)) {
				b.click();
				break;
			}
		}
	
}
}