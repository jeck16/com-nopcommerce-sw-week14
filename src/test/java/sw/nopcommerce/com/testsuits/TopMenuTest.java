package sw.nopcommerce.com.testsuits;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sw.nopcommerce.com.pages.HomePage;
import sw.nopcommerce.com.testbase.BaseTest;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Electronics");
        verifyTwoStrings("Electronics", By.xpath("//h1[contains(text(),'Electronics')]"));
    }
}
