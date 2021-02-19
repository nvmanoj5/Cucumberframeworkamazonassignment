package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductResultsPage {
	
	WebDriver driver;
	WebDriverWait wait;

	public ProductResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy(xpath ="//span[@class='a-size-medium a-color-base a-text-normal' and text()='Sony HT-S20R 5.1ch Dolby Digital Soundbar Home Theatre System (400W,Bluetooth Connectivity) - Black']")
	WebElement product;
	
	@FindBy(xpath ="//span[@class='a-size-medium a-color-success' and contains(text(),'In stock.')]")
	WebElement instock;
	
	@FindBy(xpath ="//select[@id='quantity']")
	WebElement Quantity;
	
	@FindBy(xpath ="//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	public void product() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(product));
		product.click();
	}
	
	public boolean instock() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(instock));
		return true;
	}
	
	public void Quantity(String quantity) throws InterruptedException {
		//Quantity.
		//Quantity.selectByVisibleText(quantity);
		
		System.out.println("quantity" +quantity);
		Select dropdown = new Select(Quantity);  
		dropdown.selectByVisibleText(quantity);

	}
	
	public void addToCart() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
	}

	

}
