package tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import PageObjects.LoginPage;
import PageObjects.ProductPage;
import resources.BaseClass1;

public class ProductTest extends BaseClass1 {
	
	public WebDriver driver;
	Logger log;
	
	@BeforeMethod
	public void setUp() throws IOException {
		log=LogManager.getLogger(LoginTest.class.getName());
		 
		
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@Test
	public void products() throws IOException {
		
		
		
		ProductPage product=new ProductPage(driver);
		product.computers().click();
		log.debug("Clicked on computers");
		
		product.notebooks().click();
		log.debug("Clicked on notebook");
		
		product.macbook().click();
		log.debug("Clicked on macbook");
		
		product.addtoCart().click();
		log.debug("item added to cart");
		
	}
	
	@AfterMethod
    public void tearDown() {
   	 driver.close();
    }

}
