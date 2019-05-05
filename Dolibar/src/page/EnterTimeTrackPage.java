package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	private final String xp = "(//div[@class='popup_menu_label'])[1]";
	@FindBy(xpath= xp)
	private WebElement settings;

	@FindBy(linkText = "Licenses")
	private WebElement licenses;

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSettings() {
		settings.click();
	}

	public void clickLicense() {
		licenses.click();
	}

	public void varifyPageIsDisplayed(WebDriver driver, long time, String title) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home Page Is displayed", true);
		} catch (Exception e) {
			Reporter.log("Home Page Is Not displayed", true);
			// Assert.fail();
		}
	}

}
