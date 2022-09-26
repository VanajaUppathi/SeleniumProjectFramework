package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	
     public ProductPage(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
     
     @FindBy(xpath="//a[@class='ico-logout']")
     private WebElement logout;
     
     @FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[1]/a")
     private WebElement computers;
     
     @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a")
     private WebElement notebooks;
     
     @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")
     private WebElement macbook;
     
     @FindBy(id="add-to-cart-button-4")
     private WebElement addtoCart;
     
     public WebElement logout() {
    	 return logout;
     }
     
     
     
     public  WebElement computers(){
    	 return computers;
     }
     
     public  WebElement notebooks(){
    	 return notebooks;
     }
     
     public  WebElement macbook(){
    	 return macbook;
     }
     
     public WebElement addtoCart() {
    	 return addtoCart;
     }
     
}
