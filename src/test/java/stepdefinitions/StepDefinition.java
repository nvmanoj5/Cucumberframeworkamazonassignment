package stepdefinitions;

import java.util.ArrayList;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.AmazonHomepage;
import pagefactory.CartDetailPage;
import pagefactory.ProductResultsPage;
import pagefactory.ProductsDetailPage;
import utility.BrowserUtility;
import utility.PropertiesFileReader;

public class StepDefinition extends utility.BrowserUtility{

	public WebDriver driver;
	WebDriverWait wait = null;
	
	AmazonHomepage amazonhomepage;
	ProductResultsPage productresultspage;
	ProductsDetailPage productsdetailPage;
	CartDetailPage cartdetailPage;
	
	PropertiesFileReader obj = new PropertiesFileReader();

	public StepDefinition()
	{
		driver=Hooks.driver;
	}
	
	@Given("Open the Amazon Website")
	public void open_the_Amazon_Website() throws Exception {
		
		System.out.println("Open the  application");

		Properties properties = obj.getProperty();
		driver = BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"),
				properties.getProperty("browser.baseURL"));
	}

	@When("Search for the product {string} and click the desired product")
	public void search_for_the_product_and_click_the_desired_product(String productName) throws Exception {
	    
		amazonhomepage = new AmazonHomepage(driver);
		amazonhomepage.searchBOX(productName);
		amazonhomepage.searchButton();
		
		productresultspage = new ProductResultsPage(driver);
		productresultspage.product();
		
	}

	  @When("Check the availability as In stock") public void
	  check_the_availability_as_In_stock() throws InterruptedException {
		  
		  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs2.get(1));
	  
		  Assert.assertTrue(productresultspage.instock());
		  
	  }
	  
	  @When("Add a quantity {string} and click Add to cart") public void 
	  add_a_quantity_and_click_Add_to_cart(String quantity) throws InterruptedException {
		 
		  productresultspage.Quantity(quantity);
		  productresultspage.addToCart();
	  }
	  
	  @Then("Go to the cart page and check the product names and total prices") public void 
	  go_to_the_cart_page_and_check_the_product_names_and_total_prices() throws Exception {
		  
/*		  cartdetailPage = new CartDetailPage(driver);
		  
		  Assert.assertTrue(cartdetailPage.checkProduct());
		  Assert.assertTrue(cartdetailPage.total());
	  */
	  
	  }
	 

}
