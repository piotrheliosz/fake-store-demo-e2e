import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public ElementsCollection sections() {
        return $$("#main section");
    }

    public SelenideElement sectionsByName(String name) {
        String xpath = String.format("//*[@id='menu-menu']//a[contains(text(),'%s')]", name);
        return $(By.xpath(xpath));
    }
}
