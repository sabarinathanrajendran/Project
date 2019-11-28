package org.toto.com;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class Drop {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prithivi\\Desktop\\sabari\\Dropdown\\lib\\drive\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	//
		//
		//WebElement  sel=driver.findElement(By.id("day"));
		//Select s=new Select(sel);
	//s.selectByValue("1");
		//java.util.List<WebElement> op = s.getOptions();
		//System.out.println(op.size());
		WebElement  sel=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions  acc=new Actions(driver);
		acc.moveToElement(sel).perform();
		 //to check
		
		
	WebElement  sel1=driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		Actions n=new Actions(driver);
		n.moveToElement(sel1).perform();
		WebElement  sel2=driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		
		n.moveToElement(sel2).perform();
		sel2.click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
