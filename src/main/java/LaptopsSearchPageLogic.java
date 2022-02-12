public class LaptopsSearchPageLogic extends LaptopsSearchPageElements {

    public LaptopsSearchPageLogic addFirstProductToCart() {
        buyFirstProductBtn.click();
        return this;
    }

    public LaptopsSearchPageLogic checkCounterInCartPopup(int size) {
        cartCounterBtn.innerText().trim();
        cartCounterBtn.equals(size);
        return this;
    }

    public LaptopsSearchPageLogic openCart() {
        cartCounterBtn.click();
        return this;
    }

    public boolean checkProductInCart() {
        String titleOfProductInCart = titleProductInCartPopup.innerText().trim();
        return titleOfProductInCart.equals(titleOfFirstProductOnSearchPage.innerText().trim());
    }
}
