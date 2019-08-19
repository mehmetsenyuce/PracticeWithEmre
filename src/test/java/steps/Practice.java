package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Practice {

    @Test
    public void practice(){
        Driver.getDriver().get("https://www.starbucks.com/rewards/?utm_source=landingpage&utm_medium=referral&utm_campaign=sr-acq-wifi");
        WebElement picture = Driver.getDriver().findElement(By.cssSelector("img[class='block flex-shrink-none size12of12']"));

        System.out.println(picture.getAttribute("alt"));
        System.out.println(picture.getAttribute("src"));
        System.out.println(picture.getAttribute("class"));

        Driver.getDriver().get("https://www.youtube.com/");


    }
}
