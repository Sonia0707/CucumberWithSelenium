package test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertEquals;
import static p1.Clase.Dormir;
import static steps.StepsClase.*;
import static steps.StepsClase.divTexto;

public class TestP1 {

    @Given("Open Chrome and run the application.")
    public void open_chrome_and_run_the_application() {
        //Abriendo con el chromeDriver de Selenide:
        SelenideConfig config = new SelenideConfig();

        config.baseUrl("https://www.google.com/");

        Selenide.open(config.baseUrl());
        config.startMaximized(true);

    }

    @When("I click on the button to accept cookies")
    public void iClickOnTheButtonToAcceptCookies() {
        Selenide.sleep(1000);
        ClickAceptar();
        Selenide.sleep(1000);



    }
    @Then("I hit click on the login button")
    public void iHitClickOnTheLoginButton() {
        ClickSesion();
        assertEquals("Iniciar sesión",divTexto());
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
