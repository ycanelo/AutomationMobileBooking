@ReservaAppBooking
Feature: Booking App

  @ReservaAppBooking01
  Scenario: Realizar una solicitud exitosa de reserva
    Given cargo el aplicativo de Booking
    And valido que se muestra la pantalla del Home
    When ingreso el destino "Ica"
    And selecciono las fechas de reserva "Thursday, 20 March 2025" y "Monday, 31 March 2025"
    And selecciono la cantidad de habitaciones "1" y de personas adultas "2"
    And selecciono la cantidad de ninos "1" de edad "5"
    And doy clic en el boton Buscar
    And valido los resultados de busqueda
    And selecciono el item "2" de los resultados
    And elijo la habitación y selecciono la opcion de reserva "1"
    And completo los datos de formulario y continuo el flujo nombre "Luis" apellido "Perez" email "luis@gmail.com" pais "Peru" y celular "984719918"
    And verifico los datos de reserva
    And ingreso los datos de tarjeta con numero "4829183938271245" y fecha caducidad "08/25"
    And doy clic en el boton Reservar
    Then valido el mensaje de reserva exitosa

  @ReservaAppBooking02
  Scenario: Validar solicitud fallida de reserva cuando no hay resultados de búsqueda
    Given cargo el aplicativo de Booking
    And valido que se muestra la pantalla del Home
    When ingreso el destino "Pucusana"
    And selecciono las fechas de reserva "Thursday, 20 March 2025" y "Monday, 31 March 2025"
    And selecciono la cantidad de habitaciones "6" y de personas adultas "20"
    And selecciono la cantidad de ninos "1" de edad "5"
    And doy clic en el boton Buscar
    And valido los resultados de busqueda
    Then valido el mensaje de busqueda sin resultados

  @ReservaAppBooking03
  Scenario: Validar solicitud fallida cuando no se completa formulario de datos
    Given cargo el aplicativo de Booking
    And valido que se muestra la pantalla del Home
    When ingreso el destino "Ica"
    And selecciono las fechas de reserva "Thursday, 20 March 2025" y "Monday, 31 March 2025"
    And selecciono la cantidad de habitaciones "1" y de personas adultas "2"
    And selecciono la cantidad de ninos "1" de edad "5"
    And doy clic en el boton Buscar
    And valido los resultados de busqueda
    And selecciono el item "2" de los resultados
    And elijo la habitación y selecciono la opcion de reserva "1"
    Then valido que se mantiene en la pantalla Introducir datos

  @ReservaAppBooking04
  Scenario: Validar solicitud fallida cuando se ingresa tarjeta invalida
    Given cargo el aplicativo de Booking
    And valido que se muestra la pantalla del Home
    When ingreso el destino "Ica"
    And selecciono las fechas de reserva "Thursday, 20 March 2025" y "Monday, 31 March 2025"
    And selecciono la cantidad de habitaciones "1" y de personas adultas "2"
    And selecciono la cantidad de ninos "1" de edad "5"
    And doy clic en el boton Buscar
    And valido los resultados de busqueda
    And selecciono el item "2" de los resultados
    And elijo la habitación y selecciono la opcion de reserva "1"
    And completo los datos de formulario y continuo el flujo nombre "Luis" apellido "Perez" email "luis@gmail.com" pais "Peru" y celular "984719918"
    And verifico los datos de reserva
    And ingreso los datos de tarjeta con numero "4829183938271245" y fecha caducidad "08/25"
    And doy clic en el boton Reservar
    Then valido que se mantiene en la pantalla de Tarjeta de pago
