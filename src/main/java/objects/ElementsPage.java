package objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends AbstractPageObject{
    private final By buttons = By.xpath("(//*[@id='item-4'])[1]");
    private final By clickMe = By.xpath("(//*[@class='mt-4'])[2]/button");
    private final By message = By.xpath("//*[@id=\"dynamicClickMessage\"]");
    private final By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div");

    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    @Step("The user clicks on the Buttons element")
    public void clickButtons(){
        adsScrollHandler(widgets);
        getElement(buttons, 10).click();
    }

    @Step("The user clicks on the ClickMe button")
    public void clickOnClickMe(){
        getElement(clickMe).click();
    }

    @Step("Getting message after clicking on the ClickMe button")
    public String getMessage(){
        return getElement(message).getText();
    }
}
