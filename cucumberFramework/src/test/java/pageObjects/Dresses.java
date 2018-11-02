package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dresses  {





    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public static WebElement first_item_ho0ver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    public static WebElement get_product_name;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
    public static WebElement second_item_ho0ver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
    public static WebElement get_second_product_name;
    
    
    

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    public static WebElement add_Top_Card_click;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]//*[@title='Proceed to checkout']")
    public static WebElement proceed_checkout_click;

    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']//*[@title='Continue shopping']")
    public static WebElement continue_shopping;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li")
    public static WebElement list_of_products;

    @FindBy(how = How.XPATH, using = "//a[@title='View my shopping cart']")
    public static WebElement go_to_card;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']//span[text()='More']")
    public static WebElement click_onMore;
    
    @FindBy(how = How.XPATH, using = "//a[@class='add_to_compare']")
    public static WebElement add_to_compare;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]/a")
    public static WebElement add_to_compare2;
    
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']//button[@type='submit']")
    public static WebElement go_to_compare;
    
    @FindBy(how = How.XPATH, using = "//*[@id='product_comparison']")
    public static WebElement compare_table;
    
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']//span[@class='price product-price']")
    public static WebElement price;
    
  //*[@id="center_column"]//span[@class='price product-price']

}
