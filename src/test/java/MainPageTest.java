import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MainPageTest extends Setup {

    private final MainPage mainPage = new MainPage();

    @Test
    public void mainPageShouldHaveAllSections() {
        Configuration.browserSize = "375x812"; // iPhone X

        mainPage.sections()
                .should(size(6))
                .forEach(section -> section.shouldBe(visible));

        mainPage.sections().get(0).shouldHave(text("Kupuj wg kategorii"));
        mainPage.sections().get(1).shouldHave(text("Nowości"));
        mainPage.sections().get(2).shouldHave(text("Popularne"));
        mainPage.sections().get(3).shouldHave(text("W promocji"));
        mainPage.sections().get(4).shouldHave(text("Bestsellery"));
        mainPage.sections().get(5).shouldHave(text("Kupuj według marki"));
    }
}
