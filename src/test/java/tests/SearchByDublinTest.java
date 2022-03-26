package tests;

import environment.EnvironmentSetup;
import environment.RunEnvironment;
import poo.Maps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;


public class SearchByDublinTest {

    private WebDriver driver;
    
    private Maps maps = new Maps();


    @Before
    public void startBrowser() throws Exception {
    	
            EnvironmentSetup.initWebDriver();
            
    }

    @Test
    public void SearchByDublinTest() throws Exception {
    	
        driver = RunEnvironment.getWebDriver();
        driver.get("https://www.google.com/maps");

        //Accept cookies
        Utils.byPassGoogle(driver);

        
        // 1. Type DUBLIN on search box and click on Search button
        maps.searchGoogleMaps(driver, Utils.DUBLIN);
       

        //2. Wait the directions button to load and after that verify left panel has "Dublin" as a headline text
        maps.waitUntil(driver, maps.getHeadline());

        String headText = driver.findElement(maps.getHeadline()).getText();
        
        Assert.assertTrue(headText.contains(Utils.DUBLIN));

        //3. Click in direction button and after assert the value from destination button
        driver.findElement(maps.getDirections()).click();
        maps.waitUntil(driver,maps.getDestination());
        String destinationText = driver.findElement(maps.getDestination()).getAttribute("value");
        
        Assert.assertTrue(destinationText.contains(Utils.DUBLIN));

    }

    @After
    public void tearDown() {
        EnvironmentSetup.shutDownDriver();
    }
}
