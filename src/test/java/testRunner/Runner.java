package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/Escenarios.feature"},
        glue={"test"},
        plugin = {"pretty","html:target/prueba.html"}, monochrome = true)

public class Runner {
}
