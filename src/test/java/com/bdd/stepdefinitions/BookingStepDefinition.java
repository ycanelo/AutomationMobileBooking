package com.bdd.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.bdd.steps.BookingSteps;
import org.junit.Assert;

import java.awt.print.Book;

public class BookingStepDefinition {
    @Steps
    private BookingSteps bookingSteps;

    @Given("cargo el aplicativo de Booking")
    public void cargoElAplicativoDeBooking(){
        bookingSteps.cargoAplicativoBooking();
    }

    @And("valido que se muestra la pantalla del Home")
    public void validoQueSeMuestraLaPantallaDelHome() {
        Assert.assertTrue("No se muestra el Home", bookingSteps.validarHomeBooking());
    }

    @When("ingreso el destino {string}")
    public void ingresoElDestino(String sDestino) {
        bookingSteps.ingresarDestino(sDestino);

    }

    @And("selecciono las fechas de reserva {string} y {string}")
    public void seleccionoLasFechasDeReserva(String sFechaInicio, String sFechaFin) {
        bookingSteps.seleccionarFechas(sFechaInicio, sFechaFin);
    }

    @And("selecciono la cantidad de habitaciones {string} y de personas adultas {string}")
    public void seleccionoLaCantidadDeHabitacionesYDePersonasAdultas(String nHabitaciones, String nAdultos) {
        bookingSteps.seleccionoNroHabitacionesyNroAdultos(nHabitaciones,nAdultos);
    }

    @And("selecciono la cantidad de ninos {string} de edad {string}")
    public void seleccionoLaCantidadDeNinosDeEdad(String nNinos, String nEdad) {
        bookingSteps.seleccionoNroNinosDeEdad(nNinos,nEdad);
    }

    @And("doy clic en el boton Buscar")
    public void doyClicEnElBotonBuscar() {
        Assert.assertTrue("No se muestra el Home", bookingSteps.validarHomeBooking());
        bookingSteps.clicEnBotonBuscar();
    }

    @And("valido los resultados de busqueda")
    public void validoLosResultadosDeBusqueda() {
        Assert.assertTrue("No se muestran los resultados de busqueda", bookingSteps.validarResultados());
    }

    @And("selecciono el item {string} de los resultados")
    public void seleccionoElItemDeLosResultados(String nItem) {
        bookingSteps.seleccionoItemDeLosResultados(nItem);
    }

    @And("elijo la habitación y selecciono la opcion de reserva {string}")
    public void elijoLaHabitaciónYSeleccionoLaOpcionDeReserva(String sOpcionReserva) {
        bookingSteps.seleccionoOpcionReserva(sOpcionReserva);
    }

    @And("completo los datos de formulario y continuo el flujo nombre {string} apellido {string} email {string} pais {string} y celular {string}")
    public void completoLosDatosDeFormularioYContinuoElFlujo(String sNombre, String sApellido, String sEmail, String sPais, String sCelular) {
        bookingSteps.completoFormulario(sNombre, sApellido, sEmail, sPais, sCelular);
    }

    @And("verifico los datos de reserva")
    public void verificoLosDatosDeReserva() {
        bookingSteps.validoReserva();
    }

    @And("ingreso los datos de tarjeta con numero {string} y fecha caducidad {string}")
    public void ingresoLosDatosDeTarjetaConNumeroYFechaCaducidad(String sNroTarjeta, String fechaCaducidad) {
        bookingSteps.ingresoDatosDeTarjetadePago(sNroTarjeta,fechaCaducidad );
    }

    @And("doy clic en el boton Reservar")
    public void doyClicEnElBotonReservar() {
        bookingSteps.doyClicEnReserva();
    }

    @Then("valido el mensaje de reserva exitosa")
    public void validoElMensajeDeReservaExitosa() {
        bookingSteps.validoReservaExitosa();
    }

    @Then("valido el mensaje de busqueda sin resultados")
    public void validoElMensajeDeBusquedaSinResultados() {
        bookingSteps.validoBusquedaSinResultados();
    }

    @Then("valido que se mantiene en la pantalla de Tarjeta de pago")
    public void validoQueSeMantieneEnLaPantallaDeTarjetaDePago() {
        Assert.assertTrue("No se muestra pantalla Tarjeta de pago", bookingSteps.validoPantallaTarjetaDePago());
    }

    @Then("valido que se mantiene en la pantalla Introducir datos")
    public void validoQueSeMantieneEnLaPantallaIntroducirDatos() {
        Assert.assertTrue("No se muestra pantalla Introducir datos", bookingSteps.validoPantallaFormulario());
    }
}
