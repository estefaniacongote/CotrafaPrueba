package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/creditoPN.feature"}
        , glue = {"stepDefinition"}
        , tags = " @Ingresar_simulador_cotrafa"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class TestRunnerCreditoPN {
}
