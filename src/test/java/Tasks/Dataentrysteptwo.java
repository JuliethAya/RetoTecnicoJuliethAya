package Tasks;




import model.RegistrationData;
import userinterface.DataEntryStepTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;


public class Dataentrysteptwo implements Task {
    private List<RegistrationData> data;

    public Dataentrysteptwo(List<RegistrationData> data) {
        this.data = data;
    }
    public static Dataentrysteptwo thepage(List<RegistrationData> data) {

        return Tasks.instrumented(Dataentrysteptwo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Enter your City").into(DataEntryStepTwo.INPUT_CITY),
                Enter.theValue("Enter your Code").into(DataEntryStepTwo.INPUT_CODE),
                Enter.theValue("Enter your Country").into(DataEntryStepTwo.SELECT_COUNTRY),
                Click.on(DataEntryStepTwo.NEXT_BUTTOND)
        );
    }
}