package userinterface;


import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UserRegistrationPage extends PageObject {

    public static final Target SETUP_BUTTON = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/i"));
}
