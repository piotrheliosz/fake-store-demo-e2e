import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopPage extends Page{

    public SelenideElement header() {
        return $("#main > header > h1");
    }

    public ElementsCollection categories() {
        return $$("#main ul >li");
    }

    public SelenideElement categoriesByName(String name) {
        String xpath = String.format("//*[@id='main']//*[contains(text(),'%s')]", name);
        return $(By.xpath(xpath)).parent();
    }
}
