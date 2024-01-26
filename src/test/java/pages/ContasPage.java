package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class ContasPage extends BasePage {

    private By inputNome = By.id("nome");
    private By btnSalvar = By.cssSelector("button[class=\"btn btn-primary\"]");
    private By alertSuccess = By.cssSelector("div[class=\"alert alert-success\"]");
    private By btn_editar = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span");
    private By nomeEditado = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(1)");
    private By contaPrimeiraDaLista = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(1)");
    private By btn_remover = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(2)");

//    int aleatorio = ThreadLocalRandom.current().nextInt(1, 1001);
//
//    String nomeConta = "Nubank " + aleatorio;

    public void nomeConta() {
        preencher(inputNome, "Inter");
    }

    public void clicarSalvar(){
        clicar(btnSalvar);
    }

    public String validaMsg(){
        waitElementVisible(alertSuccess, 5);
        return obterValorPorTexto(alertSuccess);
    }

    public void clicarEditar(){
        clicar(btn_editar);
    }

    public void editarNome(){
        preencher(inputNome, "C6 Bank (conta editada)");
    }

    public void clicarRemover(){
        clicar(btn_remover);
    }

    public String validaNomeContaEditada(){
        return obterValorPorTexto(nomeEditado);
    }

    public String validaPrimeiraDaLista(){
        return obterValorPorTexto(contaPrimeiraDaLista);
    }
}
