package casino.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasinoMainPageAutorizeZone {
    private WebDriver driver;
    @FindBy(xpath = "//*/div[@class='user__name ng-binding']")
    private WebElement player_name;
    public CasinoMainPageAutorizeZone (WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public String getPlayerName() {
        return player_name.getText();
    }

}
