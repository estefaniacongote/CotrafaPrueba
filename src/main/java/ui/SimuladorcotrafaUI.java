package ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SimuladorcotrafaUI extends PageObject {

    public static final Target IMPUT_BUSCADOR = Target.the("Se inserta criterio de busqueda")
            .located(By.className("inputSearch"));

    public static final Target CLIC_SIMULADOR = Target.the("Se hace clic en el resultado de busqueda simulador")
            .located(By.xpath("//a[@href='/content/simulador']"));

    public static final Target TEXTO_TITULO_PAGINA = Target.the("Se valida que se encuentre en la pagina")
            .located(By.xpath("//span[@class='pageTitle']"));
}
