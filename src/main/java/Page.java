import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Page {

    public SelenideElement navigatorLink() {
        return $(".storefront-breadcrumb nav a");
    }
}
