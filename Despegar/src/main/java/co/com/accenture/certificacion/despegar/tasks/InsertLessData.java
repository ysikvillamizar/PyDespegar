package co.com.accenture.certificacion.despegar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.accenture.certificacion.despegar.userinterfaces.FlightDespegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertLessData implements Task{
	
	private String city;
	private String date;
	
		
	public InsertLessData(String city, String date) {
		super();
		this.city = city;
		this.date = date;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FlightDespegar.FLIGHT), Click.on(FlightDespegar.SOURCE_CITY),
				Enter.theValue(city).into(FlightDespegar.SOURCE_CITY),
				Click.on(FlightDespegar.CHOOSE_SOURCE_CITY),
				Click.on(FlightDespegar.DEPARTURE_DATE),
				Click.on(FlightDespegar.CHOOSE_DAY_DEPARTURE.of(date)),
				Click.on(FlightDespegar.SEARCH));
		
	}
	
	public static InsertLessData withTheFollowingData(String city, String date) {
		return instrumented(InsertLessData.class,city,date);
	}
	
	

}
