import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ShopPageTest extends Setup {

    private final MainPage mainPage = new MainPage();
    private final ShopPage shopPage = new ShopPage();
    private final CategoryPage categoryPage = new CategoryPage();
    private final CartPage cartPage = new CartPage();

    @Test
    public void shopPageShouldDisplayAllElements() {
        mainPage.sectionsByName("Sklep").click();
        shopPage.header().shouldHave(text("Sklep"));
        shopPage.categories().shouldHave(size(4));
        shopPage.categories().get(0).should(text("Windsurfing"));
        shopPage.categories().get(1).should(text("Wspinaczka"));
        shopPage.categories().get(2).should(text("Yoga i pilates"));
        shopPage.categories().get(3).should(text("Żeglarstwo"));
    }

    @Test
    public void shopPageLinksShouldRedirectUser() {
        mainPage.sectionsByName("Sklep").click();

        shopPage.categoriesByName("Windsurfing").click();
        webdriver().shouldHave(url(Configuration.baseUrl + "product-category/windsurfing/"));
        back();

        shopPage.categoriesByName("Wspinaczka").click();
        webdriver().shouldHave(url(Configuration.baseUrl + "product-category/wspinaczka/"));
        back();

        shopPage.categoriesByName("Yoga i pilates").click();
        webdriver().shouldHave(url(Configuration.baseUrl + "product-category/yoga-i-pilates/"));
        back();

        shopPage.categoriesByName("Żeglarstwo").click();
        webdriver().shouldHave(url(Configuration.baseUrl + "product-category/zeglarstwo/"));
        back();

        shopPage.navigatorLink().click();
        webdriver().shouldHave(url(Configuration.baseUrl));
    }

    @Test
    public void userShouldAddProduct() {
        Assumptions.assumeFalse(true, "Not finished");

        open("product-category/wspinaczka/");

        categoryPage.addToCart().click();
        categoryPage.goToCart().click();
        cartPage.goToPayment().click();
    }
}
