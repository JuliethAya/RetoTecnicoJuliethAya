package Tasks;

import model.RegistrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UserRegistrationPage;

import java.util.List;

public class Completeregister implements Task {
    private List<RegistrationData> data;

    public Completeregister(List<RegistrationData> data) {
        this.data = data;
    }


    public static Completeregister thepage(List<RegistrationData> data) {
        return Tasks.instrumented(Completeregister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UserRegistrationPage.SETUP_BUTTON)
        );
    }
}
