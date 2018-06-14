package coreFunctions;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import pageObjects.ParentPage;

public class BeforeAfter {

    @BeforeScenario
    public void intializeBrowser() {
        ParentPage.setPageDriver(DriverFactory.getDriver());
    }

    @AfterScenario
    public void endTheBrowser() {
        WebDriverPool.getWebDriver().quit();
    }

}
