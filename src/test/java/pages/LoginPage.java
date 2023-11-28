package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/login";
    private By btnNovoUsuario = By.cssSelector("a[href=\"/cadastro\"]");
    private By inputEmail = By.id("email");
    private By inputSenha= By.id("senha");
    private By btn_entrar = By.cssSelector("button[type=\"submit\"]");
    private By msgErro = By.cssSelector("div[class=\"alert alert-danger\"]");

    public void validaPaginaLogin() {
        driver.get(url);
    }

    public void preencherEmail(String email){
        preencher(inputEmail, email);
    }

    public void preencherSenha(String senha){
        preencher(inputSenha, senha);
    }

    public void clicarEntrar(){
        clicar(btn_entrar);
    }

    public void clicarNovoUsuario(){
        clicarLink(btnNovoUsuario);
    }

    public String validaMensagemErro(){
        waitElementVisible(msgErro, 5);
        return driver.findElement(msgErro).getText();
    }

    public List<String> ListaMsgErro() {
        List<WebElement> erros =  driver.findElements(msgErro);
        List<String> retorno = new ArrayList<String>();
        for (WebElement erro: erros) {
            retorno.add(erro.getText());
        }
        return retorno;
    }
}
