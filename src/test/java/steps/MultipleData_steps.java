package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class MultipleData_steps {
    @Given("User goes to amazon")
    public void user_goes_to_amazon() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("User verifies following search departments")
    public void user_verifies_following_search_departments(List<String> option) {

        WebElement dropDown = Driver.getDriver().findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select dropD = new Select(dropDown);
        List<WebElement> searchOptions = dropD.getOptions();

        for(int i = 0; i > option.size();i++){
            for(int j = 0; j > searchOptions.size(); j++){
                Assert.assertTrue(option.get(i).equalsIgnoreCase(searchOptions.get(j).getText()));
            }
        }

    }

    @Then("User closes the amazon")
    public void user_closes_the_amazon() {
        Driver.getDriver().close();
    }

}