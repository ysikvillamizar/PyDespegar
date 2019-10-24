package co.com.accenture.certificacion.despegar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certificacion.despegar.integrations.Conexion;
import co.com.accenture.certificacion.despegar.models.FillData;
import co.com.accenture.certificacion.despegar.questions.ErrorText;
import co.com.accenture.certificacion.despegar.questions.PreviouslyEntered;
import co.com.accenture.certificacion.despegar.tasks.FillInData;
import co.com.accenture.certificacion.despegar.tasks.InsertLessData;
import co.com.accenture.certificacion.despegar.tasks.InsertTheData;
import co.com.accenture.certificacion.despegar.tasks.OpenDespegar;
import co.com.accenture.certificacion.despegar.userinterfaces.DespegarHome;
import co.com.accenture.certificacion.despegar.userinterfaces.ErrorMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SelectTheFlightStepDefinition extends PageObject {

	@Managed(driver = "chrome")
	public WebDriver herBrowser;
	private Actor jessica = Actor.named("Jessica");
	private DespegarHome despegarpage;
	private Conexion conection;
	private FillData data;
	private FillInData fillindata;

	@Before
	public void setUp() {
		jessica.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^that Jessica wants to look for a one way flight$")
	public void thatJessicaWantsToLookForAOneWayFlight() throws Throwable {
		// ingresar a la pagina,
		jessica.wasAbleTo(OpenDespegar.on(despegarpage));
		//theActorInTheSpotlight().wasAbleTo(Navigate.in(OptionPage.Trivago));
	}

	@When("^She insert the data of the flight$")
	public void sheInsertTheDataOfTheFlight(List<List<String>> data) throws Throwable {
		// insertar los datos
		jessica.attemptsTo(InsertTheData.inThePage(data));
		// theActorInTheSpotlight().attemptsTo(InsertDataOfFlight.inThePage(datos));

	}

	@And("^She fill in her information$")
	public void sheFillInHerInformation() throws Throwable {
		jessica.attemptsTo(FillInData.withTheInformation(new FillData(), new Conexion()));
		//karen.attemptsTo(Login.at(new LoginModel(), new Conexion()));
		
	}

	@Then("^She should see comprar on screen$")
	public void sheShouldSeeComprarOnScreen() throws Throwable {
		jessica.should(seeThat(PreviouslyEntered.data()));
		// jessica.should(seeThat(TheText.ofFollowingTarget(VisibleText.TITLE), containsString(personas)));
	}

	//ejecutar gradle agregate en carpeta de proyecto para visualizar report
	
	//error message
	 @When("^she insert (.+) and (.+) of the flight$")
	    public void sheInsertAndOfTheFlight(String origincity, String date) throws Throwable {
	        jessica.attemptsTo(InsertLessData.withTheFollowingData(origincity, date));
	    }

	    @Then("^validate the title (.*) on website$")
	    public void validateTheTitleIngresaUnDestinoOnWebsite(String error) throws Throwable {
	    	jessica.should(seeThat(ErrorText.ofFollowingTarget(ErrorMessage.ERROR_CITY), containsString(error)));
	    }
}



