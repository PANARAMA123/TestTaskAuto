package casino.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CasinoMainPage {
    private WebDriver driver;
    public static WebDriverWait wait;
    @FindBy (className = "register_lnk")
    private WebElement sign_up_button;
    @FindBy (xpath = "//*/input[@placeholder='Email']")
    private WebElement email_input;
    @FindBy (xpath = "//*/input[@placeholder='Password']")
    private WebElement password_input;
    @FindBy (xpath = "//*/input[@placeholder='First name']")
    private WebElement first_name_input;
    @FindBy (xpath = "//*/input[@placeholder='Last name']")
    private WebElement last_name_input;
    @FindBy (id = "m")
    private WebElement male_gender_radio;
    @FindBy (xpath = "//*/input[@placeholder='I agree to ']")
    private WebElement i_agree_checkbox;
    @FindBy (xpath = "//*/input[@placeholder='DD']")
    private WebElement day_of_birth;
    @FindBy (xpath = "//*/input[@placeholder='MM']")
    private WebElement mounth_of_birth;
    @FindBy (xpath = "//*/input[@placeholder='YYYY']")
    private WebElement year_of_birth;
    @FindBy (xpath = "//*/select[@id='user_currency']/option[@label='USD']")
    private WebElement usd_currency;
    @FindBy (xpath = "//*/input[@placeholder='Country']")
    private WebElement country_input;
    @FindBy (xpath = "//*/button[@name='submit']")
    private WebElement submit_button;
    @FindBy (xpath = "//*/input[@placeholder='Personal ID number']")
    private WebElement personal_number_input;
    public CasinoMainPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void registerNewPlayer(int random_postfix) throws InterruptedException {
        sign_up_button.click();
        String email = "darya.dmitrochenko+" + random_postfix + "@gmail.com";
        email_input.sendKeys(email);
        password_input.sendKeys("qwerty12345678/");
        char a = (char) random_postfix;
        first_name_input.sendKeys("First" + a);
        last_name_input.sendKeys("Last" + a);
        male_gender_radio.click();
        i_agree_checkbox.click();
        day_of_birth.sendKeys("11");
        mounth_of_birth.sendKeys("11");
        year_of_birth.sendKeys("1990");
        usd_currency.click();
        personal_number_input.sendKeys("" + random_postfix);
        //country_input.sendKeys("Poland");
        submit_button.click();
        Thread.sleep(10000);
    }

}
