package userinterface;


import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UserRegistrationPage extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("This object allows you to enter the user registration form.")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target SETUP_BUTTON = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/i"));
}
