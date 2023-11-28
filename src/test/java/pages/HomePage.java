package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class HomePage extends BasePage {

    private By msgWelcome = By.cssSelector("div[role=\"alert\"]");

    public String validarMensagemWelcome() {
        waitElementVisible(msgWelcome, 5);
        return driver.findElement(msgWelcome).getText();
    }
}
