package sw.nopcommerce.com.pages;

import org.openqa.selenium.By;
import sw.nopcommerce.com.utilites.Utility;

public class SignInPage extends Utility {
    By checkoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By register = By.xpath("//button[contains(text(),'Register')]");
    By email = By.id("Email");
    By password = By.id("Password");
    By logInButton = By.xpath("//button[contains(text(),'Log in')]");
    public void clickOnCheckoutAsGuest(){
        clickOnElement(checkoutAsGuest);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public void enterEmail(String text){
        sendTextToElement(email,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void clickOnLogIn(){
        clickOnElement(logInButton);
    }
}
