package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static helpers.WebActions.click;
import static ui.CreditoPNUI.*;


public class EntrarCreditoPNTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
       // actor.attemptsTo(Click.on(CLIC_CREDITO), Click.on(CLIC_PERSONA_NATURAL));
        actor.attemptsTo(Click.on(CLIC_CREDITO));
        click(getlocalizadorListCredito("CPN"));
    }

    public static Performable ingresarcreditoPN() {
        return Tasks.instrumented(EntrarCreditoPNTask.class);

    }
}
