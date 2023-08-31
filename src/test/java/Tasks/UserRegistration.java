package Tasks;


import model.RegistrationData;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UserRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;


public class UserRegistration implements Task {
    private userinterface.UserRegistrationPage UserRegistrationPage;

    public static UserRegistration thepage(List<RegistrationData> data) {
        return Tasks.instrumented(UserRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UserRegistrationPage),Click.on(userinterface.UserRegistrationPage.SETUP_BUTTON));
    }
}
