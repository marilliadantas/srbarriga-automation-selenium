package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;
import java.util.concurrent.ThreadLocalRandom;

public class ContasPage extends BasePage {

    private By inputNome = By.id("nome");
    private By btnSalvar = By.cssSelector("button[class=\"btn btn-primary\"]");
    private By alertSuccess = By.cssSelector("div[class=\"alert alert-success\"]");

    int aleatorio = ThreadLocalRandom.current().nextInt(1, 1001);

    String nomeConta = "Nubank " + aleatorio;

    public void nomeConta() {
        preencher(inputNome, nomeConta);
    }

    public void clicarSalvar(){
        clicar(btnSalvar);
    }

    public String validaMsgContaCriada(){
        waitElementVisible(alertSuccess, 5);
        return driver.findElement(alertSuccess).getText();
    }
}
