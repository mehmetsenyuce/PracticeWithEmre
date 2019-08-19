package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikiHomePage;
import utilities.Driver;
/*TC#25: Wikipedia Search Functionality Title Verification
1.User is onhttps://www.wikipedia.org
2.User types Steve Jobs in the search box
3.User clickssearch button
4.User sees Steve Jobs is in the title
        */


public class Wiki_steps {
    WikiHomePage wikiHomePage=new WikiHomePage();



    @Given("User is on Wikipedia homepage")
    public void user_is_on_Wikipedia_homepage() {
        Driver.getDriver().get("https://wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String value) {
        wikiHomePage.searchBox.sendKeys(value);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiHomePage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + " - Wikipedia";
        Assert.assertTrue("Wiki title is not matching" , actualTitle.equalsIgnoreCase(expectedTitle));
    }

    //-------------------



    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
        String expectedHeader = mainHeader;
        String actualHeader = wikiHomePage.mainHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
        //Assert.assertEquals(mainHeader, wikiHomePage.mainHeader.getText());
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
        String expectedImageHeader = imageHeader;
        String actualImageHeader = wikiHomePage.imageHeader.getText();

        Assert.assertEquals(expectedImageHeader, actualImageHeader);
    }

}
/*
Background:
	Whatever you put under Background: will be applied to each Scenario in the class
 	-Not the FEATURES
 	-Not the STEPS
 	-IT WILL APPLY TO ALL OF THE SCENARIOS

 */