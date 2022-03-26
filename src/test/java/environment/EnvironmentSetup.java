package environment;



import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EnvironmentSetup {

    public static void initWebDriver() throws Exception {
    	ChromeOptions options = new ChromeOptions();
    	
    	URL remote = new URL("http://localhost:4444/wd/hub");

        WebDriver driver = new RemoteWebDriver(remote, options);
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }
}
