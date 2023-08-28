package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataEntryStepThree extends PageObject {

    public static final Target SELECT_COMPUTER = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target SELECT_VERSION = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_LANGUAGE = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));

    public static final Target SELECT_DEVICE = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/i"));

    public static final Target SELECT_MODEL = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/i"));

    public static final Target SELECT_OS = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/i"));

    public static final Target NEXT_BUTTONS = Target.the("This object is used to enter the name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));


}
