package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.SimuladorcotrafaUI.TEXTO_TITULO_PAGINA;

public class ValidarTituloCreditoPN implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXTO_TITULO_PAGINA, isVisible()).forNoMoreThan(10).seconds());
        return true;
    }

    public static ValidarTituloCreditoPN tituloCreditoEstaPresente() {
        return new ValidarTituloCreditoPN ();


    }
}
