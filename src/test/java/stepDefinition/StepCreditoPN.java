package stepDefinition;

import helpers.Constant;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.ValidarTituloCreditoPN;
import question.ValidarTituloSimulador;
import task.Abrir;
import task.BuscarTask;
import task.EntrarCreditoPNTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepCreditoPN {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario esta en la pantalla de simulador")
    public void queElUsuarioEstaEnLaPantallaDeSimulador() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Abrir.navegadorWebURL());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(BuscarTask.simulador());
    }
    @Cuando("hace clic en la opción credito persona natural")
    public void haceClicEnLaOpciónCreditoPersonaNatural() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(EntrarCreditoPNTask.ingresarcreditoPN());

    }
    @Entonces("el sistema debe mostrarle al usuario el formulario que corresponde a credito persona natural")
    public void elSistemaDebeMostrarleAlUsuarioElFormularioQueCorrespondeACreditoPersonaNatural() {
        theActorInTheSpotlight().should(seeThat(ValidarTituloCreditoPN.tituloCreditoEstaPresente()));
    }


}
