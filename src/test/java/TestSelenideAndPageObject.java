import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSelenideAndPageObject {
    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

//    1.Открыть https://rozetka.com.ua/
//    2.Перейти в раздел «Компьютеры и ноутбуки»
//    3.Перейти в раздел « Ноутбуки»
//    4.Добавить первый товар в корзину
//    5.Проверить что в корзину добавился один товар
//    6.Перейти в корзину и проверить, что добавился правильный товар

    @Test
    public void selenidePOTest() {

        new MainPageLogic().clickOnLaptopsAndComputersCategory()
                .clickOnLaptopsCategory()
                .addFirstProductToCart()
                .checkCounterInCartPopup(1)
                .openCart();
        Assert.assertTrue(new LaptopsSearchPageLogic().checkProductInCart());
    }
}
