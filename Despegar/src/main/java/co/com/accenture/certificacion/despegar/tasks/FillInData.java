package co.com.accenture.certificacion.despegar.tasks;
import co.com.accenture.certificacion.despegar.models.FillData;
import co.com.accenture.certificacion.despegar.integrations.Conexion;

import co.com.accenture.certificacion.despegar.userinterfaces.SelectTheRate;
import co.com.accenture.certificacion.despegar.utils.LoadDataTxt;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.sql.SQLException;

import com.mysql.cj.log.Log;

public class FillInData implements Task {

	 private FillData data;
	    private Conexion con;
	//private LoadDataTxt loaddata= new LoadDataTxt();


	    public FillInData(FillData data, Conexion con) {
	 		
	 		this.data = data;
	 		this.con = con;
	 	}
	    
		@Override
		public <T extends Actor> void performAs(T actor) {
			
			//try {
				data.setNombre((String) con.getDatos().get(0));
				data.setApellido((String) con.getDatos().get(1));
		        data.setCedula((String)con.getDatos().get(2));
		 	   System.out.print(("NOMBRE: " +(String) con.getDatos().get(0)));
		 	  System.out.print(("APELLIDO: " +(String) con.getDatos().get(1)));
		 	  System.out.print(("CEDULA: " +(String) con.getDatos().get(2)));
			//}
			/* catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				*/
		 	 actor.attemptsTo(Click.on(SelectTheRate.NOMBRE),
						Enter.theValue(data.getNombre()).into(SelectTheRate.NOMBRE),
						Click.on(SelectTheRate.APELLIDO),
						Enter.theValue(data.getApellido()).into(SelectTheRate.APELLIDO),
								Click.on(SelectTheRate.CEDULA),
						Enter.theValue(data.getCedula()).into(SelectTheRate.CEDULA),
						//sam.attemptsTo(SelectFromOptions.byVisibleText("Paris").from(SELECT_CITY));
						//SelectFromOptions.byVisibleText("Colombia").from(SelectTheRate.COUNTRY),
						Click.on(SelectTheRate.COUNTRY),
						Click.on(SelectTheRate.DATE_DAY),
						Click.on(SelectTheRate.DATE_MONTH),
						Click.on(SelectTheRate.DATE_YEAR),
						Click.on(SelectTheRate.BUTTON_BUY));
		 	  
				}

		//
		
		 //actor.wasAbleTo(WaitSeconds.inThePage(4), Scroll.to(InsertInformation.NOMBRE),Click.on(InsertInformation.NOMBRE),
			//		/*WaitSeconds.inThePage(4) */Enter.theValue(log.getName()).into(InsertInformation.NOMBRE));


	public static FillInData withTheInformation(FillData data, Conexion con) {
		return instrumented(FillInData.class,data,con);
	}
		    
	    
	    
	    
	/*@Override
	public <T extends Actor> void performAs(T actor) {
		//String[] file= loaddata.leerTxt();
		
		actor.attemptsTo(Click.on(SelectTheRate.NOMBRE),
							Enter.theValue(file[0]).into(SelectTheRate.NOMBRE),
							Click.on(SelectTheRate.APELLIDO),
							Enter.theValue(file[1]).into(SelectTheRate.APELLIDO),
							Click.on(SelectTheRate.CEDULA),
							Enter.theValue(file[2]).into(SelectTheRate.CEDULA),
							Click.on(SelectTheRate.BUTTON_BUY));
		
		
	}
	*/
	



// public static Login at(LoginModel log, Conexion con){
     //   return instrumented(Login.class, log, con);
    //}
	
	

	/*
	 * public class Login implements Task {
    private LoginModel data;
    private Conexion con;

    public Login(LoginModel data, Conexion con){
        this.data = data;
        this.con = con;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
         System.out.println("Usuario " + (String)  con.getCredenciales().get(0));
                data.setUsername((String) con.getCredenciales().get(0));
                data.setPassword((String) con.getCredenciales().get(1));

                actor.wasAbleTo(WaitUntil.the(TwHomePage.USERNAME, isEnabled()),
                        Enter.theValue(data.getUsername()).into(TwHomePage.USERNAME).thenHit(Keys.TAB),
                        Enter.theValue(data.getPassword()).into(TwHomePage.PASSWORD).thenHit(Keys.ENTER),
                        //Click.on(TwMainPage.TWEET),
                        // Enter.theValue("Lunes de actitud positiva.").into(TwMainPage.TEXT_BOX), //thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.ENTER)
                        // Click.on(TwMainPage.TWEETEAR),
                        // WaitUntil.the(TwMainPage.SMALL_USER_ICON, isEnabled()),
                        // Click.on(TwMainPage.SMALL_USER_ICON),
                        // WaitUntil.the(TwMainPage.TWEET_OPTION, isEnabled()),
                        //Scroll.to(TwMainPage.TWEET_OPTION),
                        //Click.on(TwMainPage.TWEET_OPTION),
                        // Click.on(TwMainPage.DELETE_TWEET_OPTION),
                        //Click.on(TwMainPage.DELETE_TWEET)
                        WaitUntil.the(TwMainPage.START, isEnabled())
                );
    }

    public static Login at(LoginModel log, Conexion con){
        return instrumented(Login.class, log, con);
    }
}

	 * 
	 * 
	 */
	
	
}
