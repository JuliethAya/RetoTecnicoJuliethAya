package Tasks;


import userinterface.UserRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class UserRegistration implements Task {
    public static UserRegistration OnthePage() {
        return Tasks.instrumented(UserRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UserRegistrationPage.REGISTER_BUTTON)
        );
    }
}
