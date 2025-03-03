import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage extends Page {

    public SelenideElement addToCart(){
        return $(By.xpath("//*[@id='main']//a[contains(@href, 'add-to-cart')]"))
                .scrollIntoCenter();
    }

    public SelenideElement goToCart(){
        return $(By.xpath("//*[@id='main']//*[@title='Zobacz koszyk']"));
    }
}
