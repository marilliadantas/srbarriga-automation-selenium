package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class MovimentacaoPage extends BasePage {

    private By inputTipoMovimentacao = By.cssSelector("select[id=\"tipo\"]");
    private By inputDataMovimentacao = By.cssSelector("#data_transacao");
    private By inputDataPagamento = By.cssSelector("#data_pagamento");
    private By inputDescricao = By.cssSelector("#descricao");
    private By inputInteressado = By.cssSelector("#interessado");
    private By inputValor = By.cssSelector("#valor");
    private By inputConta = By.cssSelector("select[id=\"conta\"]");
    private By radioPago = By.cssSelector("#status_pago");
    private By radioPendente = By.cssSelector("#status_pendente");
    private By btnSalvar = By.cssSelector("button[class=\"btn btn-primary\"]");

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

    public void selecionarConta(){

    }

    public void clicarPago(){
        clicarRadio(radioPago);
    }

    public void clicarBotaoSalvar(){
        clicar(btnSalvar);
    }
}
