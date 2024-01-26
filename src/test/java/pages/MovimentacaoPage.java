package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.ArrayList;
import java.util.List;

public class MovimentacaoPage extends BasePage {

    private By inputTipoMovimentacao = By.cssSelector("#tipo");
    private By optionDespesa = By.cssSelector("option[value=\"DESP\"]");
    private By inputDataMovimentacao = By.cssSelector("#data_transacao");
    private By inputDataPagamento = By.cssSelector("#data_pagamento");
    private By inputDescricao = By.cssSelector("#descricao");
    private By inputInteressado = By.cssSelector("#interessado");
    private By inputValor = By.cssSelector("#valor");
    private By inputConta = By.cssSelector("select[id=\"conta\"]");
    private By radioPago = By.cssSelector("#status_pago");
    private By radioPendente = By.cssSelector("#status_pendente");
    private By btnSalvar = By.cssSelector("button[class=\"btn btn-primary\"]");
    private By msgAlert = By.cssSelector("div[role=\"alert\"]");
    private By comboAlert = By.cssSelector("div[class=\"alert alert-danger\"]");

    public void inserirDataMovimentacao(){
        preencher(inputDataMovimentacao, "10/01/2023");
    }

    public void inserirDataPagamento(){
        preencher(inputDataPagamento, "11/01/2023");
    }

    public void inserirDescricao(){
        preencher(inputDescricao, "Aluguel");
    }

    public void inserirInteressado(){
        preencher(inputInteressado, "Sr. Barriga");
    }

    public void inserirValor(){
        preencher(inputValor, "1300");
    }

    public void inserirValorInvalido(){
        preencher(inputValor, "jfhaskj#@#!@");
    }

    public void clicarPago(){
        clicarRadio(radioPago);
    }

    public void clicarPendente(){
        clicarRadio(radioPendente);
    }

    public void clicarBotaoSalvar(){
        clicar(btnSalvar);
    }

    public String validaMsg(){
        waitElementVisible(msgAlert, 5);
        return obterValorPorTexto(msgAlert);
    }

    public void clicarTipoMovimentacao(){
        clicar(inputTipoMovimentacao);
    }

    public void clicarDespesa(){
        clicar(optionDespesa);
    }

    public List<String> ListaMsgErro() {
        List<WebElement> erros = driver.findElements(comboAlert);
        List<String> retorno = new ArrayList<String>();
        for (WebElement erro : erros) {
            retorno.add(erro.getText());
        }
        return retorno;
    }
}
