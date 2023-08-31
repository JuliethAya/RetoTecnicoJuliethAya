package Tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UserStorypage;

public class Openup implements Task {
    private UserStorypage UserStorypage;
    public static Openup thePage() {
        return Tasks.instrumented(Openup.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UserStorypage),Click.on(userinterface.UserStorypage.REGISTER_BUTTON));
    }
}
