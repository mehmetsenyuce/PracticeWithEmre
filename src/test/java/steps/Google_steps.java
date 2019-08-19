package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class Google_steps {
    @When("User goes to google")
    public void user_goes_to_google() {
        Driver.getDriver().get("https://google.com");
    }

    @When("User searches for {string} on Google")
    public void user_searches_for_on_Google(String name) {
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@name = 'q']"));
        googleSearch.sendKeys(name+ Keys.ENTER);
    }

    @Then("User needs to see {string} in the title page")
    public void user_needs_to_see_in_the_title_page(String name2) {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(name2));

    }

    @When("User searches for {string} on google")
    public void user_searches_for_on_google(String name3) {
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@name = 'q']"));
        googleSearch.sendKeys(name3+Keys.ENTER);


    }

    @Then("user should get {string} in the title")
    public void user_should_get_in_the_title(String string) {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));

    }
    @When("User search for {string},{string}, on google")
    public void user_search_for_on_google(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user")
    public void user() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User shoul see following items")
    public void user_shoul_see_following_items(List<String> items) {

    }}