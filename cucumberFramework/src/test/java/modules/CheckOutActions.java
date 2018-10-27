package modules;

import helpers.GlobalUtils;
import helpers.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.CheckOut;

import java.util.List;

public class CheckOutActions {


    public static String confirmationText;
    public static String orderRef;

    public static void proceedToCheckOut(WebDriver driver) {


        GlobalUtils.explicitWait(CheckOut.proceed_to_checkOut, driver, 10);
        GlobalUtils.clickOnEelement(CheckOut.proceed_to_checkOut);

        log.info("clicking on proceed to check out");

    }

    public static void confirmTheAddress() {

        GlobalUtils.clickOnEelement(CheckOut.proceed_to_checkOut2);

        log.info("confirming the address");

    }

    public static void confirmTheShipping() {

        GlobalUtils.clickOnEelement(CheckOut.terms_and_conditions);
        log.info("confirming terms and conditionst");
        GlobalUtils.clickOnEelement(CheckOut.proceed_to_checkOut3);
        log.info("confirming the shipping");


    }

    public static void checkOutByBankWire() {

        GlobalUtils.clickOnEelement(CheckOut.payByBank);
        log.info("checking out by bank wire");


    }

    public static void checkOutByCheck() {

        GlobalUtils.clickOnEelement(CheckOut.payByCheck);
        log.info("checking out by cheque");


    }

    public static void confirmTheOrder() {

        GlobalUtils.clickOnEelement(CheckOut.confirmOrder);
        log.info("confirming the order");

        confirmationText=GlobalUtils.getElementText(CheckOut.order_confirmation);

        log.info("getting the order confirmation message "+confirmationText);

    }

    public static void getOrderRef() throws ArrayIndexOutOfBoundsException{

        String checkoutRef=CheckOut.order_ref.getText();
        
        String[] orderRefArr=checkoutRef.split(" ");
        

        
        for( int i = 0;i<orderRefArr.length-2;i++) {
        	
        	
        	if(orderRefArr[i].contains("reference")) {
        		
        
        		
        		orderRef=orderRefArr[i+1];
        		
        				
        	}
        	
        	
        }
            
        log.info("order reference found "+orderRef);

    }

    public static void goToOrdersPage() {

        GlobalUtils.clickOnEelement(CheckOut.back_to_orders);

        log.info("going to the orders page");

    }

    public static Boolean findOrderRef(WebDriver driver) {


        Boolean orderRefPresent=false;

        List<WebElement> orderRefList=driver.findElements(By.xpath(CheckOut.ordersRefPath));

        log.info("getting all order ref in the orders page ");

        for(WebElement element: orderRefList){
            if(GlobalUtils.getElementText(element).equals(orderRef)){

                log.info("order ref found "+GlobalUtils.getElementText(element));

                orderRefPresent=true;
                break;
            }


        }


        return orderRefPresent;

    }


}
