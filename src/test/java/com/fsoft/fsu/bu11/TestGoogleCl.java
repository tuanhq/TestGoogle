package com.fsoft.fsu.bu11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestGoogleCl {
	@Test
	public void method1()	{
		WebDriver driver = new FirefoxDriver();

		// driver = new FirefoxDriver();
		driver.get("https://google.com");
		WebElement ele = driver.findElement(By.name("q"));
		ele.clear();
		ele.sendKeys("softbank");

		WebElement btnSearch = driver.findElement(By.xpath(".//*[@id='sblsbb']/button"));
		btnSearch.click();

		/*
		 * Actions actions = new Actions(driver); actions.sendKeys(Keys.CONTROL,
		 * Keys.F5);
		 * 
		 * driver.switchTo().window("");
		 */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
