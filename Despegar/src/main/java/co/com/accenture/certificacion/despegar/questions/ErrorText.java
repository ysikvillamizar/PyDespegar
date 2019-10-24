package co.com.accenture.certificacion.despegar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ErrorText implements Question<String> {
	
	 private Target target;

	public ErrorText(Target target) {
		
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return  Text.of(target).viewedBy(actor).asString();
	}
	 
	public static ErrorText ofFollowingTarget(Target target) {
        return new ErrorText(target);
    }


	   
}
