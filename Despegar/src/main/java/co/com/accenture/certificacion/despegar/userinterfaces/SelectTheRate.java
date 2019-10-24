package co.com.accenture.certificacion.despegar.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheRate extends PageObject{

	public static final Target NOMBRE = Target.the("Select the name").locatedBy("//*[@class='input-tag traveler-first-name ng-untouched ng-pristine ng-invalid']");
			//.located(By.id("dpq8eyo84qlvly2445411b"));
	public static final Target APELLIDO = Target.the("Select the last name").locatedBy("//*[@class='input-tag traveler-last-name ng-untouched ng-pristine ng-invalid']");
			//.located(By.id("s0ziiokzjprzbb0h5aaq8g"));
	public static final Target CEDULA= Target.the("Select the id").locatedBy("//*[@class='input-tag traveler-identification-number ng-untouched ng-pristine ng-invalid']");
	public static final Target COUNTRY= Target.the("Select the resident country").locatedBy("//div[@class='ms-bottom mm-bottom']//select[@class='select-tag traveler-nationality ng-untouched ng-pristine ng-valid']//option[@value='CO'][contains(text(),'Colombia')]");
	public static final Target DATE_DAY= Target.the("select day born").locatedBy("//div[@class='eva-3-select -md eva-3-validation -top-left']//div[@class='select-container']//div[@class='ms-bottom mm-bottom']//select[@class='select-tag traveler-birthday-day ng-untouched ng-pristine ng-invalid']//option[@value='16'][contains(text(),'16')]");
	public static final Target DATE_MONTH= Target.the("select month born").locatedBy("//div[@class='eva-3-select -md eva-3-validation -top-left']//div[@class='select-container']//div[@class='ms-bottom mm-bottom']//select[@class='select-tag traveler-birthday-month ng-untouched ng-pristine ng-invalid']//option[@value='6'][contains(text(),'6')]");
	public static final Target DATE_YEAR=Target.the("select yeart born").locatedBy("//div[@class='eva-3-select -md eva-3-validation -top-left']//div[@class='select-container']//div[@class='ms-bottom mm-bottom']//select[@class='select-tag traveler-birthday-year ng-untouched ng-pristine ng-invalid']//option[@value='1991'][contains(text(),'1991')]");
	public static final Target FEMALE= Target.the("select genre").locatedBy("//*[@class='chk-radio-label radio-label eva-3-p']");
			//.located(By.id("traveler-identification-number-0"));
	public static final Target BUTTON_BUY= Target.the("Select on buy button").locatedBy("//*[@class='eva-3-btn -md -secondary']");
			//.located(By.id("buy-button")); 
			//.locatedBy("//*[@class='select-tag traveler-nationality ng-pristine ng-valid ng-touched']");
			//.locatedBy("//*[@class='select-tag traveler-nationality ng-untouched ng-pristine ng-valid']");
	public static final Target TEXTO= Target.the("text element").locatedBy("//span[contains(text(),'Elige la tarjeta con la que quieres pagar')]");
	
	//nombre: //*[@id='dpq8eyo84qlvly2445411b']
	//apellido: //*[@id='s0ziiokzjprzbb0h5aaq8g']
	//cedula: //*[@id='traveler-identification-number-0']
	//boton comprar: //*[@id='buy-button']
}
//("//div[@class='ms-bottom mm-bottom']//select[@class='select-tag traveler-nationality ng-untouched ng-pristine ng-valid']//option[@value='CO'][contains(text(),'Colombia')]");
//eva-3-h4 -eva-3-tc-gray-0 ..............Antes de finalizar revisá los datos ingresados
////*[@id="traveler-nationality-0"]/option[43]
//.locatedBy("//div[@class='_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show']//div[@class='_dpmg2--month _dpmg2--o-5']//span[@class='_dpmg2--date _dpmg2--available _dpmg2--weekend']//span[@class='_dpmg2--date-number'][contains(text(),'{0}')]");
//card-not-selected-message  
//select-tag traveler-nationality ng-untouched ng-pristine ng-valid

////*[@class="input-tag traveler-first-name ng-pristine ng-invalid ng-touched"]
//input-tag traveler-first-name ng-untouched ng-pristine ng-invalid nombre
//input-tag traveler-last-name ng-untouched ng-pristine ng-invalid apell
//input-tag traveler-identification-number ng-untouched ng-pristine ng-invalid  ced
//y9inzq78lbw7thcglvzkl