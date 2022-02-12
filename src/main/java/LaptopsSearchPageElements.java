import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsSearchPageElements {

    SelenideElement titleOfFirstProductOnSearchPage = $(By.xpath("//span[@class='goods-tile__title']"));

    SelenideElement buyFirstProductBtn = $(By.xpath("//button[contains(@class, 'buy-button')]"));

    SelenideElement cartCounterBtn = $(By.xpath("//span[contains(@class, 'counter--green')]"));

    SelenideElement titleProductInCartPopup = $(By.xpath("//a[@class='cart-product__title']"));
}
