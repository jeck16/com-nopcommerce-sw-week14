package sw.nopcommerce.com.pages;

import org.openqa.selenium.By;
import sw.nopcommerce.com.utilites.Utility;

public class ComputersPage extends Utility {
    By desktop = By.xpath("//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']");
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
}
