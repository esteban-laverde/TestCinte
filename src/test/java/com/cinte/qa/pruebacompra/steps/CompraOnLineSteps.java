package com.cinte.qa.pruebacompra.steps;

import com.cinte.qa.pruebacompra.drivers.OwnWebDriver;
import com.cinte.qa.pruebacompra.questions.ElMensaje;
import com.cinte.qa.pruebacompra.tasks.AgregarProductos;
import com.cinte.qa.pruebacompra.tasks.EscogerProductos;
import com.cinte.qa.pruebacompra.tasks.FinalizarCompra;
import com.cinte.qa.pruebacompra.utils.Selenium;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraOnLineSteps {

    @Given("^abro la aplicacion$")
    public void abro_la_aplicacion() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Esteban Laverde");
        theActorInTheSpotlight().can(BrowseTheWeb
                .with(OwnWebDriver.withChrome()
                        .setURL(Selenium.parameters().getProperty("url"))));

    }

    @When("^escojo un producto o productos que quiero comprar$")
    public void escojo_un_producto_o_productos_que_quiero_comprar() {
        theActorInTheSpotlight().attemptsTo(EscogerProductos.aComprar());
    }

    @When("^los agrego al carrito para finalizar la compra$")
    public void los_agrego_al_carrito_para_finalizar_la_compra() {
        theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarro());
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.delProducto());
    }

    @Then("^el sistema me debe mostrar mensaje (.*)$")
    public void el_sistema_me_debe_mostrar_que_la_compra_ha_sido_exitosa(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElMensaje.es(), Matchers.equalTo(mensaje)));

    }




}
