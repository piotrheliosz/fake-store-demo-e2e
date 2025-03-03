import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainHeaderTest extends Setup{

    private final MainHeaderPage mainHeaderPage = new MainHeaderPage();

    @Test
    public void mainHeaderShouldDisplayAllElements() {
        mainHeaderPage.image().shouldBe(visible);
        mainHeaderPage.links().shouldHave(size(6));
        mainHeaderPage.links().get(0).shouldHave(text("Strona główna"));
        mainHeaderPage.links().get(1).shouldHave(text("Sklep"));
        mainHeaderPage.links().get(2).shouldHave(text("Zamówienie"));
        mainHeaderPage.links().get(3).shouldHave(text("Koszyk"));
        mainHeaderPage.links().get(4).shouldHave(text("Moje konto"));
        mainHeaderPage.links().get(5).shouldHave(text("Lista życzeń"));
        mainHeaderPage.searchBar().shouldBe(visible);
        mainHeaderPage.sideHeader().shouldBe(visible);
        mainHeaderPage.sideHeader().hover();
        mainHeaderPage.paragraph().shouldBe(visible);
    }

    @Test
    void mainLinksShouldRedirectUser() {
        mainHeaderPage.links().get(0).click();
        webdriver().shouldHave(url(Configuration.baseUrl));
        mainHeaderPage.links().get(1).click();
        webdriver().shouldHave(url(Configuration.baseUrl+ "shop/"));
        mainHeaderPage.links().get(2).click();
        webdriver().shouldHave(url(Configuration.baseUrl+ "koszyk/"));
        mainHeaderPage.links().get(3).click();
        webdriver().shouldHave(url(Configuration.baseUrl+ "koszyk/"));
        mainHeaderPage.links().get(4).click();
        webdriver().shouldHave(url(Configuration.baseUrl+ "moje-konto/"));
        mainHeaderPage.links().get(5).click();
        webdriver().shouldHave(url(Configuration.baseUrl+ "wishlist/"));
    }
}
