package sw.nopcommerce.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.nopcommerce.com.utilites.Utility;

public class NokiaPage extends Utility {
    By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By close = By.xpath("//span[@class = 'close']");

    public void changeQuantity(String text){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,text);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnClose(){
        clickOnElement(close);
    }
}
