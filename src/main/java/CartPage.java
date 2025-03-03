import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement goToPayment(){
        return $(".cart_totals  a");
    }
}
