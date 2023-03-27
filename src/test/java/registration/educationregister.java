package registration;

import registrationsteps.steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class educationregister  {

    @Steps
    steps A;

    @Managed
    WebDriver browser;

    @Test
    public void registration(){
        A.onregisterpage();
        A.registeraseducation();
        //A.completeregistration();

    }

}
