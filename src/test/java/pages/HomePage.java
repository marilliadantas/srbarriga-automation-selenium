package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class HomePage extends BasePage {

    private By msgWelcome = By.cssSelector("div[role=\"alert\"]");
    private By btn_sair = By.linkText("Sair");
    private By linkContas = By.linkText("Contas");
    private By btn_adicionar = By.linkText("Adicionar");
    private By btn_listar = By.cssSelector("a[href=\"/contas\"]");
    private By linkCriarMovimentacao = By.cssSelector("a[href=\"/movimentacao\"]");

    public String validarMensagemWelcome() {
        waitElementVisible(msgWelcome, 5);
        return driver.findElement(msgWelcome).getText();
    }

    public void clicarSair(){
        clicarLink(btn_sair);
    }

    public void clicarContas(){
        clicarLink(linkContas);
    }

    public void clicarAdicionar(){
        clicarLink(btn_adicionar);
    }

    public void clicarListar(){
        clicarLink(btn_listar);
    }

    public void clicarCriarMovimentacao(){
        clicarLink(linkCriarMovimentacao);
    }
}
