package com.hetlperutil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

public class LoadBrowserUtil {

	static String bName;
	static String url;

	static WebDriver driver;

	public LoadBrowserUtil(String bName, String url) {

		this.bName = bName;
		this.url = url;

	}

	public static WebDriver loadBrowser() {
		if (bName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

			driver = new ChromeDriver();

		} else {
			System.out.println("Enter name of the browser");
		}

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		return driver;

	}
}
