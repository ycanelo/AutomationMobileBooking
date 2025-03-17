package com.bdd.views;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BookingView extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView")
    private WebElement menuSearch;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Enter your destination\"]")
    private WebElement btnShowDestino;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Enter destination\"]")
    private WebElement txtEnterDestino;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]")
    private WebElement itemDestino;

    //ejemplo del 20 al 31 marzo
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Thursday, 20 March 2025\"]")
    private WebElement fechaInicio;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Monday, 31 March 2025\"]")
    private WebElement fechaFin;

    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    private WebElement btnConfirmDates;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Accommodation search box\"]//following-sibling::android.widget.Button[2])[2]")
    private WebElement btnSelectRoomsGuests;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.booking:id/group_config_rooms_count\"]//following-sibling::android.widget.TextView[@resource-id=\"com.booking:id/bui_input_stepper_value\"]")
    private WebElement lblNumberRooms;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Increase\"])[1]")
    private WebElement btnIncreaseRooms;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Decrease\"])[1]")
    private WebElement btnDecreaseRooms;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.booking:id/group_config_adults_count\"]//following-sibling::android.widget.TextView[@resource-id=\"com.booking:id/bui_input_stepper_value\"]")
    private WebElement lblNumberAdults;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Increase\"])[2]")
    private WebElement btnIncreaseAdults;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Decrease\"])[2]")
    private WebElement btnDecreaseAdults;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.booking:id/group_config_adults_count\"]//following-sibling::android.widget.TextView[@resource-id=\"com.booking:id/bui_input_stepper_value\"]")
    private WebElement lblNumberChildren;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Increase\"])[3]")
    private WebElement btnIncreaseChildren;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Decrease\"])[3]")
    private WebElement btnDecreaseChildren;

    @AndroidFindBy(id = "com.booking:id/bui_input_container_background")
    private WebElement lstChildAge;

    @AndroidFindBy(className = "android.widget.NumberPicker")
    private WebElement pickerAges;

    @AndroidFindBy(xpath = "(/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.EditText)[@text = '5 years old']")
    private WebElement btnNumberAges;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement btnOkChildAge;

    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    private WebElement btnApply;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Accommodation search box\"]/android.view.View/android.widget.Button")
    private WebElement btnSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'propert')]")
    private WebElement lblResults;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@resource-id,'sr_list')]//following-sibling::android.view.View[contains(@content-desc,'reviews')])[2]")
    private WebElement itemResults;

    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private WebElement btnSelectRooms;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Select')])[1]")
    private WebElement itemFirstRoom;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Remove this room from your selection\"]")
    private WebElement imgRemoveItemSelected;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Next step')]")
    private WebElement btnNextStep;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'First Name')]")
    private WebElement lblFormIndicator;

    //form fields

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'First Name')]/following-sibling::android.widget.EditText")
    private WebElement txtFirstName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Last Name')]/following-sibling::android.widget.EditText")
    private WebElement txtLastName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]/following-sibling::android.widget.EditText")
    private WebElement txtEmail;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Address')]/following-sibling::android.widget.EditText)[2]")
    private WebElement txtAddress;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Zip Code')]/following-sibling::android.widget.EditText")
    private WebElement txtZipCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'City')]/following-sibling::android.widget.EditText")
    private WebElement txtCity;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Country/Region required\"]")
    private WebElement lstCountries;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Search for country\"]/parent::android.widget.EditText")
    private WebElement txtSearchCountry;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Peru\"]")
    private WebElement itemCountryResult;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mobile Phone')]/following-sibling::android.widget.EditText")
    private WebElement txtPhone;

    //resume
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mar 20')]")
    private WebElement lblFechaInicio;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mar 31')]")
    private WebElement lblFechaFin;

    //finish booking
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Final step')]")
    private WebElement btnFinalStep;

    @AndroidFindBy(xpath = "com.booking:id/new_credit_card_number_edit")
    private WebElement txtCardNumber;

    @AndroidFindBy(xpath = "com.booking:id/new_credit_card_expiry_date_edit")
    private WebElement txtExpirationDate;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Book now')]")
    private WebElement btnBookNow;

    @AndroidFindBy(xpath = "//")
    private WebElement lblMensaje;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'No properties')]")
    private WebElement lblSinResultados;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Credit Card Information')]")
    private WebElement lblDatosDePago;

    public WebElement validoHomeBooking() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(menuSearch));
    }

    public void ingresarDestino(String sDestino) {
        btnShowDestino.click();
        txtEnterDestino.sendKeys(sDestino);
        itemDestino.click();
    }

    public void seleccionarFechas(String sFechaInicio, String sFechaFin) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(fechaInicio));
        fechaInicio.click();
        fechaFin.click();
        btnConfirmDates.click();
    }

    public void seleccionarNroHabitacionesYNroAdultos(String nHabitaciones, String nAdultos) {
        btnSelectRoomsGuests.click();
        //nro Habitaciones
        String sHabitacionesApp = lblNumberRooms.getText();
        int nHabitacionesApp = Integer.parseInt(sHabitacionesApp);
        int sHabitacionesASeleccionar = Integer.parseInt(nHabitaciones);
        for (int i = 0; i < sHabitacionesASeleccionar; i++) {
            if (nHabitacionesApp == sHabitacionesASeleccionar) {
                System.out.println("Nro de Habitaciones seleccionadas");
                break;
            } else if (nHabitacionesApp < sHabitacionesASeleccionar) {
                btnIncreaseRooms.click();
                nHabitacionesApp++;
            } else {
                btnDecreaseRooms.click();
                nHabitacionesApp--;
            }
        }
        //nro Rooms
        String sAdultosApp = lblNumberAdults.getText();
        int nAdultosApp = Integer.parseInt(sAdultosApp);
        int sAdultosASeleccionar = Integer.parseInt(nAdultos);

        for (int i = 0; i < sAdultosASeleccionar; i++) {
            if (nAdultosApp == sAdultosASeleccionar) {
                System.out.println("Nro de Adultos seleccionados");
                break;
            } else if (nAdultosApp < sAdultosASeleccionar) {
                btnIncreaseRooms.click();
                nAdultosApp++;
            } else {
                btnDecreaseRooms.click();
                nAdultosApp--;
            }
        }
    }

    public void seleccionarNroNinosYEdad(String nNinos, String nEdad) {
        //nro Niños
        String sNinosApp = lblNumberChildren.getText();
        int nNinosApp = Integer.parseInt(sNinosApp);
        int sNinosASeleccionar = Integer.parseInt(nNinos);

        for (int i = 0; i < sNinosASeleccionar; i++) {
            if (nNinosApp == sNinosASeleccionar) {
                System.out.println("Nro de Habitaciones seleccionadas");
                break;
            } else if (nNinosApp < sNinosASeleccionar) {
                btnIncreaseRooms.click();
                nNinosApp++;
            } else {
                btnDecreaseRooms.click();
                nNinosApp--;
            }
        }

        //edad Niños
        lstChildAge.click();
        pickerAges.click();
        btnNumberAges.click();
        btnOkChildAge.click();
        btnApply.click();
        System.out.println("Edad de niño seleccionada");
    }

    public void clicEnBuscar() {
        btnSearch.click();
    }

    public WebElement validoResultados() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(lblResults));
    }

    public void seleccionoItemDeLosResultados(String nItem) {
        itemResults.click();
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(btnSelectRooms));
        System.out.println("Item de resultados - seleccionado");
    }

    public void seleccionoOpcionDeReserva(String sOpcionReserva) {
        btnSelectRooms.click();
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(itemFirstRoom));
        itemFirstRoom.click();
        wait.until(ExpectedConditions.elementToBeClickable(imgRemoveItemSelected));
        btnNextStep.click();
    }

    public void completoFormulario(String sNombre, String sApellido, String sEmail, String sPais, String sCelular) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(txtFirstName));

        txtFirstName.sendKeys(sNombre);
        txtLastName.sendKeys(sApellido);
        txtEmail.sendKeys(sEmail);
        lstCountries.click();
        txtSearchCountry.sendKeys(sPais);
        itemCountryResult.click();
        txtPhone.sendKeys(sCelular);
        btnNextStep.click();
    }

    public void validoReserva() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(lblFechaInicio));
        wait.until(ExpectedConditions.elementToBeClickable(lblFechaFin));
    }

    public void ingresoTarjetaDePago(String sNroTarjeta, String sFechaCaducidad) {
        txtCardNumber.sendKeys(sNroTarjeta);
        txtExpirationDate.sendKeys(sFechaCaducidad);
    }

    public void clicEnReservar() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(btnBookNow));
        btnBookNow.click();
    }

    public void validoReservaExitosa() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
    }

    public void validoBusquedaSinResultados() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lblSinResultados));
    }

    public WebElement validoPantallaTipoDePago() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(lblDatosDePago));
    }

    public WebElement validoPantallaFormulario() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver()).withTimeout(Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(txtFirstName));
    }
}
