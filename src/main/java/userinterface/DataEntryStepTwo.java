package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



    public class DataEntryStepTwo extends PageObject {
        public static final Target INPUT_CITY = Target.the("This object is used to enter the name")
                .located(By.xpath("//*[@id=\"city\"]"));

        public static final Target INPUT_CODE = Target.the("This object is used to enter the name")
                .located(By.xpath("//*[@id=\"zip\"]"));

        public static final Target SELECT_COUNTRY = Target.the("This object is used to enter the name")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/i"));

        public static final Target NEXT_BUTTOND = Target.the("This object is used to enter the name")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/i"));

    }

