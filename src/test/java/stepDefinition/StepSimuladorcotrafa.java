package stepDefinition;

import helpers.Constant;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.ValidarTituloSimulador;
import task.Abrir;
import task.BuscarTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepSimuladorcotrafa {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario ingresa al sitio web de Cotrafa")
    public void elUsuarioIngresaAlSitioWebDeCotrafa() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Abrir.navegadorWebURL());
    }
    @Cuando("se introduce la palabra de busqueda simulador")
    public void seIntroduceLaPalabraDeBusquedaSimulador() {
       theActorCalled(Constant.MR_ROBOT).attemptsTo(BuscarTask.simulador());
    }
    @Entonces("el sistema debe direccionar al usuario a la pantalla de simulador Cotrafa y verificar que se encuentra allí")
    public void elSistemaDebeDireccionarAlUsuarioALaPantallaDeSimuladorCotrafaYVerificarQueSeEncuentraAllí() {
       theActorInTheSpotlight().should(seeThat(ValidarTituloSimulador.validacionExitosa()));
    }




}
