package ui;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreditoPNUI {

    public static final Target CLIC_CREDITO = Target.the("Se hace clic en la opcion credito")
            .located(By.xpath("//a[@href='/' and contains(text(),'Crédito')] "));


    public static final Target CLIC_PERSONA_NATURAL = Target.the("Se hace clic en la opcion credito persona natural")
            .located(By.xpath("//li[@class='first expanded menu-mlid-793']//a[ @href='/content/simulador#formtype=CPN']"));

    public static final Target TEXTO_FORMULARIO_PERSONA_NATURAL = Target.the("Se hace clic en la opcion credito persona natural")
            .located(By.xpath("//h1[@id='simulatorTitle' and contains(text(),'Crédito Persona Natural')]"));

    private static WebElement localizadorListCredito(String tipoCredito) {
        String xpath = "//li[@class='first expanded menu-mlid-793']//a[@href='/content/simulador#formtype="+tipoCredito+"']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.xpath(xpath));
    }
    public static WebElement getlocalizadorListCredito(String tipoCredito) {
        return localizadorListCredito(tipoCredito);
    }

}

