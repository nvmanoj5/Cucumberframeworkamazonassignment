package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomepage {
	
	WebDriver driver;
	WebDriverWait wait;

	public AmazonHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBOX;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	
	public void searchBOX(String productName) throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(searchBOX));
		searchBOX.clear();
		searchBOX.sendKeys(productName);
	}
	
	public void searchButton() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
	}
	
	
	


}
