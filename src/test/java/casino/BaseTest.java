package casino;
import casino.Pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class BaseTest {
    public static WebDriver driver;
    private static CasinoMainPage casinoMainPage;
    private static CasinoMainPageAutorizeZone casinoMainPageAutorizeZone;
    private static String player_name;
    private static int random_postfix;

    @Before
    public void getDriver() {
        driver = new ChromeDriver();
    }
    @Test
    public void newPlayerRegister() throws InterruptedException {
        driver.get("https://s7.casino.softswiss.com");
        random_postfix = new Random().nextInt(65,90);
        Thread.sleep(1000);
        casinoMainPage = new CasinoMainPage(driver);
        casinoMainPage.registerNewPlayer(random_postfix);
        casinoMainPageAutorizeZone = new CasinoMainPageAutorizeZone(driver);
        player_name = casinoMainPageAutorizeZone.getPlayerName();
        Assert.assertEquals("Player has registered","darya.dmitrochenko+" + random_postfix + "@gmail.com", player_name);
    }
    @AfterClass
    public static void tearDown() {
            driver.quit();
    }
}
