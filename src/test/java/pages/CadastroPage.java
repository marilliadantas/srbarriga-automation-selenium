package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.ArrayList;
import java.util.List;

public class CadastroPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");
    private By txtNotificacao = By.cssSelector("div[role=\"alert\"]");

    public void preencherCamposCadastro(String nome, String email, String senha){
        preencher(inputNome, nome);
        preencher(inputEmail, email);
        preencher(inputSenha, senha);
    }

    public void clicarCadastrar() {
        clicar(btnCadastrar);
    }

    public void pressEnter() {
        pressionarEnter();
    }

    public String validarMensagem() {
        waitElementVisible(txtNotificacao, 5);
        return driver.findElement(txtNotificacao).getText();
    }

    public List<String> ListaMsgErro() {
        List<WebElement> erros =  driver.findElements(txtNotificacao);
        List<String> retorno = new ArrayList<String>();
        for (WebElement erro: erros) {
            retorno.add(erro.getText());
        }
        return retorno;
    }
}
