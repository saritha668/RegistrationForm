package registrationlocators;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://transfermate.io/en/register.asp?")

public class locators extends PageObject {

// Below function will enter common details on signin page
    public void commondetails()
    {

        $(org.openqa.selenium.By.id("country")).selectByIndex(1);
        $(org.openqa.selenium.By.id("first_name")).sendKeys("Saritha");
        $(org.openqa.selenium.By.id("last_name")).sendKeys("Ramadurgam");
        $(org.openqa.selenium.By.id("email")).sendKeys("saritha.rama@gmail.com");
        $(org.openqa.selenium.By.id("__pin_mobile_number_international_dialing_code")).selectByValue("au 61");
        $(org.openqa.selenium.By.id("__pin_mobile_number_mobile_phone")).sendKeys("1234567890");
        $(org.openqa.selenium.By.id("register_terms_of_use_agree_form_input")).click();
        $(org.openqa.selenium.By.id("register_newsletter_and_privacy_policy_agree_input_cell")).click();
        //this will enter captcha value and click on signin button
        //captcha();
    }
     //Function to register as education institution
    public void education() {

        $(org.openqa.selenium.By.id("register_account_type_education")).click();
        commondetails();

    }
    //Function to register as  individual
    public void individual()  {
        $(By.xpath("//*[@id='register_account_type_individual")).click();
        commondetails();
    }
    //Function to register as  corporate
    public void corporate()  {
        $(By.xpath("//*[@id='register_account_type_corporate")).click();
        commondetails();
    }
    //Function to register as  partner
    public void partnership()   {
        $(By.xpath("//*[@id='register_account_type_partnership")).click();
        commondetails();
    }
    //Function to register as  trader
    public void trader() {
        $(By.xpath("//*[@id='register_account_type_sole_trader")).click();
        commondetails();
    }
    //Function to confirm registration
    public String registrationcompleted() {

        return $(By.xpath("//*[@id=\"menu_527_118_28754\"]/span")).getText();

    }
    //Captcha automation
    public void captcha()
        {
        String mathquestionvalue = $("//*[@id=\"cal_captcha_f10_question\"]/span[4]").getText().trim();
        // remove space if exist
        String removespace = mathquestionvalue.replaceAll("\\s+", "");
        // get two numbers
        String[] parts = removespace.split("\\+");
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parts1 = part2.split("\\=");
        String part11 = parts1[0];

        // sum two numbers
        int summation = Integer.parseInt(part1) + Integer.parseInt(part11);

        // Math Captcha value
        $(org.openqa.selenium.By.id("__calc_captcha_text")).sendKeys("" +summation);

        //Click on SignIn button
        $(org.openqa.selenium.By.id("button_subscribe")).click();

    }

    public String negative(){

        $(org.openqa.selenium.By.id("first_name")).sendKeys("S");
        $(org.openqa.selenium.By.id("button_subscribe")).click();
      return $(org.openqa.selenium.By.id("register_first_name_error")).getText();
    }
}