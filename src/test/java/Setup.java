import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class Setup {

    @BeforeEach
    void setupEnv() {
        Configuration.baseUrl = "https://fakestore.testelka.pl/";
        open(Configuration.baseUrl);
    }
}
