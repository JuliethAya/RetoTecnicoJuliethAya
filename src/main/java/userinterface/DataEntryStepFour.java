package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataEntryStepFour extends PageObject {
    public static final Target INPUT_PASS = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"password\"]"));

    public static final Target INPUT_CONFPASS = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));

    public static final Target CHECK_STAY = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_USE = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY= Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
}
