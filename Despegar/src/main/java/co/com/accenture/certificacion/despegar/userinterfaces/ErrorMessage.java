package co.com.accenture.certificacion.despegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ErrorMessage extends PageObject{
	
	public static final Target ERROR_CITY = Target.the("Show the error message").locatedBy("//*[@class='validation-msg sbox-bind-show-error-tooltip-segment-1-destination-empty']");
	public static final Target ERROR_DATE = Target.the("Show the error message").locatedBy("//*[@class='validation-msg']");
	
	
	

}
