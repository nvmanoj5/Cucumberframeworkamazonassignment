package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartDetailPage {
	
	WebDriver driver;
	WebDriverWait wait;

	public CartDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy(xpath ="//span[@class='a-size-medium sc-product-title a-text-bold' and contains(text(),'Sony HT-S20R 5.1ch Dolby Digital Soundbar Home Theatre System (400W,Bluetooth Connectivity) - Black')]")
	WebElement checkProduct;
	
	@FindBy(xpath ="//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']//span[@class='currencyINR']")
	WebElement total;
	
	public boolean checkProduct() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(checkProduct));
		return true;
	}
	
	public boolean total() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(total));
		return true;
	}

}
