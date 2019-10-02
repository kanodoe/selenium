package cl.duoc.automatizacion;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/cl/duoc/automatizacion/features",
        glue = {"cl.duoc.automatizacion.stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        })
public class TestRunner extends AbstractTestNGCucumberTests
{

}
