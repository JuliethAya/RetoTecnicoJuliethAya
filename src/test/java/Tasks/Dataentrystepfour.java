package Tasks;


import model.RegistrationData;
import userinterface.DataEntryStepFour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Dataentrystepfour implements Task {
    private List<RegistrationData> data;

    public Dataentrystepfour(List<RegistrationData> data) {
        this.data = data;
    }
    public static Dataentrystepfour thepage(List<RegistrationData> data) {
        return Tasks.instrumented(Dataentrystepfour.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Enter your password").into(DataEntryStepFour.INPUT_PASS),
                Enter.theValue("confirm your password ").into(DataEntryStepFour.INPUT_CONFPASS),
                Enter.theValue("I authorize").into(DataEntryStepFour.CHECK_STAY),
                Enter.theValue("I authorize").into(DataEntryStepFour.CHECK_USE),
                Enter.theValue("I authorize").into(DataEntryStepFour.CHECK_PRIVACY)
        );
    }
}

