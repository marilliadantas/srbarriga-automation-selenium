# Projeto - Selenium, Java & Cucumber

- Este projeto visa automatizar testes no site Sr. Barriga utilizando Selenium WebDriver em conjunto com Java e Cucumber. O Sr. Barriga é uma aplicação web fictícia utilizada para práticas de automação de testes.

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")

## Arquitetura:
```
.
├── README.md
├── pom.xml
└── src
    └── test
        ├── java
        │   ├── pages
        │   │   ├── CadastroPage.java
        │   │   ├── ContasPage.java
        │   │   ├── HomePage.java
        │   │   ├── LoginPage.java
        │   │   └── MovimentacaoPage.java
        │   ├── runner
        │   │   ├── base_class
        │   │   │   ├── BasePage.java
        │   │   │   └── BaseSteps.java
        │   │   └── support
        │   │       └── BrowserFactory.java
        │   └── Steps
        │       ├── CadastroSteps.java
        │       ├── ContaSteps.java
        │       ├── HomeSteps.java
        │       ├── Hooks.java
        │       ├── LoginSteps.java
        │       └── MovimentacaoSteps.java
        └── resources
            ├── features
            │   ├── Cadastro.feature
            │   ├── Contas.feature
            │   ├── Home.feature
            │   ├── Login.feature
            │   └── Movimentacao.feature
```

Neste projeto foram utilizadas 4 bibliotecas:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "selenium-java")
- [junit](https://mvnrepository.com/artifact/junit/junit "junit")
- [cucumber-java](https://mvnrepository.com/artifact/info.cukes/cucumber-java "cucumber-java")
- [cucumber-junit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit "cucumber-junit")