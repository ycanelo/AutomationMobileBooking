package com.bdd.steps;

import com.bdd.views.BookingView;

public class BookingSteps {
    BookingView bookingView;

    public void cargoAplicativoBooking() {
        System.out.println("Cargando aplicativo Booking");
    }

    public boolean validarHomeBooking() {
        boolean result = false;
        if (bookingView.validoHomeBooking()!= null){result = true;}
        return result;
    }

    public void ingresarDestino(String sDestino) {
        bookingView.ingresarDestino(sDestino);
    }

    public void seleccionarFechas(String sFechaInicio, String sFechaFin) {
        bookingView.seleccionarFechas(sFechaInicio,sFechaFin);
    }

    public void seleccionoNroHabitacionesyNroAdultos(String nHabitaciones, String nAdultos) {
        bookingView.seleccionarNroHabitacionesYNroAdultos(nHabitaciones, nAdultos);
    }

    public void seleccionoNroNinosDeEdad(String nNinos, String nEdad) {
        bookingView.seleccionarNroNinosYEdad(nNinos,nEdad);
    }

    public void clicEnBotonBuscar() {
        bookingView.clicEnBuscar();
    }

    public boolean validarResultados() {
        boolean result = false;
        if (bookingView.validoResultados()!= null){result = true;}
        return result;
    }

    public void seleccionoItemDeLosResultados(String nItem) {
        bookingView.seleccionoItemDeLosResultados(nItem);
    }

    public void seleccionoOpcionReserva(String sOpcionReserva) {
        bookingView.seleccionoOpcionDeReserva(sOpcionReserva);
    }

    public void completoFormulario(String sNombre, String sApellido, String sEmail, String sPais, String sCelular) {
        bookingView.completoFormulario(sNombre, sApellido, sEmail, sPais, sCelular);
    }

    public void validoReserva() {
        bookingView.validoReserva();
    }

    public void ingresoDatosDeTarjetadePago(String sNroTarjeta, String sFechaCaducidad) {
        bookingView.ingresoTarjetaDePago(sNroTarjeta,sFechaCaducidad);
    }

    public void doyClicEnReserva() {
        bookingView.clicEnReservar();
    }

    public void validoReservaExitosa() {
        bookingView.validoReservaExitosa();
    }

    public void validoBusquedaSinResultados() {
        bookingView.validoBusquedaSinResultados();
    }

    public boolean validoPantallaTarjetaDePago() {
        boolean result = false;
        if (bookingView.validoPantallaTipoDePago()!= null){result = true;}
        return result;
    }

    public boolean validoPantallaFormulario() {
        boolean result = false;
        if (bookingView.validoPantallaFormulario()!= null){result = true;}
        return result;
    }
}
