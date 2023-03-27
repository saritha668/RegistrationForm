package registration;

import registrationsteps.steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class corporateregister  {

    @Steps
    steps A;

    @Managed (driver = "firefox")
    WebDriver browser;

    @Test
    public void registration(){
        A.onregisterpage();
        A.registerascorporate();
        A.completeregistration();
    }

}



