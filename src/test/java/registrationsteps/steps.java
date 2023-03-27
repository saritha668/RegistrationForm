package registrationsteps;

import registrationlocators.locators;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Objects;

public class steps {

    private locators RegisterPage;// Create private class for locators
    // Below is step to launch register page
    @Step
    public void onregisterpage(){
        RegisterPage.open();
    }
    // Below is step to register as education institution
    @Step
    public void registeraseducation() {

            RegisterPage.education();
    }
    // Below is step to register as individual
    @Step
    public void registerasindividual() {
        RegisterPage.individual();
    }
    // Below is step to register as corporate
    @Step
    public void registerascorporate() {
        RegisterPage.corporate();
    }
    // Below is step to register as partner
    @Step
    public void registeraspartner() {
        RegisterPage.partnership();
    }

    // Below is step to register as trader
    @Step
    public void registerastrader() {
        RegisterPage.trader();
    }

    @Step
    public void completeregistration(){
        Assert.assertTrue(RegisterPage.registrationcompleted().equals("Notify Me"));

    }

    @Step
    public void negativeregistration(){
        Assert.assertTrue(RegisterPage.negative().equals("Please enter correct information!"));

    }
}