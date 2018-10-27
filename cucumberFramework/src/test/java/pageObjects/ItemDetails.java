package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemDetails {

    @FindBy(how = How.XPATH,using = ("//*[@id='add_to_cart']//span[text()='Add to cart']"))
    public static WebElement add_to_card_product_Page;
}
