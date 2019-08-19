package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EtsyHomePage;
import utilities.Config;
import utilities.Driver;

public class Eatsy_steps {
    EtsyHomePage etsyHomePage=new EtsyHomePage();


    @Given("User is on Etsy Homepage")
    public void user_is_on_Etsy_Homepage() {
        Driver.getDriver().get(Config.getProperty("etsyURL"));

    }
    /*
    TC#24: Etsy Search Functionality Title Verification
    1.User is on https://www.etsy.com
    2.User types Wooden Spoon in the search box
    3.User clicks search button
    4.User sees Wooden Spoon is in the titleNote:
    Follow POM
     */

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsyHomePage.searchBox.sendKeys(string);

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyHomePage.searchBox.click();
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=string+" | Etsy";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));

    }



}
