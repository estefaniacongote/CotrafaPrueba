package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CreditoPNUI.TEXTO_FORMULARIO_PERSONA_NATURAL;


public class ValidarTituloSimulador implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXTO_FORMULARIO_PERSONA_NATURAL, isVisible()).forNoMoreThan(10).seconds());
        return true;
    }
    public static ValidarTituloSimulador validacionExitosa(){
        return new ValidarTituloSimulador();
    }
}
