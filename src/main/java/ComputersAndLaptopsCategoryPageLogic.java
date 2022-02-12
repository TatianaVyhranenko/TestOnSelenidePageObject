import static com.codeborne.selenide.Selenide.page;

public class ComputersAndLaptopsCategoryPageLogic extends ComputersAndLaptopsCategoryPageElements {

    public LaptopsSearchPageLogic clickOnLaptopsCategory() {
        laptopsCategory.click();
        return page(LaptopsSearchPageLogic.class);
    }
}
