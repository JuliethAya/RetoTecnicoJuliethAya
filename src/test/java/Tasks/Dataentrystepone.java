package Tasks;

import model.RegistrationData;
import userinterface.DataEntryStepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;


public class Dataentrystepone implements Task {
    private List<RegistrationData> data;

    public Dataentrystepone(List<RegistrationData> data) {
        this.data = data;
    }


    public static Dataentrystepone thepage(List<RegistrationData> data) {
        return Tasks.instrumented(Dataentrystepone.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Enter your name").into(DataEntryStepOne.INPUT_FIRSTNAME),
                Enter.theValue("Enter your lastname").into(DataEntryStepOne.INPUT_LASTNAME),
                Enter.theValue("Enter your Email Address").into(DataEntryStepOne.INPUT_EMAILADDRESS),
                Enter.theValue("Enter your Birth Month").into(DataEntryStepOne.SELECT_BIRTHMONTH),
                Enter.theValue("Enter your Birth Day").into(DataEntryStepOne.SELECT_BIRTHDAY),
                Enter.theValue("Enter your Birth Year").into(DataEntryStepOne.SELECT_BIRTHYEAR),
                Click.on(DataEntryStepOne.NEXT_BUTTON)
        );
    }
}
