import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainHeaderPage {

    public SelenideElement image() {
        return $("#masthead img");
    }

    public ElementsCollection links() {
        return $$("#menu-menu a");
    }

    public SelenideElement searchBar() {
        return $("#woocommerce-product-search-field-0");
    }

    public SelenideElement sideHeader() {
        return $("#site-header-cart");
    }

    public SelenideElement paragraph() {
        return $("#site-header-cart  p");
    }
}
