package com.TestClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hetlperutil.LoadBrowserUtil;
import com.modelclasses.LoginPageModel;

//sikuli(image based testing)
//highreports listner
//sitrlistner 
@Listeners(com.hetlperutil.TestListners.class)
public class ParellelTest {
	private WebDriver driver;
	private String filePath = "E:\\selenium\\chromedriver_win32\\Test.xlsx";
	private String propertyFile = "E:\\selenium\\FlipcartTesting\\Input.properties";
	private FileInputStream fileInput = null;
	private LoadBrowserUtil browser = new LoadBrowserUtil("chrome", "https://www.flipkart.com/");
	private String pass;
	private String email;

	@Test
	public void validate() throws IOException, InterruptedException {
		File file = new File(propertyFile);

		try {
			fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileInput);
			pass = prop.getProperty("password");
			email = prop.getProperty("Email");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		driver = browser.loadBrowser();
		LoginPageModel loginPage = PageFactory.initElements(driver, LoginPageModel.class);
		loginPage.getLogin(email, pass);

	}

	@Test
	public void facebookValidate() {
		driver = browser.loadBrowser();
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void gmailValidate() {
		driver = browser.loadBrowser();
		driver.get("http://www.gmail.com/");

	}
}
