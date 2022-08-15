package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static ui.SimuladorcotrafaUI.*;

public class BuscarTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
   actor.attemptsTo(Enter.theValue("Simulador").into(IMPUT_BUSCADOR).thenHit(Keys.ENTER));
   actor.attemptsTo(Click.on(CLIC_SIMULADOR));


    }
    public static Performable simulador () {

        return Tasks.instrumented(BuscarTask.class);
    }

}
