package Tasks;

import model.RegistrationData;
import userinterface.DataEntryStepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Dataentrystepthree implements Task {

    private List<RegistrationData> data;

    public Dataentrystepthree(List<RegistrationData> data) {
        this.data = data;
    }

    public static Dataentrystepthree thepage(List<RegistrationData> data) {

        return Tasks.instrumented(Dataentrystepthree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Select your computer's operating system ").into(DataEntryStepThree.SELECT_COMPUTER),
                Enter.theValue("Select your computer's operating system version").into(DataEntryStepThree.SELECT_VERSION),
                Enter.theValue("Select your computer language").into(DataEntryStepThree.SELECT_LANGUAGE),
                Enter.theValue("select your cell phone brand").into(DataEntryStepThree.SELECT_DEVICE),
                Enter.theValue("select your cell phone model").into(DataEntryStepThree.SELECT_MODEL),
                Enter.theValue("select the operating system of your cell phone").into(DataEntryStepThree.SELECT_OS),
                Click.on(DataEntryStepThree.NEXT_BUTTONS)
        );
    }
}
