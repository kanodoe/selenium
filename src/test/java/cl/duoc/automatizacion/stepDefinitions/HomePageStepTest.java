package cl.duoc.automatizacion.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePageStepTest {

    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("^Que el usuario ingresa al homepage$")
    public void que_el_usuario_ingresa_al_homepage() throws Throwable {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://www.nic.cl");
    }

    @When("^Cuando la pagina termine de cargarse$")
    public void cuando_la_pagina_termine_de_cargarse() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^Entonces el titulo del homepage será el correcto$")
    public void entonces_el_titulo_del_homepage_será_el_correcto() throws Throwable {
        Assert.assertEquals(driver.getTitle(), "NIC Chile, somos el punto CL - NIC Chile");
        driver.quit();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
