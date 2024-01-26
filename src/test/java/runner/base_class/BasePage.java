package runner.base_class;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage() {
        driver = BaseSteps.browser;
        actions = new Actions(driver);
    }

    public void waitElementVisible(By element, int seconds) {
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void acessar(String url) {
        driver.get(url);
    }

    public void preencher(By locator, String texto){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(texto);
    }
    public void clicar(By locator){
        driver.findElement(locator).click();
    }

    public void pressionarEnter(){
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void selecionarCombo(By locator, String nome){
        WebElement element = driver.findElement(locator);
        Select combo = new Select(element);

        combo.selectByVisibleText(nome);
    }

    public void clicarLink(By locator){
        driver.findElement(locator).click();
    }

    public void clicarRadio(By locator){
        driver.findElement(locator).click();
    }

    public void clicarAlerta(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String obterValorPorTexto(By locator){
        return driver.findElement(locator).getText();
    }

    public String obterValor(By locator){
        return  driver.findElement(locator).getAttribute("value");
    }

    public boolean obterValorExistente(String texto){
        return driver.getPageSource().contains(texto);
    }

    public boolean verificarBotaoClicado(By locator){
        return driver.findElement(locator).isSelected();
    }

    public void clicarBotaoPorTexto(String texto){
        clicar(By.xpath("//button[.='"+texto+"']"));
    }

    public void limparCampo(By locator) {
        driver.findElement(locator).clear();
    }
}
