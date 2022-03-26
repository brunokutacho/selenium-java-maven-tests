package poo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class Maps {
	
	private WebElement wait;
	
	private final By searchInput = By.id("searchboxinput");
    private final By searchButton = By.id("searchbox-searchbutton");
    private final By directions = By.xpath("//button[@jsaction='pane.placeActions.directions;keydown:pane.placeActions.directions']");
    private final By headline = By.xpath("//span[normalize-space()='Dublin']");
    private final By destination = By.xpath("//div[@id='directions-searchbox-1']//input");
	
    public By getSearchInput() {
		return searchInput;
	}

	public By getSearchButton() {
		return searchButton;
	}

	public By getDirections() {
		return directions;
	}

	public By getHeadline() {
		return headline;
	}

	public By getDestination() {
		return destination;
	}
	
	public void searchGoogleMaps(WebDriver driver, String search) {
		waitUntil(driver, getSearchInput());
		driver.findElement(getSearchInput()).sendKeys(search);

		waitUntil(driver, getSearchButton());
		driver.findElement(getSearchButton()).click();
	}
	
	public void waitUntil(WebDriver driver, By by) {
		wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
	}
}