package DropDown;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class PrintAllDuplicateValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		WebElement ele=driver.findElement(By.name("coffee2"));
		Select a=new Select(ele);
		List<WebElement> Allopt=a.getOptions();
		for(WebElement b:Allopt) {
			String text=b.getText();
			if(map.containsKey(text)) {
				int x=map.get(text);
				map.put(text,x+1);
			}
			else {
				map.put(text,1);
			}
		}
		Set<Entry<String,Integer>> s=map.entrySet();
		for(Entry<String,Integer> e:s) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		System.out.println(map);
	}
}