package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataEntryStepOne extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target INPUT_LASTNAME = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"lastName\"]"));

    public static final Target INPUT_EMAILADDRESS = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target SELECT_BIRTHMONTH = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target SELECT_BIRTHDAY = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target SELECT_BIRTHYEAR = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target NEXT_BUTTON = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/i"));
}
