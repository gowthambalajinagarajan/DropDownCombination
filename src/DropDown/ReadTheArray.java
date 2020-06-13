package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadTheArray {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String a[]= {"India,USA,China"};
		WebElement ele=driver.findElement(By.className(""));
		Select b=new Select(ele);
		for(int i=0;i<a.length;i++) {
			b.selectByVisibleText(a[i]);
		}
	}
}
