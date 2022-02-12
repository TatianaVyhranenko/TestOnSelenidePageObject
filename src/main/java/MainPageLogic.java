import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {

    public ComputersAndLaptopsCategoryPageLogic clickOnLaptopsAndComputersCategory() {
        laptopsAndComputersCategoryInSideMenu.click();
        return page(ComputersAndLaptopsCategoryPageLogic.class);
    }
}
