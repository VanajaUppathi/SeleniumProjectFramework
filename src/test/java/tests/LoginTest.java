package tests;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObjects.LoginPage;
import PageObjects.ProductPage;
import resources.BaseClass1;

public class LoginTest extends BaseClass1 {
	
	public WebDriver driver;
	 Logger log;
	 
	 @BeforeMethod
		public void setUp() throws IOException, InterruptedException {
			
		 log=LogManager.getLogger(LoginTest.class.getName());
		 
			driver=initializeBrowser();
			log.debug("browser launched");
			
			driver.get(prop.getProperty("url"));
			log.debug("Navigate to application URL");
			Thread.sleep(3000);
			
		}
	
	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String status){
		
		LoginPage lp=new LoginPage(driver);
		lp.Login().click();
		log.debug("clicked on Login");
		//page.email().sendKeys(prop.getProperty("email"));
		//page.password().sendKeys(prop.getProperty("password"));
		
		lp.email().sendKeys(email);
		log.debug("email address is entered");
		
		lp.password().sendKeys(password);
		log.debug("Password is Entered");
		
		lp.remember().click();
		
		lp.loginButton().click();
		log.debug("clicked on Signin");
		
		ProductPage product=new ProductPage(driver);
		Assert.assertTrue(product.logout().isDisplayed());
		
		
		
	}
     @AfterMethod
     public void tearDown() {
    	 driver.close();
     }
     
     @DataProvider
     public Object[][] getLoginData() {
    	 
    	 Object[][] data= {{"ggggg@gmail.com","123456","success"}};
    	 
    	 return data;
     }
}
