package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsDetailPage {
	
	WebDriver driver;
	WebDriverWait wait;

	public ProductsDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy(xpath ="//a[@id='hlb-view-cart-announce']")
	WebElement cart;
	
	public void cart() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
	}

}
